package com.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="ñountry_city")
	private String city;
	
	@Column(name="contact_details")
	private String contactDetails;
	
	@Column(name="contact_person")
	private String contactPerson;
	
	@Column(name="result")
	private String result;
	
	@Column(name="follow_up_call")
	private String followUpCall;
	
	@Column(name="sales_manager")
	private String salesManager;
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getFollowUpCall() {
		return followUpCall;
	}

	public void setFollowUpCall(String followUpCall) {
		this.followUpCall = followUpCall;
	}

	public String getSalesManager() {
		return salesManager;
	}

	public void setSalesManager(String salesManager) {
		this.salesManager = salesManager;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", companyName=" + companyName + ", ñountryCity=" + city
				+ ", contactDetails=" + contactDetails + ", contactPerson=" + contactPerson + ", result=" + result
				+ ", followUpCall=" + followUpCall + ", salesManager=" + salesManager + "]";
	}

	
		
}





