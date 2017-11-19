package com.mywork.living.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.mywork.living.entity.User;

@Repository
public class UserDao {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public User getUserById(String userId){
		String sql = "";
		jdbcTemplate.query(sql, new Object[]{userId}, new RowCallbackHandler(){

			public void processRow(ResultSet arg0) throws SQLException {
				// 匿名类
				
			}
			
		});
		return null;
	}
	
	public void updateUserInfo(String userId){
		
	}
}
