package com.example.IA03.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Exception", HttpStatus.INTERNAL_SERVER_ERROR),
    USER_EXISTS(1002, "User already exists",HttpStatus.BAD_REQUEST),
    INVALID_KEY(1001, "Invalid message key",HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID(1004, "Password must have ≥6 chars with upper, lower, number, and symbol",HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTS(1005, "User does not exist",HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1006, "Incorrect email or password",HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1007, "User is not authorized",HttpStatus.FORBIDDEN),
    INVALID_EMAIL(1009, "Email format is invalid",HttpStatus.BAD_REQUEST)
    ;
    private int code;
    private String message;
    private HttpStatusCode statusCode;
    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }
}
