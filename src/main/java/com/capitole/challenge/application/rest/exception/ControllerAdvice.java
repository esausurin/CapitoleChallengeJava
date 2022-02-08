package com.capitole.challenge.application.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capitole.challenge.application.rest.dto.ErrorDto;
import com.capitole.challenge.domian.api.exception.BusinessException;
import com.capitole.challenge.domian.api.exception.RequestException;

@RestControllerAdvice
public class ControllerAdvice {

	@ExceptionHandler(value=RequestException.class)
	public ResponseEntity<ErrorDto> RequestExceptionHandler(RequestException ex){
		ErrorDto error = ErrorDto.builder().code("E-600").message(ex.getMessage()).build();		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);		
	}
	
	@ExceptionHandler(value=BusinessException.class)
	public ResponseEntity<ErrorDto> BusinessExceptionHandler(BusinessException ex){
		ErrorDto error = ErrorDto.builder().code("E-300").message(ex.getMessage()).build();		
		return new ResponseEntity<>(error,ex.getStatus());		
	}
	
}
