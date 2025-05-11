package com.seon.common.exception;

import com.seon.common.response.ApiResponse;
import lombok.Getter;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.time.LocalDateTime;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-05-03
 */
@Getter
public class ExceptionResponse {
    private final int status;
    private final String message;
    private final LocalDateTime timestamp;

    public ExceptionResponse(ApiException e) {
        this.status = e.getExceptionCode().getStatus();
        this.message = e.getMessage();
        this.timestamp = LocalDateTime.now();
    }

    public ExceptionResponse(MethodArgumentNotValidException e, String message) {
        this.status = e.getStatusCode().value();
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }
}
