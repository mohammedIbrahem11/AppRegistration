package com.registration.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.registration.modal.Courses;
import com.registration.modal.Student;
import com.registration.services.CourseService;
import com.registration.services.UserService;



@Controller
public class RegistrationController {

	@Autowired
	UserService userService; 
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String showWelcomePage(HttpServletRequest request) {		
		request.setAttribute("mode", "MODE_WELCOME");
		return "welcome";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLogin() {		
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleLogin(@ModelAttribute Student student, HttpServletRequest request) {	
		if(userService.findByemail(student.getEmail())!= null &&  userService.findBypassword(student.getPassword()) != null) {
			request.setAttribute("mode", "MODE_WELCOME");
			return "welcome";
		}else {
			request.setAttribute("error", "Invaled Usernamr or Password");
			return "login";
		}
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegistrationPage(HttpServletRequest request) {		
		request.setAttribute("mode", "MODE_REGISTER");
		return "registration";
	}
	
	@RequestMapping(value="/save-user", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute Student student,BindingResult result ,HttpServletRequest request) {		
		request.setAttribute("mode", "MODE_REGISTER_DONE");
		request.setAttribute("name", student.getUserName());
		userService.saveUser(student);
		return "welcome";
	}
	
	@RequestMapping(value="/show-users", method=RequestMethod.GET)
	public String showAllUsers(HttpServletRequest request) {		
		request.setAttribute("users", userService.getAllUser());
		return "AllUsers";
	}
	
	@RequestMapping(value="/show-courses", method=RequestMethod.GET)
	public String showAllCourses(HttpServletRequest request) {		
		request.setAttribute("courses", courseService.getAllCourses());
		return "AllCourses";
	}
	
	@RequestMapping(value="/delete-user", method=RequestMethod.GET)
	public String deleteUser(@RequestParam int id, HttpServletRequest request) {		
		userService.deleteUser(id);
		request.setAttribute("users", userService.getAllUser());
		return "AllUsers";
	}
	
	@RequestMapping(value="/edit-user", method=RequestMethod.GET)
	public String editUser(@RequestParam int id, HttpServletRequest request) {		
		request.setAttribute("mode", "MODE_UPDATE");
		Optional<Student> student = userService.editUser(id);
		if(student != null)
		   request.setAttribute("users", student.get());
		else {
			System.out.println(student.get().getUserName());
		}
		return "registration";
	}
	
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logOut(HttpServletRequest request) {		
		return "login";
	}
}
