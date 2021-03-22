package com.blackhatos.restdemo;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// this tag defines the URI path
@Path("/employee")
public class EmployeeResource 
{
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
	   EmployeeRepo empRepo = new EmployeeRepo();
	   return empRepo.getEmployees();
   }
}
