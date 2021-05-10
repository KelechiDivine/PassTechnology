package com.PassPackages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;


class UserCanCreateAddressTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@Test
	public void UserAddress() {
		UserCanCreateAddress userCanCreateAddress = new UserCanCreateAddress("312, herbert macaulay way, yaba, lagos");
		
		try {
			if (userCanCreateAddress.getAddress().equals("312, herbert macaulay way, yaba, lagos")) {
				System.out.println("Address Submission was successful!!");
			}
			else {
				System.out.println("Sorry your address doesn't match.\nPlease try updating the address.");
			}
			
			Assertions.assertEquals("312, herbert macaulay way, yaba, lagos", userCanCreateAddress.getAddress());
			userCanCreateAddress.setAddress("3, idiidid");
			System.out.println("Your address has been updated in the database..");
		}
		catch (Exception exception) {
			throw new InputMismatchException();
			
			
		}
		
	}
}