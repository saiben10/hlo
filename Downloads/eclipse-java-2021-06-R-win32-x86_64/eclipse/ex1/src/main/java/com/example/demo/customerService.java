package com.example.demo;

import java.util.List;

public interface customerService 
{
	
	customer getcustomerById(int id);
	List<customer> getAllcustomers();
	int createcustomer(customer employee);

}
