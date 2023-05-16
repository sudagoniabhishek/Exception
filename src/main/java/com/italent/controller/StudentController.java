package com.italent.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italent.dto.StudentDTO;
import com.italent.entity.Student;
import com.italent.exception.StudentNotFoundException;
import com.italent.service.Studentseviceinterface;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	Studentseviceinterface service;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id) throws StudentNotFoundException{
		
		
		
		
		return  ResponseEntity.ok(service.getById(id));
		
		
		
		
		
	}

	
	
	
	
}
