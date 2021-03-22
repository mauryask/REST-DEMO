package com.db;
import java.sql.*;

public class DbConnection 
{
	public  Connection dbConnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
			return connection;
		   
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
}
