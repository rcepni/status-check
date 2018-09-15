package com.automationpractice.cucumberfromscratch.beans;

//beans  --> used to represent a certain type of object
//pojo  --> plain old java object
//model  -->  used to represent a certain type of object


public class User {

	
	String firstName;
	String lastName;
	String company ;	
	String address;
	String city;
	
	 
	public User(String firstName, String lastName, String address, String city, String company) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.address = address;
		this.city = city;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

	
	
}
