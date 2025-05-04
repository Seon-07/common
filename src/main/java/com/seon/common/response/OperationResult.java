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
public class OperationResult implements ApiResponse {
    private final int status;
    private final String message;

    public static OperationResult success() {
        return new OperationResult(HttpStatus.OK.value(), "SUCCESS");
    }

    public static OperationResult success(String message) {
        return new OperationResult(HttpStatus.OK.value(), message);
    }

    public static OperationResult success(HttpStatus status, String message) {
        return new OperationResult(status.value(), message);
    }
}
