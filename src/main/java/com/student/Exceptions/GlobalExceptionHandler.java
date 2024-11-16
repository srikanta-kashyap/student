package com.student.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<?> studentnamenotfoundexceptionhandler(StudentNotFoundException ex) {

		Map<String, Object> exceptionresponse = new HashMap<>();

		exceptionresponse.put("Exception Message", ex.getErrormessag());
		exceptionresponse.put("ErrorCode", ex.getErrorcode());
		exceptionresponse.put("Author", ex.getAuthor());

		return new ResponseEntity<Map<String, Object>>(exceptionresponse, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(GenericException.class)
	public ResponseEntity<?> Genericexceptionhandler(GenericException ex) {

		Map<String, Object> exceptionresponse = new HashMap<>();

		exceptionresponse.put("Exception Message", ex.getErrormessag());
		exceptionresponse.put("ErrorCode", ex.getErrorcode());
		exceptionresponse.put("Author", ex.getAuthor());

		return new ResponseEntity<Map<String, Object>>(exceptionresponse, HttpStatus.NOT_FOUND);
	}
	

}
