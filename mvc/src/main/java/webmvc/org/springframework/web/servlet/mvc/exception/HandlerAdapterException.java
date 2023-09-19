package webmvc.org.springframework.web.servlet.mvc.exception;

public class HandlerAdapterException extends RuntimeException {

    public HandlerAdapterException(String message) {
        super(message);
    }

    public HandlerAdapterException(String message, Throwable cause) {
        super(message, cause);
    }
}
