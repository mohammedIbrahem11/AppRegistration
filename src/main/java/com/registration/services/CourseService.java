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

	public CourseService(CourseRepository courseRepository){
		this.courseRepository = courseRepository;
	}
	
	public void saveCourse(Courses course) {
		courseRepository.save(course);
	}
	
	public List<Courses> getAllCourses() {
		List<Courses> courses = new ArrayList<Courses>();
		for(Courses course : courseRepository.findAll()) {
			courses.add(course);
		}
		
		return courses;
	}
	
	public Optional<Courses> getCourseById(String id) {
		Optional<Courses> course = courseRepository.findById(id);
		return course;
	}
	
}
