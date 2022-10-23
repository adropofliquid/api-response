package com.adropofliquid.response;

import java.util.Map;

public class Response {

    private final int status;
    private final String message;
    private final Object data;

    private Response(Builder builder){
        this.status = builder.status;
        this.message = builder.message;
        this.data = builder.data;
    }
    //getter functions for spring json response
    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public static class Builder{
        private int status;
        private String message;
        private Object data;


        public Builder(int status) {
            this.status = status;
        }

        public Builder data(Object data){
            this.data = data;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }
        public Response build() {
            return new Response(this);
        }


    }
}
