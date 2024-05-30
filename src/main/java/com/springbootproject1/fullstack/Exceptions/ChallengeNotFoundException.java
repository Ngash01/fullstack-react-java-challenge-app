package com.springbootproject1.fullstack.Exceptions;

public class ChallengeNotFoundException extends RuntimeException{

    public ChallengeNotFoundException(String message) {
        super(message);
    }

    public ChallengeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}


