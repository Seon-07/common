package com.seon.common.exception;

import lombok.Getter;

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

    public ExceptionResponse(ExceptionCode exceptionCode) {
        this.status = exceptionCode.getStatus();
        this.message = exceptionCode.getMessage();
        this.timestamp = LocalDateTime.now();
    }

    public ExceptionResponse(ExceptionCode exceptionCode, String message) {
        this.status = exceptionCode.getStatus();
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }
}
