package com.PassPackages;

import java.util.Scanner;

public class UserCanCreate {
	
	String FirstName;
	String MiddleName;
	String LastName;
	String email;
	String address;
	int PhoneNumber;
	int zipCode;
	
	public UserCanCreate(String firstName, String middleName,
						 String lastName, String email, String address,
						 int phoneNumber, int zipCode) {
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		this.email = email;
		this.address = address;
		PhoneNumber = phoneNumber;
		this.zipCode = zipCode;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getMiddleName() {
		return MiddleName;
	}
	
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
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
	
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}


class PromptUserToCreate {
	
	public static void main(String[] args) {
		Scanner UserInput = new Scanner(System.in);
		
		System.out.print("Enter First name : ");
		String name = UserInput.next();
		
		System.out.print("Enter middle name: ");
		String middleName = UserInput.next();
		
		System.out.println("Enter last name: ");
		String lastName = UserInput.next();
		
		System.out.print("Enter Email: ");
		String email = UserInput.next();
		
		System.out.print("Enter Zip code: ");
		int ZipCode = UserInput.nextInt(4);
		
		System.out.print("Enter phone number: ");
		int PhoneNumber = UserInput.nextInt(11);
	}
	

}