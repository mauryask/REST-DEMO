package com.db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectQuery 
{
	
	List<Employee> list = null;
	public SelectQuery() 
	{
		list = new ArrayList<Employee>();
	}
	
	public List<Employee> selectStatement()
	{
		try 
		{		
			Connection connect = new DbConnection().dbConnection();
			String query = "select * from employee";
			Statement st= connect.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				Employee emp = new Employee();
				emp.setId(rs.getInt(3));
				emp.setName(rs.getString(1));
				emp.setAddress(rs.getString(4));
				emp.setSalary(rs.getFloat(2));
				list.add(emp);
			}
			
			return list;
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			return list;
		}
	}
}
