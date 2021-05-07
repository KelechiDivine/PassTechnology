package com.PassPackages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserCanDeleteAccountTest {
	
	@org.junit.jupiter.api.BeforeEach
	void setUp() {
	}
	
	@Test
	 public void UserCanLogin(){
		UserCanCreate userCanCreate = new UserCanCreate("okoroafor kelechi",
				"okoroaforkelechi123@gmail.com",
				"3, owojori street, Ogun state");
		Assertions.assertEquals("okoroafor kelechi", userCanCreate.getName());
	}

}
