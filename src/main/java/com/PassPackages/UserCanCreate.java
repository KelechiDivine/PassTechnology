package com.PassPackages;


class UserCanCreateEmail {
	public String email;
	
	public UserCanCreateEmail(String email) {
		this.email = email;
	}
}

// Address method

class UserCanCreateAddress {
	public String address;
	
	public UserCanCreateAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}

// Phone Number method

class UserCanCreatePhoneNumber {
	public int phoneNumber;
	
	public UserCanCreatePhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		phoneNumber = phoneNumber;
	}
}


class UserCanCreateZipCode{
	private int zipCode;
	
	public UserCanCreateZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}