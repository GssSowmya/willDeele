package com.tricon.LearningManagementSystem.Constants;

public interface CourseSQLStatements {

	public static final String FETCH_ALL="SELECT * FROM course";
	public static final String FETCH_ONE="SELECT * FROM course where courseId=?";
	public static final String INSERT_ONE="INSERT INTO courss (courseId,assessmentId,courseDescriptionId,courseTypeId,createdBy,createdOn,updatedBy,updatedOn,durationId,instructorId,isArchived) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	public static final String UPDATE_ONE="UPDATE course SET assessmentId=?,courseDescriptionId=?,courseTypeId=?,createdBy=?,createdOn=?,updatedBy=?,updatedOn=?,durationId=?,instructorId=? WHERE courseId=?";
	public static final String DELETE_ONE="UPDATE course SET isArchived=true WHERE courseId=?";
}
