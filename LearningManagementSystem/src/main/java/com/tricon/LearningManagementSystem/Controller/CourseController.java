package com.tricon.LearningManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.LearningManagementSystem.Model.Course;
import com.tricon.LearningManagementSystem.Service.CourseIService;

@RestController
public class CourseController {
	@Autowired
	private CourseIService coursesService;
	
	@RequestMapping(value="/lms/courses",method=RequestMethod.GET)
	public List<Course> getAllCourses()
	{
		return coursesService.getAllCourses();
	}
	
	@RequestMapping(value="/lms/courses/{id}",method=RequestMethod.GET)
	public Course getCourse(@PathVariable int id)
	{
		return coursesService.getCourse(id);
	}
	
	@RequestMapping(value="/lms/courses",method=RequestMethod.POST)
	public String addCourse(@RequestBody Course course)
	{
		coursesService.addCourse(course);
		return "200 ok";
		
	}
	
	@RequestMapping(value="/lms/courses",method=RequestMethod.PUT)
	public String updateCourse(@RequestBody Course course)
	{
		coursesService.updateCourse(course);
		return "200 ok";
	}
	
	@RequestMapping(value="/lms/courses/{id}",method=RequestMethod.DELETE)
	public String deleteCourse(@PathVariable int id)
	{
		coursesService.deleteCourse(id);
		return "200 ok";
	}
}
