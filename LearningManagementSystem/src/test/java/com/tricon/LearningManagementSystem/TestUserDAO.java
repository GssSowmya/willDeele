package com.tricon.LearningManagementSystem;




import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tricon.LearningManagementSystem.DaoImpl.UserDaoImpl;
import com.tricon.LearningManagementSystem.Model.User;



public class TestUserDAO {

	
	private User user1,user2;
	

	private static UserDaoImpl userDaoObject;
	
	
	@BeforeClass
	public static void setUp()
	{
		userDaoObject = mock(UserDaoImpl.class);
	}
	@Test
	public void userDaoTest(){
		user1=new User(1,"tricon","Koramangala","7049095725",true);
		user2=new User(2,"infotech","Koramangala","7049095725",false);
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		when(userDaoObject.getAllUsers()).thenReturn(userList);
		assertEquals(userDaoObject.getAllUsers().size(),1);
	}
}
