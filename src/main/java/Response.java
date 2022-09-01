import java.util.Map;

public class Response {

    private final int statusCode;
    private final String message;
    private final Map<?,?> data;

    private Response(Builder builder){
        this.statusCode = builder.statusCode;
        this.message = builder.message;
        this.data = builder.data;
    }
    //getter functions for spring json response
    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public Map<?, ?> getData() {
        return data;
    }

    public static class Builder{
        private int statusCode;
        private String message;
        private Map<?,?> data;


        public Builder(int statusCode) {
            this.statusCode = statusCode;
        }

        public Builder data(Map<?,?> data){
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
