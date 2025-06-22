package com.lca2.k8s_backend_alim.common.exception;

public class NotFound extends ClientError {
    public NotFound(String message) {
        this.errorCode = "NotFound";
        this.errorMessage = message;
    }
}
