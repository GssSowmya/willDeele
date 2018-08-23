package com.tricon.LearningManagementSystem;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.tricon.LearningManagementSystem.DaoImpl.CourseDaoImpl;
import com.tricon.LearningManagementSystem.Model.Course;

public class TestCourseDAO {
	
	private static Course course1,course2,course3;
	
	private static CourseDaoImpl courseDaoObject;
	
	@BeforeClass
	public static void setUp()
	{
		courseDaoObject=mock(CourseDaoImpl.class);
		course1=new Course("1",1,102,1,1,false,"1","Ganesh",new Date(System.currentTimeMillis()),"Sowmya",new Date(System.currentTimeMillis()));
		course2=new Course("2",2,202,2,2,false,"2","Ganesh",new Date(System.currentTimeMillis()),"Sowmya",new Date(System.currentTimeMillis()));
		
	}
	
	@Test
	public void testGetAllCourses()
	{
		
		doNothing().when(courseDaoObject).addCourse(course1);
		doNothing().when(courseDaoObject).addCourse(course2);
		
		List<Course> courseList=new ArrayList<Course>();
		
		assertNotNull(courseList);
		
		when(courseDaoObject.getAllCourses()).thenReturn(courseList);
		
		when(courseDaoObject.getCourse(1)).thenReturn(course1);
		when(courseDaoObject.getCourse(2)).thenReturn(course2);
		
		course3=new Course("2",2,202,2,3,false,"2","ChangedGanesh",new Date(System.currentTimeMillis()),"Sowmya",new Date(System.currentTimeMillis()));
		
		doNothing().when(courseDaoObject).updateCourse(course3);
		when(courseDaoObject.getCourse(2)).thenReturn(course3);
		
		doNothing().when(courseDaoObject).deleteCourse(2);
		
		courseList.remove(course2);
		when(courseDaoObject.getAllCourses()).thenReturn(courseList);
		
		
	}

}
