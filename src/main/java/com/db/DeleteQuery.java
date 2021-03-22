package com.db;
import java.sql.*;

public class DeleteQuery
{
   public boolean isDeleted(Employee emp)
   {
	   try
	   {
		   Connection connect = new DbConnection().dbConnection();
		   String query = "delete from employee where id = ?";
		   PreparedStatement st = connect.prepareStatement(query);
		   st.setInt(1,emp.getId());
		   int n = st.executeUpdate();
		   return n>0 ? true : false;
	   }
	   catch(Exception ex)
	   {
		   ex.printStackTrace();
		   return false;
	   }
   }
}
