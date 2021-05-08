package com.PassPackages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserCanDeleteAccountTest {
	
	@org.junit.jupiter.api.BeforeEach
	void setUp() {
	}
	
	@Test
	 public void GetUserLoginDetails(){
		UserCanCreate userCanCreate = new UserCanCreate("okoroafor", "kelechi",
				"Divine",
				"okoroaforkelechi123@gmail.com",
				"3, owojori street, Ogun state",82167764, 1234);
		Assertions.assertEquals("okoroafor", userCanCreate.getFirstName());
		
	}
	
	@Test
	public  void SetANewUserName(){
		UserCanCreate SetUserName = new UserCanCreate("okoroafor", "kelechi",
				"Divine",
				"okoroaforkelechi123@gmail.com",
				"3, owojori street, Ogun state",82167764, 1234);
		Assertions.assertEquals("Kelechi Divine",SetUserName.getLastName());
	}
	
	@Test
	public  void SetANewAddress(){
		UserCanCreate userCanChangeAddress = new UserCanCreate("okoroafor", "kelechi",
				"Divine",
				"okoroaforkelechi123@gmail.com",
				"3, owojori street, Ogun state",82167764, 1234);
		Assertions.assertEquals("312 herbert macaulay, yaba, lagos", userCanChangeAddress.getAddress());
	}
	
	@Test
	public  void UserCanSetEmail(){
		UserCanCreate userCanEmail = new UserCanCreate("okoroafor", "kelechi",
				"Divine",
				"okoroaforkelechi123@gmail.com",
				"3, owojori street, Ogun state",826167764, 1234);
		Assertions.assertEquals("kdivine892@gmail.com", userCanEmail.getEmail());
		
	}
	
}
	


