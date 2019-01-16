package com.cg.mpa.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.mpa.exception.MPAException;
import com.cg.mpa.model.Mobile;
import com.cg.mpa.utility.JdbcUtility;

public class MobileDAOImp implements MobileDAO {
	Statement statement=null;
	PreparedStatement preparedStatement=null;
	Connection connection=null;
	ResultSet resultSet=null;
	Mobile mobile=new Mobile();

	@Override
	public int insertDetails(Mobile mobile) throws MPAException {
		// TODO Auto-generated method stub
		connection=JdbcUtility.getConnection();
        int value=0; 
		try {
			preparedStatement=connection.prepareStatement(QuerMapper.insertDetails);
			preparedStatement.setInt(1,mobile.getMobileId());
			preparedStatement.setString(2,mobile.getMobileName());
			preparedStatement.setDouble(3,mobile.getMobilePrice());
			preparedStatement.setInt(4,mobile.getMobileQuantity());
			
			value=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
           throw new MPAException("prepared statement not created");
		}
		finally {
			try {
				preparedStatement.close();
				
			}catch(SQLException e)
			{
				throw new MPAException("Statement not closed");
			}
			try {
				connection.close();
			}
			catch(SQLException e)
			{
				throw new MPAException("connection not closed");
			}
		}
		
		
		
		
		
		
		return value;
	}

	@Override
	public List<String> viewDetails(Mobile mobile) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		connection=JdbcUtility.getConnection();
		resultSet=;
		
		
		
		return list;
	}

}
