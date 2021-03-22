package com.db;
import java.sql.*;

public class UpdateQuery 
{
	public boolean isUpdated(int id, String name) 
	{
		try 
		{
			Connection connect = new DbConnection().dbConnection();
			String query = "update employee set name = ? where id = ?";
			PreparedStatement updateEmp = connect.prepareStatement(query);
			updateEmp.setString(1, name);
			updateEmp.setInt(2, id);
			int n = updateEmp.executeUpdate(); //return number of rows changed
			return n>0 ? true : false;
			  
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}
}
