package com.github.joaoalberis.sdw24.domain.exception;

public class ComunicationErrorApiException extends RuntimeException{

    public ComunicationErrorApiException(String error) {
        super(error);
    }

}
