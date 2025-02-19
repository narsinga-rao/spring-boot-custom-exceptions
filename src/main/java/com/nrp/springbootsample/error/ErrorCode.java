package com.nrp.springbootsample.error;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    STUDENT_NOT_FOUND_WITH_ID("Student not found with id: {0}", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String message;
    private final HttpStatus httpStatus;

    ErrorCode(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
