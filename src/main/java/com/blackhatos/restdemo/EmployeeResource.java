package com.blackhatos.restdemo;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// this tag defines the URI path
@Path("/employees")
public class EmployeeResource 
{
	  EmployeeRepo empRepo = new EmployeeRepo();
	
  //this tag specifies that respond to get request	
   @GET
  //this tag specifies which format of data we want to return
   @Produces(MediaType.APPLICATION_XML) 
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
   @Path("/employee")
   public void createEmployee(Employee e)
   {
	   empRepo.create(e);
   }
   
}
