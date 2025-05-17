package com.seon.common.exception;

import lombok.Getter;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-05-17
 */
@Getter
public class ValidExceptionResponse {
    private final int status;
    private final Map<String, List<String>> message;
    private final LocalDateTime timestamp;

    public ValidExceptionResponse(MethodArgumentNotValidException e, Map<String, List<String>> message) {
        this.status = e.getStatusCode().value();
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }
}
