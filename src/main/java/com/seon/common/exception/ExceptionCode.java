package com.seon.common.exception;

import lombok.Getter;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-05-03
 */
@Getter
public enum ExceptionCode {
    BAD_REQUEST(400, "잘못된 요청입니다."),
    VALIDATION_ERROR(400, "유효성 검사 오류"),
    INVALID_CREDENTIALS(401, "아이디 또는 비밀번호가 올바르지 않습니다."),
    UNAUTHORIZED(401, "권한이 없습니다."),
    FORBIDDEN(403, "접근이 거부되었습니다."),
    NOT_FOUND(404, "리소스를 찾을 수 없습니다."),
    USER_NOT_FOUND(404, "사용자를 찾을 수 없습니다."),
    INTERNAL_SERVER_ERROR(500, "서버 오류가 발생했습니다.");

    private final int status;
    private final String message;

    ExceptionCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
