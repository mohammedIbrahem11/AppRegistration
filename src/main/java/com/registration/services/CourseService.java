package com.registration.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.registration.modal.Courses;
import com.registration.modal.Student;
import com.registration.repository.CourseRepository;
import com.registration.repository.UserRepository;

@Service
@Transactional
public class CourseService{
	
	private CourseRepository courseRepository;

	
	
	public List<Courses> getAllCourses() {
		List<Courses> courses = new ArrayList<Courses>();
		for(Courses course : courseRepository.findAll()) {
			courses.add(course);
		}
		
		return courses;
	}
	
	
	
}
