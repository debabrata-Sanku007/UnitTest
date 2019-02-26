package com.debu.test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDAO {
	Map<String, Employee> maps = new HashMap<String, Employee>();
	public EmployeeDAO(){
		maps.put("one", new Employee(1,"Debu","Kolkata"));
		maps.put("two", new Employee(2,"Sanku","Kolkata"));
		maps.put("three", new Employee(3,"Mohit","Kolkata"));
	}
	public Map<String, Employee> getMapResponse(){
		return maps;
	}
}
