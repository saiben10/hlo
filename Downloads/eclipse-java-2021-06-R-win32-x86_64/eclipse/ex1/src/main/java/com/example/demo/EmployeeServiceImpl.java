package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class EmployeeServiceImpl implements customerService 
{    
	@Autowired
	private dao e1;
	
	public customer getcustomerById(int id) 
	{
		// TODO Auto-generated method stub
		return e1.getById(id);
	}
	//@Override
		public List<customer> getAllcustomers() {
			// TODO Auto-generated method stub
			return e1.findAll();
		}
		
	//@Override
	public int createcustomer(customer employee) {
		// TODO Auto-generated method stub
		customer createdemployee = e1.save(employee);
		return createdemployee.getId();
	}
}
