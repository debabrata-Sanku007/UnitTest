package com.debu.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class EmployeeServiceTest {
	
	@Test
	public void testGetMap() {
		EmployeeService employeeService=new EmployeeService();
		Employee emp=employeeService.getMap("one");
		int expage=emp.getAge();
		System.out.println(expage);
	}
}
