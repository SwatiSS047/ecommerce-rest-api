package com.ecom.Springboot_project.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public Map<String, Object> handlerNotFound(ResourceNotFoundException ex){
		Map<String, Object> response = new HashMap<>();
		response.put("message", ex.getMessage());
		response.put("status", HttpStatus.NOT_FOUND.value());
		
		return response;
	}
	@ExceptionHandler(IllegalArgumentException.class)
	public Map<String, Object> handlerValidation(IllegalArgumentException ex){
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("message", ex.getMessage());
		response.put("status", HttpStatus.BAD_REQUEST.value());
		
		return response;
	}
	
	@ExceptionHandler(Exception.class)
	public Map<String, Object> handleGeneral(Exception ex){
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("Message", "Something went wrong");
		response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		
		return response;
	}
	
	
}
