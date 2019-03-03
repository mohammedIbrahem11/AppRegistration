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
public class UserService{
	
	private UserRepository userRepository;

	public UserService(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	public void saveUser(Student user) {
		userRepository.save(user);
	}
	
	public List<Student> getAllUser() {
		List<Student> users = new ArrayList<Student>();
		for(Student user : userRepository.findAll()) {
			users.add(user);
		}
		
		return users;
	}
	
	
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
//	public void deleteByUsername(String userName) {
//		userRepository.deleteByuserName(userName);
//	}
	
	public Optional<Student> editUser(int id) {
		Optional<Student> user = userRepository.findById(id);
		return user;
	}

	public Student findByemail(String email) {
		return userRepository.findByemail(email);
	}
	
	public Student findBypassword(String password) {
		return userRepository.findBypassword(password);
	}
	
}
