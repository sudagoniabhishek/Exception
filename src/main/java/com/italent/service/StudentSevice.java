package com.italent.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.italent.entity.Student;

import com.italent.exception.StudentNotFoundException;

import com.italent.repo.StudentRepository;

@Service
public class StudentSevice implements Studentseviceinterface {

	
	@Autowired
	StudentRepository repo;
	
	@Override
	public Student getById(int id) throws StudentNotFoundException {
		
		Student student=repo.findById(id).get();
	
		
		
		if(student!=null) {
		return student;
		}
		else {
			throw new StudentNotFoundException("user not available with that id " +id);
		}
			
	
	
	}

	
	

//	public User getuser(int id) throws UserNotFoundException {
//		User user=repository.findByUserId(id);
//		if(user!=null) {
//		return user;
//		}
//		else {
//			throw new UserNotFoundException("user not available with that id "+ id );
//		}
		
	
}
