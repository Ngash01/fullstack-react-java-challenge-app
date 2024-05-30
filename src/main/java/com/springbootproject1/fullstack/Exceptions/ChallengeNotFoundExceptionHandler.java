package com.springbootproject1.fullstack.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Objects;

@RestControllerAdvice
public class ChallengeNotFoundExceptionHandler {

    @ExceptionHandler(ChallengeNotFoundException.class)
    public ResponseEntity<Object> handleChallengeNotFoundException(ChallengeNotFoundException challengeNotFoundException){

        ChallengeNotFound challengeNotFound = new ChallengeNotFound(
                challengeNotFoundException.getMessage(),
                HttpStatus.NOT_FOUND,
                challengeNotFoundException.getCause()
        );

        return new ResponseEntity<>(challengeNotFound, HttpStatus.NOT_FOUND);


    }
}
