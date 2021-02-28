package com.season.vaccionation.resource.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.season.vaccionation.service.exception.BadRequestException;
import com.season.vaccionation.service.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> badRequest(ObjectNotFoundException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(System.currentTimeMillis(),status.value(),"Bad Request",e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<StandardError> requesterror(BadRequestException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(System.currentTimeMillis(),status.value(),"Bad Request",e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
