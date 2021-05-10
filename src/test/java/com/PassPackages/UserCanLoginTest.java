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
		UserCanLoginUsingPassword userCanLoginUsingPassword = new UserCanLoginUsingPassword("");
		try {
			if (userCanLoginUsingPassword.getPassword().equals("keLechiDivine5363@#")) {
				System.out.print("You Logged in successfully...");
			}
			else {
				//user password can't be empty else it throws error
				if (userCanLoginUsingPassword.getPassword().isEmpty()){
					System.out.println("Your password field can't be empty.");
				}
				else {
					System.out.println("An incorrect password, Please try again!");
				}
			}
			Assertions.assertEquals("", userCanLoginUsingPassword.getPassword());
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
			}
			else {
				if (userCanLoginUsingEmail.getEmail().isEmpty()) {
					System.out.println("Email field can't be empty");
				}
				else {
					System.out.println("Email not recognised.");
				}
				Assertions.assertEquals("okoroaforkelechi123@gmail.com", userCanLoginUsingEmail.getEmail());
				userCanLoginUsingEmail.setEmail("kdivine892@gmail.com");
				System.out.println("Dear Customer your email has been updated..");
			}
		}
		catch (Exception exception) {
			throw new NoSuchFieldException();
			
		}
		
		
	}
}