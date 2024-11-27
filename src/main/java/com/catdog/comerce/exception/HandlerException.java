package com.catdog.comerce.exception;

import com.catdog.comerce.dto.response.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


@RestControllerAdvice
public class HandlerException {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> notFound(NotFoundException ex, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(404);
        errorResponse.setDateTime(LocalDateTime.now());
        errorResponse.setUri(request.getRequestURI());
        errorResponse.setMessage(ex.getMessage());

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NotStockException.class)
    public ResponseEntity<ErrorResponse> notStock(NotStockException ex, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(404);
        errorResponse.setDateTime(LocalDateTime.now());
        errorResponse.setUri(request.getRequestURI());
        errorResponse.setMessage(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidUpdateSellingState.class)
    public ResponseEntity<ErrorResponse> invalidUpdateSellingState(InvalidUpdateSellingState ex, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(404);
        errorResponse.setDateTime(LocalDateTime.now());
        errorResponse.setUri(request.getRequestURI());
        errorResponse.setMessage(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RepeatedException.class)
    public ResponseEntity<ErrorResponse> repeated(RepeatedException ex, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(404);
        errorResponse.setDateTime(LocalDateTime.now());
        errorResponse.setUri(request.getRequestURI());
        errorResponse.setMessage(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> alreadyExists(AlreadyExistsException ex, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(404);
        errorResponse.setDateTime(LocalDateTime.now());
        errorResponse.setUri(request.getRequestURI());
        errorResponse.setMessage(ex.getMessage());
        Map<String,Object> map = new HashMap<>();
        map.put("description", ex.getField1());
        errorResponse.setError(map);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
