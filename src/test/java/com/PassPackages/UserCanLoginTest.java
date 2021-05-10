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
			if (userCanLoginUsingPassword.getPassword().equals("keLechiDivine5363#")) {
				System.out.print("You Logged in successfully...");
			}
			else {
				System.out.println("Your password is incorrect.\nPlease try again!");
			}
			Assertions.assertEquals("keLechiDivine5363@#", userCanLoginUsingPassword.getPassword());
		}
		catch (Exception exception) {
			throw new IOException();
		}
		
		
	}

	@Test
	public void UserCanLoginWithEmail() throws NoSuchFieldException {
		UserCanLoginUsingEmail userCanLoginUsingEmail = new UserCanLoginUsingEmail("okoroaforkelechi123@gmail.com");
		try {
			if (userCanLoginUsingEmail.getEmail().contains("@")) {
				System.out.println("Email accepted!");
			} else {
				System.out.println("Email not recognised.");
			}
			Assertions.assertEquals("okoroaforkelechi123@gmail.com", userCanLoginUsingEmail.getEmail());
			userCanLoginUsingEmail.setEmail("kdivine892@gmail.com");
			System.out.println("Email updated!!");
		}
		catch (Exception exception) {
			throw new NoSuchFieldException();
			
		}
		
		
	}
}