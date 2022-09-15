package com.dgryzhkov.spring.rest.exception_handling;

/**
 * @author Dgryzhkov
 */
public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
