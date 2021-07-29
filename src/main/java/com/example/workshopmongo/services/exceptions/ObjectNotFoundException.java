package com.example.workshopmongo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException(String msn){
        super(msn);
    }
}
