package com.PassPackages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class UserCanLoginTest {
	@BeforeEach
	void setUp() {
	}
	
	@Test
	public void UserCanLoginWithPassword() throws Exception {
		UserCanLoginUsingPassword userCanLoginUsingPassword = new UserCanLoginUsingPassword("keLechiDivine5363@#");
		try {
			if (userCanLoginUsingPassword.getPassword().equals("keLechiDivine5363@#")) {
				System.out.println("You Logged in successfully...");
			} else {
				System.out.println("Your password is incorrect.\nPlease try again!");
			}
			Assertions.assertEquals("keLechiDivine5363@#", userCanLoginUsingPassword.getPassword());
		} catch (Exception exception) {
			throw new IOException();
		}
		
		
	}

//	@Test
//	public void UserCanLoginWithEmail(){
//		UserCanLogin userCanLogin = new UserCanLogin()
//	}
//}
}