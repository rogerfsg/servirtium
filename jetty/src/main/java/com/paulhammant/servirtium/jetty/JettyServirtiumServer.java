package com.paulhammant.servirtium.jetty;

import com.paulhammant.servirtium.InteractionManipulations;
import com.paulhammant.servirtium.Interactor;
import com.paulhammant.servirtium.ServiceMonitor;
import com.paulhammant.servirtium.ServiceResponse;
import com.paulhammant.servirtium.ServirtiumServer;
import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.server.handler.RequestLogHandler;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.xml.XmlConfiguration;
import org.xml.sax.SAXException;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

import static com.paulhammant.servirtium.JsonAndXmlUtilities.prettifyDocOrNot;

public class JettyServirtiumServer extends ServirtiumServer {

    private Server jettyServer;
    private boolean lastCallFailed;

    public JettyServirtiumServer(
            ServiceMonitor monitor,
             int port,
             InteractionManipulations interactionManipulations,
             Interactor interactor) throws Exception {
        super(interactionManipulations, interactor);
//https://stackoverflow.com/questions/23267639/location-of-jetty-xml-in-a-maven-project
        //http://juplo.de/configure-https-for-jetty-maven-plugin-9-0-x/
//        https://www.javatips.net/api/org.eclipse.jetty.server.sslconnectionfactory

//        Resource jetty = Resource.newSystemResource("jetty.xml");
//        Resource jettySsl = Resource.newSystemResource("jetty-ssl.xml");
//        Resource jettyHttps = Resource.newSystemResource("jetty-https.xml");
//        Resource jettyServerHttp = Resource.newSystemResource("jetty-http.xml");

        //mostly copied from http://www.eclipse.org/jetty/documentation/current/embedding-jetty.html
        // === jetty.xml ===

        // Server
        this.jettyServer= new Server();
        // Extra options
        //server.setDumpAfterStart(true);
        //server.setDumpBeforeStop(true);
        //jettyServer.setStopAtShutdown(true);



        // === jetty-https.xml ===
        // SSL Context Factory
        SslContextFactory sslContextFactory = new SslContextFactory();
        //sslContextFactory.setKeyStoreResource(Resource.newSystemResource("cacert"));
        sslContextFactory.setTrustStoreResource(Resource.newSystemResource("jetty.keystore"));
        sslContextFactory.setKeyStorePassword("secret");
        sslContextFactory.setKeyManagerPassword("secret");
        sslContextFactory.setIncludeCipherSuites();
//        sslContextFactory.setTrustStorePassword("secret");

//        sslContextFactory.setEndpointIdentificationAlgorithm("");
//                sslContextFactory.setExcludeCipherSuites(
//                        "SSL_RSA_WITH_DES_CBC_SHA",
//                        "SSL_DHE_RSA_WITH_DES_CBC_SHA",
//                        "SSL_DHE_DSS_WITH_DES_CBC_SHA",
//                        "SSL_RSA_EXPORT_WITH_RC4_40_MD5",
//                        "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA",
//                        "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA",
//                        "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        // SSL HTTP Configuration
        HttpConfiguration https_config = new HttpConfiguration();
        https_config.setSecureScheme("https");
        https_config.setSecurePort(port);
        https_config.setOutputBufferSize(32768);
        https_config.setRequestHeaderSize(8192);
        https_config.setResponseHeaderSize(8192);
        https_config.setSendServerVersion(true);
        https_config.setSendDateHeader(false);
        https_config.addCustomizer(new SecureRequestCustomizer());
        // SSL Connector
        ServerConnector sslConnector = new ServerConnector(jettyServer, new SslConnectionFactory(sslContextFactory, "http/1.1"), new HttpConnectionFactory(https_config));
        sslConnector.setPort(port);
        jettyServer.setConnectors(new Connector[] { sslConnector });


        //createConnector(jettyServer);

        // How the f*** do you turn off Embedded Jetty's logging???
        // Everything I tried (mostly static operations on Log) didn't work.

        jettyServer.setHandler(new AbstractHandler() {

            @Override
            public void handle(String target, org.eclipse.jetty.server.Request baseRequest,
                               HttpServletRequest request, HttpServletResponse response) throws IOException {
                handleExchange(baseRequest, request, response, monitor);
            }
        });
    }
    @SuppressWarnings("squid:S2095")
    private ServerConnector createConnector(final Server server) {
        final SslContextFactory sslContextFactory = new SslContextFactory();

        return new ServerConnector(server,
                new SslConnectionFactory(sslContextFactory, "http/1.1"),
                new HttpConnectionFactory());
    }



