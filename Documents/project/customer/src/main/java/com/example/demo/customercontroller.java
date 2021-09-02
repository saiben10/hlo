package com.example.demo;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customercontroller 
{
	
	@Autowired
	private customerservice service;
	
	@GetMapping("/customer/{id}")
	 public customer getcustomer(@PathVariable int id)
	 
	 {
		customer employee =  service.getcustomerById(id);
		if(employee == null)
			throw new EmployeeNotFoundException("not found");
		 return employee; 
	 }
	
	@GetMapping("/customer")
	public List<customer> getAllcustomers()
	
	{
		return service.getAllcustomers();
	}
	
	@PostMapping("/customer")
	public int createcustomer(@RequestBody customer employee)
	{
		return service.createcustomer(employee);
	}
	 

}

