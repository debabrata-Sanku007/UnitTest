package com.debu.test;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/testService")
public class EmployeeService {
	EmployeeDAO testdao = new EmployeeDAO();

	@POST
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getMap(@PathParam("id") String id){
		System.out.println("Successful");
		Employee emp = (Employee) testdao.getMapResponse().get(id);
		if (emp == null){
			
		}
			//throw new StringNotFoundException("[" + id + "] is not Implemented..");

		return emp;
	}
}
