package com.tricon.LearningManagementSystem.Dao;

import java.util.List;

import com.tricon.LearningManagementSystem.Model.Course;

public interface CourseIDao {

	List<Course> getAllCourses();

	Course getCourse(int id);

	void addCourse(Course course);

	void updateCourse(Course course);

	void deleteCourse(int id);

}
