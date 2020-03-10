package com.newway.newwayapi.web.rest.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequest extends RuntimeException {

    private String message;

    public BadRequest(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}