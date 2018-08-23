package com.tricon.LearningManagementSystem.Model;

import java.util.Date;

public class Course {
	
	private String courseId;
	private int courseDescriptionId;
	private int instructorId;
	private int durationId;
	private int courseTypeId;
	private Boolean isArchived;
	private String assessmentId;
	private String createdBy;
	private Date createdOn;
	

	public Course(String courseId, int courseDescriptionId, int instructorId, int durationId, int courseTypeId,
			Boolean isArchived, String assessmentId, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.courseId = courseId;
		this.courseDescriptionId = courseDescriptionId;
		this.instructorId = instructorId;
		this.durationId = durationId;
		this.courseTypeId = courseTypeId;
		this.isArchived = isArchived;
		this.assessmentId = assessmentId;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}
	public Course() {
		
	}
	private String updatedBy;
	private Date updatedOn;
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public int getCourseDescriptionId() {
		return courseDescriptionId;
	}
	public void setCourseDescriptionId(int courseDescriptionId) {
		this.courseDescriptionId = courseDescriptionId;
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public int getDurationId() {
		return durationId;
	}
	public void setDurationId(int durationId) {
		this.durationId = durationId;
	}
	public Boolean getIsArchived() {
		return isArchived;
	}
	public void setIsArchived(Boolean isArchived) {
		this.isArchived = isArchived;
	}
	public String getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(String assessmentId) {
		this.assessmentId = assessmentId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public int getCourseTypeId() {
		return courseTypeId;
	}
	public void setCourseTypeId(int courseTypeId) {
		this.courseTypeId = courseTypeId;
	}
	
}
