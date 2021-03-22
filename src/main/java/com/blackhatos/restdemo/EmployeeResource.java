package com.blackhatos.restdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("employeeresource")
public class EmployeeResource 
{
   @GET
   public Employee getEmloyeeData()
   {
	   Employee e = new Employee();
	   e.setName("Alex");
	   e.setId(12036);
       e.setAge(35);
       return e;
   }
}
