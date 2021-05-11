package com.PassPackages;

public class UserCanCreateName {
	private String firstName;
	private String lastName;
	private String middleName;
	
	
	public UserCanCreateName(String firstName, String lastName, String middleName)throws Exception {
		if(!firstName.equals("") &&!lastName.equals("")&&!middleName.equals("")){this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;}
		else {
			throw new Exception("The name cannot be empty");
		}
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
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
}
