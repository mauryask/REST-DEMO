// this class demonstrates how to return 
// a particular employee instead of returning 
// the all the employees

package com.blackhatos.restdemo;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo 
{
  List<Employee> employee = null;
  
  public EmployeeRepo() 
  {
	    employee = new ArrayList<Employee>();
    
	    Employee e1 = new Employee();
	    e1.setName("Alex");
	    e1.setId(12036);
        e1.setAge(35);
        e1.setSalary(1254544.25f);
    
        Employee e2 = new Employee();
	    e2.setName("Bob");
	    e2.setId(14523);
	    e2.setAge(24);
	    e2.setSalary(321458.75f);
	    
	    employee.add(e1);
	    employee.add(e2);
  }
  
  
  public List<Employee> getEmployees()
  {
	  return employee;
  }
  
  public Employee getEmployee(int id)
  {
	  for(Employee e : employee)
	  {
		  if(e.getId() == id)
			  return e;
	  }
	  
	  return null;
  }
  
}
