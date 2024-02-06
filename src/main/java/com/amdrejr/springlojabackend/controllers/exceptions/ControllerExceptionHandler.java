package com.amdrejr.springlojabackend.controllers.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.amdrejr.springlojabackend.services.exceptions.DataBaseException;
import com.amdrejr.springlojabackend.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException err, HttpServletRequest req) {
        String errorMessage = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;

        StandardError e = new StandardError(Instant.now(), status.value(), errorMessage, err.getMessage(), req.getRequestURI());

        return ResponseEntity.status(status).body(e);
    }

    @ExceptionHandler(DataBaseException.class)
    public ResponseEntity<StandardError> database(DataBaseException err, HttpServletRequest req) {
        String errorMessage = "DataBase Error";
        HttpStatus status = HttpStatus.BAD_REQUEST;

        StandardError e = new StandardError(Instant.now(), status.value(), errorMessage, err.getMessage(), req.getRequestURI());

        return ResponseEntity.status(status).body(e);
    }
}