    private void handleExchange(Request baseRequest, HttpServletRequest request, HttpServletResponse response,
                                ServiceMonitor monitor) throws IOException {
        //always renew failed, so became local
        boolean failed = false;
        bumpInteractionNum();

        String method = request.getMethod();

        String url = request.getRequestURL().toString();
        final String uri = request.getRequestURI();

        url = (url.startsWith("http://") || url.startsWith("https://"))
                ? url : "http://" + request.getRemoteHost() + ":" + request.getRemotePort() + uri;

        //String clientRequestBody = "";
        List<String> clientRequestHeaders = new ArrayList<>();

        try {

            if (method.equals("CONNECT")) {
                response.getWriter().write("Servirtium does not support CONNECT yet");
                response.setContentType("text/plain");
                response.setStatus(500);
                return;
            }

            Interactor.Interaction interaction = interactor.newInteraction(
                    method, uri, getInteractionNum(), url, getContext());

            monitor.interactionStarted(getInteractionNum(), interaction);

            String clientRequestContentType = request.getContentType();
            if (clientRequestContentType == null) {
                clientRequestContentType = "";
            }

//                    if (isText(contentType)) {
//                        BufferedReader reader = baseRequest.getReader();
//                        clientRequestBody = reader.lines().collect(Collectors.joining("\n"));
//                    } else {
//                        ServletInputStream is = baseRequest.getInputStream();
//                        clientRequestBody = new byte[is.available()];
//
//                    }
//

            final String requestUrl = prepareHeadersAndBodyForService(request, method, url, clientRequestHeaders,
                    interaction, clientRequestContentType, interactionManipulations);

            // INTERACTION
            ServiceResponse serverResponse = interactor.getServiceResponseForRequest(
                    method, requestUrl, clientRequestHeaders,
                    interaction, getLowerCaseHeaders());

            serverResponse = processHeadersAndBodyBackFromService(interaction, serverResponse, interactionManipulations);

            interactor.addInteraction(interaction);

            response.setStatus(serverResponse.statusCode);

            for (String header : serverResponse.headers) {
                int ix = header.indexOf(": ");
                String hdrKey = header.substring(0, ix);
                String hdrVal = header.substring(ix + 2);
                response.setHeader(hdrKey, hdrVal);
            }

            if (serverResponse.contentType != null) {
                response.setContentType(serverResponse.contentType);
            }

            if (serverResponse.body instanceof String) {
                String strBody = (String) serverResponse.body;
                response.setContentLength(strBody.length());
                response.getWriter().write(strBody);
            } else {
                 byte[] bs=(byte[]) serverResponse.body;
                response.setContentLength(bs.length);
                response.getOutputStream().write(bs);
            }

            monitor.interactionFinished(getInteractionNum(), method, url, getContext());
        } catch (AssertionError assertionError) {
            failed = true;
            response.setStatus(500);
            response.setContentType("text/plain");
            response.getWriter().write("JettyServirtiumServer AssertionError: " + assertionError.getMessage());
            monitor.interactionFailed(getInteractionNum(), method, url, assertionError, getContext());
        } catch (Throwable throwable) {
            failed = true;
            response.setStatus(500);
            response.setContentType("text/plain");
            response.getWriter().write("JettyServirtiumServer unexpected Throwable: " + throwable.getMessage());
            monitor.unexpectedRequestError(throwable, getContext());
            throw throwable; // stick your debugger here
        } finally {
            //shutdown e
            interactor.flush(getInteractionNum(), failed);
            lastCallFailed = failed;
            // Inform jetty that this request has now been handled
            baseRequest.setHandled(true);
        }
    }

    private ServiceResponse processHeadersAndBodyBackFromService(Interactor.Interaction interaction,
                                                                 ServiceResponse serviceResponse,
                                                                 InteractionManipulations interactionManipulations) {
        ArrayList<String > newHeaders = new ArrayList<>();
        for (int i = 0; i < serviceResponse.headers.length; i++) {
            String headerBackFromService = serviceResponse.headers[i];
            String potentiallyChangedHeader = interactionManipulations.changeSingleHeaderReturnedBackFromService(i, headerBackFromService);
            if (potentiallyChangedHeader != null) {
                newHeaders.add(potentiallyChangedHeader);
            }
        }
        interactionManipulations.changeAnyHeadersReturnedBackFromService(newHeaders);

        if (serviceResponse.body instanceof String) {
            serviceResponse = serviceResponse.withRevisedBody(
                    interactionManipulations.changeBodyReturnedBackFromServiceForRecording((String) serviceResponse.body));
            // recreate response

            if (shouldHavePrettyPrintedTextBodies()) {
                String body = prettifyDocOrNot((String) serviceResponse.body);
                if (!body.equals(serviceResponse.body)) {
//                                realResponse.headers
                    serviceResponse = serviceResponse.withRevisedBody(body);
                    ArrayList<String> tmp = new ArrayList<>();
                    for (String header : newHeaders) {
                        if (header.startsWith("Content-Length")) {
                            if(body.length() > 0)
                                tmp.add("Content-Length: " + body.length());
                            else
                                tmp.add(header);
                        } else {
                            tmp.add(header);
                        }
                    }
                    newHeaders = tmp;
                }
            }
        }

        serviceResponse = serviceResponse.withRevisedHeaders(newHeaders.toArray(new String[0]));

        interaction.noteResponseHeadersAndBody(serviceResponse.headers, serviceResponse.body, serviceResponse.statusCode,
                serviceResponse.contentType);

        if (serviceResponse.body instanceof String) {
            serviceResponse = serviceResponse.withRevisedBody(
                    interactionManipulations.changeBodyReturnedBackFromServiceForClient((String) serviceResponse.body));
        }

        return serviceResponse;
    }

