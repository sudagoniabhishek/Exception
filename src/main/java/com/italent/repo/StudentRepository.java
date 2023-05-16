package com.italent.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.italent.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
