package com.seon.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-05-03
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ExceptionResponse> handleApiException(ApiException e) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(e);
        return ResponseEntity.status(HttpStatus.valueOf(e.getExceptionCode().getStatus())).body(exceptionResponse);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> handleValidationException(MethodArgumentNotValidException e) {
        String errorMessage = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error -> error.getField() + ": " + error.getDefaultMessage())
                .collect(Collectors.joining(", "));
        ExceptionResponse response = new ExceptionResponse(e, errorMessage);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
