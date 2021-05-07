package com.PassPackages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserCanDeleteAccountTest {
	
	@org.junit.jupiter.api.BeforeEach
	void setUp() {
	}
	
	@Test
	 public void GetUserLoginDetails(){
		UserCanCreate userCanCreate = new UserCanCreate("okoroafor kelechi",
				"okoroaforkelechi123@gmail.com",
				"3, owojori street, Ogun state","08082167764", 123);
		Assertions.assertEquals("okoroafor kelechi", userCanCreate.getName(), userCanCreate.getPhoneNumber());
		
	}
	
	@Test
	public  void SetANewUserName(){
		UserCanCreate SetUserName = new UserCanCreate("okoroafor kelechi",
				"okoroaforkelechi123@gmail.com",
				"3, owojori street, Ogun state","08082167764", 123);
		SetUserName.setName("Kelechi Divine");
		Assertions.assertEquals("Kelechi Divine",SetUserName.getName());
		
	}
	
	@Test
	public  void SetANewAddress(){
		UserCanCreate userCanChangeAddress = new UserCanCreate("okoroafor kelechi",
				"okoroaforkelechi123@gmail.com",
				"3, owojori street, Ogun state","08082167764", 123);
		userCanChangeAddress.setAddress("312 herbert macaulay, yaba, lagos");
		Assertions.assertEquals("312 herbert macaulay, yaba, lagos", userCanChangeAddress.getAddress());
	}
	
}
	


