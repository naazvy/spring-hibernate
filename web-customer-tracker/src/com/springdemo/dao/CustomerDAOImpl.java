package com.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer", Customer.class);
		
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		//save or update the customer 
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int customerId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrive/read from database using primary key
	Customer theCustomer = currentSession.get(Customer.class, customerId);
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		//get the current hebernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//delete the item with primary key
		Query theQuery = currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", customerId);
		theQuery.executeUpdate();
	}
    
	
}






