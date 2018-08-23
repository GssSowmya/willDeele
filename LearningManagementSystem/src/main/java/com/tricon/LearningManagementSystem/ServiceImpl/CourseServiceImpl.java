package com.tricon.LearningManagementSystem.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tricon.LearningManagementSystem.Dao.CourseIDao;
import com.tricon.LearningManagementSystem.Model.Course;
import com.tricon.LearningManagementSystem.Service.CourseIService;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CourseServiceImpl implements CourseIService {

	@Autowired
	private CourseIDao cousesDao;
	@Override
	public List<Course> getAllCourses() {
	
		return cousesDao.getAllCourses();
	}

	@Override
	public Course getCourse(int id) {

		return cousesDao.getCourse(id);
	}

	@Override
	public void addCourse(Course course) {

		cousesDao.addCourse(course);
	}

	@Override
	public void updateCourse(Course course) {
	
		cousesDao.updateCourse(course);
	}

	@Override
	public void deleteCourse(int id) {
	
		cousesDao.deleteCourse(id);
	}

}
