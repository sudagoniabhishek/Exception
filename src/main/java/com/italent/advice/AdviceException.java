package com.italent.advice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.italent.exception.StudentNotFoundException;

@RestControllerAdvice
public class AdviceException {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public Map<String,String> notVaildId(StudentNotFoundException ex){
		
		Map<String,String> errorMap=new HashMap<String,String>();
		
		errorMap.put("error message", ex.getMessage());
		
		return errorMap;
		
		
		
	}

@ExceptionHandler(MissingPathVariableException.class)
public Map<String,String> inVaild(MissingPathVariableException ex){
	
		Map<String,String> erroeMap=new HashMap<String,String>();
		
		erroeMap.put("Error message", ex.getMessage());
		
		return erroeMap;
	
	
	
		
		
}
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(NoSuchElementException.class)
//	public Map<String,String> NotVaild(NoSuchElementException ex){
//		
//		Map<String,String> erroeMap=new HashMap<String,String>();
//		
//		erroeMap.put("Error message", "no data present with this id");
//		return erroeMap;
//	}
	
	
}
