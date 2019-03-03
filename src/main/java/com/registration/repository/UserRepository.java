package com.registration.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.registration.modal.Courses;
import com.registration.modal.Student;

public interface UserRepository  extends CrudRepository<Student, Integer>{
	
	public Student findByemail(String email);
	public Student findBypassword(String password);
//	public Student deleteByuserName(String userName);
//	public List<Courses> findAlcourse();

}
