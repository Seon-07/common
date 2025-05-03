package com.seon.common.exception;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-05-03
 */
public class ApiException extends RuntimeException{
    private final ExceptionCode exceptionCode;

    public ApiException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.exceptionCode = exceptionCode;
    }

    public ApiException(ExceptionCode exceptionCode, String message) {
        super(message);
        this.exceptionCode = exceptionCode;
    }

    public ExceptionCode getExceptionCode() {
        return exceptionCode;
    }
}
