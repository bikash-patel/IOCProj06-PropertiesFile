package com.bikash.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("prop")
public class Properties {
	
	//Assigning value from property file
	@Value("${emp.empname}")
	private String name;
	@Value("${emp.designation}")
    private String designation;
	@Value("${emp.salary}")
    private double salary;
	@Value("Odisha")  //Hard Coding the value , we can directly assign 
    private String city;
    
    @Override
	public String toString() {
		return "Properties [name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}
}
