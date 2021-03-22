package com.db;
import java.sql.*;

public class InsertQuery {
  public boolean isInserted(Employee emp)
  {
	       Connection connect = new DbConnection().dbConnection();
	
			PreparedStatement ps;
			try {
				ps = connect.prepareStatement("insert into employee (address, name, salary) values(?,?,?)");
				
				ps.setString(1,emp.getAddress());
				ps.setString(2, emp.getName());
				ps.setFloat(3, emp.getSalary());
			
				int n = ps.executeUpdate(); 
				
				return n>0 ? true : false;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
				return false;
			} 
  }
}
