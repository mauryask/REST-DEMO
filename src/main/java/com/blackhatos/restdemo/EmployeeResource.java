package com.blackhatos.restdemo;
import java.util.List;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.db.*;
import java.sql.*;

// this tag defines the URI path
@Path("/employees")
public class EmployeeResource 
{
	  EmployeeRepo empRepo = new EmployeeRepo();
	
  //this tag specifies that respond to get request	
   @GET
  //this tag specifies which format of data we want to return
   //@Produces(MediaType.APPLICATION_JSON) 
   @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) 
   public List<Employee> getEmloyeeData()
   {
	   // (1)
	   /*Employee e1 = new Employee();
	   e1.setName("Alex");
	   e1.setId(12036);
       e1.setAge(35);
       e1.setSalary(1254544.25f);
       
       Employee e2 = new Employee();
	   e2.setName("Bob");
	   e2.setId(14523);
       e2.setAge(24);
       e2.setSalary(321458.75f);*/
       
	   // (2)
       //returning single object at a time
       //return e1
       
	   // (3)
       // returning multiple objects at a time
       //List<Employee> employee = Arrays.asList(e1, e2);
       //return employee;
       
       // (4)
       // returning data of particular employee
	   return empRepo.getEmployees();
   }
   
   // this method demonstrates how to accept data from
   // clients, use post method since we are accepting the data
   // may be you are inserting this data into the database
   // i specified path so u have to use URI (employees/employee)
   // to add employee
   
   /*
    * But the question is how to supply the data from client 
    * as we are using the post request (of course we need some client application 
    * but it does'nt have right now)
    * The solution is post man that is basically used to test your API
    * we can supply the post data using the postman
    * */
  
   
   @POST
   @Path("employee")
   public Employee createEmployee(Employee e)
   {
	   System.out.println(e);
	   empRepo.create(e);
	   return e;
   }
   
   
   // getting data of a particular employee
   @GET
   @Path("employee/{id}") //supplying parameters
  // @Produces(MediaType.APPLICATION_JSON)
   // in case you want to work with XML data format
   //@Produces(MediaType.APPLICATION_XML) 
   
   
   /*
    * this is called "Content Negotiation" that means
    * you can return data in what ever format the user wants 
    * */
   @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) 
   public Employee getParticularEmployee(@PathParam("id") int id)
   {
	   return empRepo.getEmployee(id);
   }
   
   /*
    * These method demonstrates how to 
    * make data available on the Internet from the database
    * */
   
   @GET
   @Path("dbconnect")
   @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
   public List<com.db.Employee> getEmployeeDatafromDb()
   {
	   SelectQuery sq = new SelectQuery();
	   return sq.selectStatement();
   }
   
   
   // in order to work following 2 method don't specify
   // produces tag for them
   @POST
   @Path("dbupdate")
   public String update(com.db.Employee emp)
   {
	  UpdateQuery uq = new UpdateQuery();
	  return  uq.isUpdated(emp.getId(), emp.getName())? "Updated successfully" : "Failed to update";
   }
   
   
   @POST
   @Path("dbinsert")
   public String insert(com.db.Employee emp)
   {
	   InsertQuery iq = new InsertQuery();
	   return iq.isInserted(emp) ? "Inserted Successfully" : "Failed to insert";
   }
   
   
   @POST
   @Path("dbdelete")
   public String delete(com.db.Employee emp)
   {
	   DeleteQuery dq = new DeleteQuery();
	   return dq.isDeleted(emp) ? "Deleted Successfully" : "Failed to delete";
   }
   
}
