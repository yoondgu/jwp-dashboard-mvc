package web.org.springframework.web.bind;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import web.org.springframework.http.BodyCachingRequestWrapper;

import java.io.IOException;

public class MappingJackson2HttpMessageConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private MappingJackson2HttpMessageConverter() {
    }

    public static <T> T readRequestBody(final HttpServletRequest request, final Class<T> clazz) throws IOException {
        final var body = new BodyCachingRequestWrapper(request).getBody();

        return objectMapper.readValue(body, clazz);
    }
    
}