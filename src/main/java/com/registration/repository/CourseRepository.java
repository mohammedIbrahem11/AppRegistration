package com.registration.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.registration.modal.Courses;
import com.registration.modal.Student;

public interface CourseRepository  extends CrudRepository<Courses, String>{
	
//	public Student findByemail(String email);
//	public Student findBypassword(String password);
//	public List<Courses> findAlcourse();

}