    private String prepareHeadersAndBodyForService(HttpServletRequest request, String method, String url,
                                                   List<String> clientRequestHeaders, Interactor.Interaction interaction,
                                                   String clientRequestContentType,
                                                   InteractionManipulations interactionManipulations) throws IOException {
        Enumeration<String> hdrs = request.getHeaderNames();

        ServletInputStream is = request.getInputStream();

        Object clientRequestBody = null;

        //if (is.available() > 0) {

            if (isText(clientRequestContentType)) {
                clientRequestBody = null;
                String characterEncoding = request.getCharacterEncoding();
                if (characterEncoding == null) {
                    characterEncoding = "utf-8";
                }
                try (Scanner scanner = new Scanner(is, characterEncoding)) {
                    if(scanner.hasNext()) {
                        clientRequestBody = scanner.useDelimiter("\\A").next();
                    }
                }
                if (shouldHavePrettyPrintedTextBodies() && clientRequestBody != null) {
                    clientRequestBody = prettifyDocOrNot((String) clientRequestBody);
                }
            } else if(is.available() > 0){
                byte[] targetArray = new byte[is.available()];
                is.read(targetArray);
                clientRequestBody = targetArray;
            }
        //}

        while (hdrs.hasMoreElements()) {
            // TODO - make this cater for multiple lines with the same name
            String hdrName = hdrs.nextElement();
            String hdrVal = request.getHeader(hdrName);
            hdrVal = interactionManipulations.headerReplacement(hdrName, hdrVal);
            final String fullHeader = (getLowerCaseHeaders() ? hdrName.toLowerCase() : hdrName) + ": " + hdrVal;
            clientRequestHeaders.add(fullHeader);
            interactionManipulations.changeSingleHeaderForRequestToService(method, fullHeader, clientRequestHeaders);
        }

        interactionManipulations.changeAnyHeadersForRequestToService(clientRequestHeaders);

        if (clientRequestBody instanceof String) {
            clientRequestBody = interactionManipulations.changeBodyForRequestToService((String) clientRequestBody);
        }

        if (clientRequestBody == null) {
            clientRequestBody = "";
        }

        interaction.noteClientRequestHeadersAndBody(clientRequestHeaders, clientRequestBody, clientRequestContentType);

        return interactionManipulations.changeUrlForRequestToService(url);
    }

    public ServirtiumServer start() throws Exception {
        jettyServer.start();
        return this;
    }

    public void stop() {
        try {
            interactor.finishedScript(getInteractionNum(), lastCallFailed); // just in case
        } finally {
            try {
                jettyServer.setStopTimeout(1);
                jettyServer.stop();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void finishedScript() {
        interactor.finishedScript(getInteractionNum(), lastCallFailed);
    }

    public static void disableJettyLogging() {
        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");
        org.eclipse.jetty.util.log.Log.setLog(new NoLogging());

    }
    public static class NoLogging implements Logger {
        @Override public String getName() { return "no"; }
        @Override public void warn(String msg, Object... args) { }
        @Override public void warn(Throwable thrown) { }
        @Override public void warn(String msg, Throwable thrown) { }
        @Override public void info(String msg, Object... args) { }
        @Override public void info(Throwable thrown) { }
        @Override public void info(String msg, Throwable thrown) { }
        @Override public boolean isDebugEnabled() { return false; }
        @Override public void setDebugEnabled(boolean enabled) { }
        @Override public void debug(String msg, Object... args) { }
        @Override public void debug(Throwable thrown) { }
        @Override public void debug(String msg, Throwable thrown) { }
        @Override public Logger getLogger(String name) { return this; }
        @Override public void ignore(Throwable ignored) { }
        @Override public void debug(String s, long l) { }
    }

}
