package com.blackhatos.restdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeResource 
{
   @GET
   @Produces(MediaType.APPLICATION_XML)
   public Employee getEmloyeeData()
   {
	   System.out.println("GetEmployee Called!");
	   Employee e = new Employee();
	   e.setName("Alex");
	   e.setId(12036);
       e.setAge(35);
       return e;
   }
}
