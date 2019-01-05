/*
        SvHTTP: Service Virtualized HTTP

        Copyright (c) 2018, Paul Hammant
        All rights reserved.

        Redistribution and use in source and binary forms, with or without
        modification, are permitted provided that the following conditions are met:

        1. Redistributions of source code must retain the above copyright notice, this
        list of conditions and the following disclaimer.
        2. Redistributions in binary form must reproduce the above copyright notice,
        this list of conditions and the following disclaimer in the documentation
        and/or other materials provided with the distribution.

        THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
        ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
        WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
        DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
        ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
        (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
        LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
        ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
        (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
        SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

        The views and conclusions contained in the software and documentation are those
        of the authors and should not be interpreted as representing official policies,
        either expressed or implied, of the SvHTTP project.
*/

package com.paulhammant.svhttp;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class ServiceInteractionDelegate {

    protected final HeaderManipulator headerManipulator;

    private Server server;

    public ServiceInteractionDelegate(int port, boolean ssl, HeaderManipulator headerManipulator) {
        this.headerManipulator = headerManipulator;

        server = new Server(port);
        // How the fuck do you turn off Embedded Jetty's logging???
        // Everything I tried (mostly static operations on Log. didn't work.

        server.setHandler(new AbstractHandler() {

            @Override
            public void handle(String target, org.eclipse.jetty.server.Request baseRequest,
                               HttpServletRequest request,
                               HttpServletResponse response) throws IOException, ServletException {

                String method = request.getMethod();
                String bodyToReal = "";
                Map<String, String> headersToReal = new HashMap<>();

                try {

                    newMethod(method, request.getRequestURI().toString());
                    String contentType = request.getContentType();
                    if (contentType == null) {
                        contentType = "";
                    }

                    Enumeration<String> hdrs = request.getHeaderNames();

                    ServletInputStream is = request.getInputStream();

                    if (is.available() > 0) {

                        if (contentType.startsWith("text/") ||
                                contentType.startsWith("image/svg") ||
                                contentType.startsWith("multipart/form-data") ||
                                contentType.startsWith("application/json") ||
                                (contentType.startsWith("application/") && contentType.contains("script")) ||
                                contentType.startsWith("application/xhtml+xml")) {
                            bodyToReal = null;
                            String characterEncoding = request.getCharacterEncoding();
                            if (characterEncoding == null) {
                                characterEncoding = "utf-8";
                            }
                            try (Scanner scanner = new Scanner(is, characterEncoding)) {
                                bodyToReal = scanner.useDelimiter("\\A").next();
                            }
                        } else {
                            byte[] targetArray = new byte[is.available()];
                            is.read(targetArray);
                            bodyToReal = "//svHttp+Base64: " + Base64.getEncoder().encodeToString(targetArray)
                                    .replaceAll("(.{60})", "$1\n");
                            ;
                        }
                    }

                    while (hdrs.hasMoreElements()) {
                        String hdr = hdrs.nextElement();
                        String hdrVal = request.getHeader(hdr);
                        hdrVal = headerManipulator.headerReplacement(hdr, hdrVal);
                        headersToReal.put(hdr, hdrVal);
                        headerManipulator.potentiallyManipulateHeaders(method, hdr, headersToReal);
                    }

                    headersReceived(headersToReal);

                    bodyReceived(bodyToReal, contentType);

                    final String url = (request.getRequestURL().toString().startsWith("http://") || request.getRequestURL().toString().startsWith("https://")) ? request.getRequestURL().toString() : "http://" + request.getRemoteHost() + ":" + request.getRemotePort() + request.getRequestURI();
                    ServiceResponse realResponse = getRealResponse(method, headerManipulator.changeToRealURL(url), headersToReal);

                    List<String > newHeaders = new ArrayList<>();
                    for (int i = 0; i < realResponse.headers.length; i++) {
                        String headerBackFromReal = realResponse.headers[i];
                        String potentiallyChangedHeader = headerManipulator.changeHeaderBackFromReal(i, headerBackFromReal);
                        newHeaders.add(potentiallyChangedHeader);
                        int ix = potentiallyChangedHeader.indexOf(": ");
                        String hdrKey = potentiallyChangedHeader.substring(0, ix);
                        String hdrVal = potentiallyChangedHeader.substring(ix + 2);
                        hdrVal = headerManipulator.headerReplacement(hdrKey, hdrVal);
                        response.setHeader(hdrKey, hdrVal);
                    }
                    ServiceResponse revisedResponse = realResponse.withRevisedHeaders(newHeaders.toArray(new String[0]));

                    response.setStatus(revisedResponse.statusCode);

                    if (revisedResponse.contentType != null) {
                        response.setContentType(revisedResponse.contentType);
                        if (revisedResponse.body instanceof String) {
                            response.getWriter().write((String) revisedResponse.body);
                        } else {
                            response.getOutputStream().write((byte[]) revisedResponse.body);
                        }
                    }

                    headersToReturn(revisedResponse);

                    bodyToReturn(revisedResponse);

                } catch (Throwable throwable) {
                    throw throwable; // stick your debugger here
                }

                // Inform jetty that this request has now been handled
                baseRequest.setHandled(true);
            }
        });
    }

    public ServiceInteractionDelegate startApp() {
        try {
            server.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public abstract void finished();

    protected abstract ServiceResponse getRealResponse(String method,
                                                       String url, Map<String, String> headersToReal) throws IOException;

    protected abstract void bodyToReturn(ServiceResponse rv) ;

    protected abstract void headersToReturn(ServiceResponse rv);

    protected abstract void bodyReceived(String bodyToReal, String contentType);

    protected abstract void headersReceived(Map<String, String> headers);

    protected abstract void newMethod(String method, String path);

    public void stop() {
        try {
            server.stop();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
