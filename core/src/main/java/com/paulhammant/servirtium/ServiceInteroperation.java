package com.paulhammant.servirtium;

import java.util.List;
import java.util.Map;

public interface ServiceInteroperation {
    ServiceResponse invokeServiceEndpoint(String method, Object clientRequestBody, String clientRequestContentType, String url, List<String> clientRequestHeaders, InteractionManipulations interactionManipulations, boolean lowerCaseHeaders) throws InteractionException;

    public static class InteractionException extends RuntimeException {
        public InteractionException(Throwable cause) {
            super(cause);
        }
    }
}
