package com.springbootproject1.fullstack.Exceptions;

import org.springframework.http.HttpStatus;

public class ChallengeNotFound {

    public ChallengeNotFound(String message, HttpStatus httpStatus, Throwable throwable) {
        Message = message;
        this.httpStatus = httpStatus;
        this.throwable = throwable;
    }

    private final String Message;
    private final HttpStatus httpStatus;
    private final Throwable throwable;

    public String getMessage() {
        return Message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Throwable getThrowable() {
        return throwable;
    }


}

