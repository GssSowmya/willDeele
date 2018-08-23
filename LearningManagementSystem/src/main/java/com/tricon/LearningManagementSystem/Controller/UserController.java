package com.tricon.LearningManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.LearningManagementSystem.Model.User;
import com.tricon.LearningManagementSystem.Service.UserIService;

@RestController
public class UserController {
	
	@Autowired
	private UserIService userService;
	
	@RequestMapping(value="/lms/users",method=RequestMethod.GET)
	public List<User> getAllUsers() {
		

		return userService.getAllUsers();
	}

}
