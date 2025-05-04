package com.seon.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-05-05
 */
@Getter
@AllArgsConstructor
public class DataResult<T> implements ApiResponse {
    private final int status;
    private final String message;
    private final T data;

    public static <T> DataResult<T> success(T data) {
        return new DataResult<>(HttpStatus.OK.value(), "SUCCESS", data);
    }

    public static <T> DataResult<T> success(T data, String message) {
        return new DataResult<>(HttpStatus.OK.value(), message, data);
    }

    public static <T> DataResult<T> success(T data, HttpStatus status, String message) {
        return new DataResult<>(status.value(), message, data);
    }
}
