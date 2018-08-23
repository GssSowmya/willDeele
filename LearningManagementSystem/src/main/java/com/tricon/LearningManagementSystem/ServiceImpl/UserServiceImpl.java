package com.tricon.LearningManagementSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.LearningManagementSystem.Dao.UserIDao;
import com.tricon.LearningManagementSystem.Model.User;
import com.tricon.LearningManagementSystem.Service.UserIService;

@Service
public class UserServiceImpl implements UserIService {

	@Autowired
	private UserIDao userDao;
	
	public List<User> getAllUsers()
	{
		return userDao.getAllUsers();
	}
}
