package com.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springdemo.dao.CustomerDAO;
import com.springdemo.entity.Customer;
import com.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//need to inject customerService
	@Autowired
	private CustomerService customerService;

	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers
		List<Customer> theCustomers = customerService.getCustomers();
				
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd (Model theModel) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("customers", theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCuatomer(@ModelAttribute("customers") Customer theCustomer){
		//save the customer using service
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
		
	}
	@GetMapping("/showFormForUpdate")
	public String updateCuatomer(@RequestParam("customerId") int customerId, Model theModel){
		//get the customer from the service
		Customer theCustomer = customerService.getCustomer(customerId);
		
		//set customer as a model attribute to pre-populate the form
		theModel.addAttribute("customers", theCustomer);
		
	//sent over to our form
		return "customer-form";
		
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int customerId, Model theModel){
		//delete the customer
		customerService.deleteCustomer(customerId);
		
		//set customer as a model attribute to pre-populate the form
		theModel.addAttribute("customers", customerId);
		
	//sent over to our form
		return "redirect:/customer/list";
		
	}
}


