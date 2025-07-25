package com.bumpsh.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

record ErrorResponse(String message) {}

@RestControllerAdvice
class EmployeeNotFoundAdvice {

	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	Object employeeNotFoundHandler(EmployeeNotFoundException ex) {
		return ex.getMessage();
	}
}
