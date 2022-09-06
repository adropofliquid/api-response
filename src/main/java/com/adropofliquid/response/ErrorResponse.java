package com.adropofliquid.response;

import java.util.Map;

public class ErrorResponse {

    private final int statusCode;
    private final String message;
    private final Map<?,?> error;

    private ErrorResponse(Builder builder){
        this.statusCode = builder.statusCode;
        this.message = builder.message;
        this.error = builder.error;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public Map<?, ?> getData() {
        return error;
    }

    public static class Builder{
        private int statusCode;
        private String message;
        private Map<?,?> error;

        public Builder(int statusCode) {
            this.statusCode = statusCode;
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
