package com.italent.service;

import com.italent.entity.Student;
import com.italent.exception.StudentNotFoundException;

public interface Studentseviceinterface {

	
	Student getById(int id) throws StudentNotFoundException;

	

}
