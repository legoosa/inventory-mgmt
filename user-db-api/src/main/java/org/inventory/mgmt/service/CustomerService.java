package org.inventory.mgmt.service;

import org.inventory.mgmt.dao.CustomerDao;
import org.inventory.mgmt.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao custDao;
	
	public Customer add(Customer cust) {
		return custDao.save(cust);
	}
}
