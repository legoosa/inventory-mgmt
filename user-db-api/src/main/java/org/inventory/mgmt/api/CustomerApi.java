package org.inventory.mgmt.api;

import org.inventory.mgmt.model.Customer;
import org.inventory.mgmt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/customer/")
public class CustomerApi {
	
	@Autowired
	private CustomerService custService;
	
	@PostMapping(value = "/add")
	public Customer add(@RequestBody Customer cust) {
		return custService.add(cust);
	}
}
