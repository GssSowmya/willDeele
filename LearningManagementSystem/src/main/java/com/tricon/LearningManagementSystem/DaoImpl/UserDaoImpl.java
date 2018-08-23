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

import com.tricon.LearningManagementSystem.Constants.UserSQLStatements;
import com.tricon.LearningManagementSystem.Dao.UserIDao;
import com.tricon.LearningManagementSystem.Model.User;

@Repository

public class UserDaoImpl implements UserIDao,UserSQLStatements{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private static final Logger LOGGER = Logger.getLogger( UserDaoImpl.class.getName() );
	
	
	@Override
	public List<User> getAllUsers() {
		
		LOGGER.info(new Timestamp(System.currentTimeMillis())+"  :Started Fetching All Users");
		
		List<User> listUsers=jdbcTemplate.query(UserSQLStatements.FETCH_ALL,new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				if(rs.getBoolean("isArchived")==false) {
				User obj=new User();
				obj.setUserId(rs.getInt("userId"));
				obj.setUserName(rs.getString("userName"));
				obj.setUserAddress(rs.getString("userAddress"));
				obj.setUserContact(rs.getString("userContact"));
				obj.setIsArchived(rs.getBoolean("isArchived"));
				return obj;}
				return null;
			}
			
		});
		
		LOGGER.info(new Timestamp(System.currentTimeMillis())+"  :Completed Fetching All Users");
		
		return listUsers;
	}
}
