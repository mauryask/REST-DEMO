// this class demonstrates how to return 
// a particular employee instead of returning 
// the all the employees

package com.blackhatos.restdemo;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo 
{
  List<Employee> employees = null;
  
  public EmployeeRepo() 
  {
	    employees = new ArrayList<Employee>();
    
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
	    
	    employees.add(e1);
	    employees.add(e2);
  }
  
  
  public List<Employee> getEmployees()
  {
	  return employees;
  }
  
  public Employee getEmployee(int id)
  {
	  for(Employee e : employees)
	  {
		  if(e.getId() == id)
			  return e;
	  }
	  
	  return null;
  }

// creating an employee
// here you can insert data into the database
  
public void create(Employee e) {
	employees.add(e);
}

}
