package com.PassPackages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.EmptyStackException;



class UserSettingsTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	public void forgetPassword() throws Exception {
		FirgetPassword firgetPassword = new FirgetPassword("newPasswords");
		
		try {
			String password = "oldPassword";
			password.replace("oldPassword", "newPasswords");
			
			if (firgetPassword.getForgetPassword().contains("oldPassword")) {
				System.out.println("Try To Login With Your Old Password.");
			} else {
				if (firgetPassword.getForgetPassword().isEmpty()) {
					System.out.println("Password Field Can't Be Empty.. ");
				}
				Assertions.assertEquals("newPasswords", firgetPassword.getForgetPassword());
				firgetPassword.setForgetPassword("newPasswords.");
				System.out.println("Your password was updated!");
			}
		} catch (EmptyStackException emptyStackException) {
			throw new Exception();
		}
		
		
	}
	
	@Test
	public void ChangeEmail() throws Exception {
		UserCanChangeEmail userCanChangeEmail = new UserCanChangeEmail("chinwenduokoroafor@gmail.com");
		
		try {
			String changeEmail = "okoroaforkelechi123@gmail.com";
			changeEmail.replace("okoroaforkelechi123@gmail.com", "chinwenduokoroafor@gmail.com");
			
			if (userCanChangeEmail.getChangeEmail().contains("okoroaforkelechi123@gmail.com")) {
				System.out.println("Log on failed..");
			} else {
				if (userCanChangeEmail.getChangeEmail().isEmpty()) {
					System.out.println("Email Field Can't Be Empty.. ");
				}
				Assertions.assertEquals("chinwenduokoroafor@gmail.com", userCanChangeEmail.getChangeEmail());
				userCanChangeEmail.setChangeEmail("chinwenduokoroafor@gmail.com");
				System.out.println("Email verified!");
			}
		} catch (Exception exception) {
			throw new IOException();
		}
	}
}