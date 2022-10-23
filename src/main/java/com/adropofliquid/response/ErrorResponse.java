package com.adropofliquid.response;

import java.util.Map;

public class ErrorResponse {

    private final int status;
    private final String message;
    private final Object error;

    private ErrorResponse(Builder builder){
        this.status = builder.status;
        this.message = builder.message;
        this.error = builder.error;
    }

    public int getStatusCode() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return error;
    }

    public static class Builder{
        private int status;
        private String message;
        private Object error;

        public Builder(int status) {
            this.status = status;
        }

        public Builder error(Map<?,?> error){
            this.error = error;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }
        public ErrorResponse build() {
            return new ErrorResponse(this);
        }
    }
}
