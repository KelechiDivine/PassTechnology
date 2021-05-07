package com.PassPackages;

public class UserCanCreate {
	String name;
	String email;
	String address;
	String PhoneNumber;
	int zipCode;
	
	public UserCanCreate(String name, String email, String address, String phoneNumber, int zipCode) {
		this.name = name;
		this.email = email;
		this.address = address;
		PhoneNumber = phoneNumber;
		this.zipCode = zipCode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}