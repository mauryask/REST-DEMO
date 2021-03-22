// simple POJO (plain old java object) class
package com.blackhatos.restdemo;

import javax.xml.bind.annotation.XmlRootElement;

// define the root element if you want to return XML data
// here employee will be considered as the root element
// and the data members will be the internal elements

@XmlRootElement
public class Employee 
{
    private String name;
    private int id;
    private int age;
    private float salary;
	
    public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getName() 
	{
		return name;
	}
	
    public void setName(String name) 
    {
		this.name = name;
	}
	
    public int getId() {
		return id;
	}
	
    public void setId(int id) 
    {
		this.id = id;
	}

    public int getAge() 
    {
		return age;
	}
	
    public void setAge(int age)
    {
		this.age = age;
	}
	     
}
