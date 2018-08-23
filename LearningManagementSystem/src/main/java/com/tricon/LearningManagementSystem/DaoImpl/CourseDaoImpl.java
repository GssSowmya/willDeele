package com.tricon.LearningManagementSystem.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tricon.LearningManagementSystem.Constants.CourseSQLStatements;
import com.tricon.LearningManagementSystem.Dao.CourseIDao;
import com.tricon.LearningManagementSystem.Model.Course;

@Repository
public class CourseDaoImpl implements CourseIDao,CourseSQLStatements{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	private static final Logger LOGGER = Logger.getLogger( CourseDaoImpl.class.getName() );
	
	@Override
	public List<Course> getAllCourses() {
	
		LOGGER.info(new Timestamp(System.currentTimeMillis())+"  : Started Fetching All courses");
		
		return jdbcTemplate.query(CourseSQLStatements.FETCH_ALL,new RowMapper<Course>() {

			@Override
			public Course mapRow(ResultSet rs, int arg1) throws SQLException {
				if(rs.getBoolean("isArchived")==false) {
				Course obj=new Course();
				obj.setCourseId(rs.getString("courseId"));
				obj.setCourseDescriptionId(rs.getInt("courseDescriptionId"));
				obj.setCourseTypeId(rs.getInt("courseTypeId"));
				obj.setCreatedBy(rs.getString("createdBy"));
				obj.setCreatedOn(rs.getDate("createdOn"));
				obj.setDurationId(rs.getInt("durationId"));
				obj.setInstructorId(rs.getInt("instructorId"));
				obj.setIsArchived(rs.getBoolean("isArchived"));
				obj.setUpdatedBy(rs.getString("updatedBy"));
				obj.setUpdatedOn(rs.getDate("updatedOn"));
				return obj;}
				return null;
			}
		});
	}

	@Override
	public Course getCourse(int id) {
		
		LOGGER.info(new Timestamp(System.currentTimeMillis())+"  : Started fetching the course");
		return jdbcTemplate.queryForObject(CourseSQLStatements.FETCH_ONE, new RowMapper<Course>()
				{
					@Override
					public Course mapRow(ResultSet rs, int arg1) throws SQLException {
						Course obj=new Course();
						obj.setCourseId(rs.getString("courseId"));
						obj.setCourseDescriptionId(rs.getInt("courseDescriptionId"));
						obj.setCourseTypeId(rs.getInt("courseTypeId"));
						obj.setCreatedBy(rs.getString("createdBy"));
						obj.setCreatedOn(rs.getDate("createdOn"));
						obj.setDurationId(rs.getInt("durationId"));
						obj.setInstructorId(rs.getInt("instructorId"));
						obj.setIsArchived(rs.getBoolean("isArchived"));
						obj.setUpdatedBy(rs.getString("updatedBy"));
						obj.setUpdatedOn(rs.getDate("updatedOn"));
						return obj;
					}
			
				},id);

	}

	@Override
	public void addCourse(Course course) {
		
		LOGGER.info(new Timestamp(System.currentTimeMillis())+"  : Started inserting courses");
		
		jdbcTemplate.update(CourseSQLStatements.INSERT_ONE,course.getCourseId(),course.getAssessmentId(),course.getCourseDescriptionId(),course.getCourseTypeId(),course.getCreatedBy(),course.getCreatedOn(),course.getUpdatedBy(),course.getUpdatedOn(),course.getDurationId(),course.getInstructorId(),false);
	}

	@Override
	public void updateCourse(Course course) {
	
		LOGGER.info(new Timestamp(System.currentTimeMillis())+"  : Started updating course");
		jdbcTemplate.update(CourseSQLStatements.UPDATE_ONE,course.getAssessmentId(),course.getCourseDescriptionId(),
				course.getCourseTypeId(),course.getCreatedBy(),course.getCreatedOn(),course.getUpdatedBy(),course.getUpdatedOn(),course.getDurationId(),course.getInstructorId());
	}

	@Override
	public void deleteCourse(int id) {
		LOGGER.warning(new Timestamp(System.currentTimeMillis())+"  : Started soft deleting courses");
		jdbcTemplate.update(CourseSQLStatements.DELETE_ONE,id);
	}
	
}
