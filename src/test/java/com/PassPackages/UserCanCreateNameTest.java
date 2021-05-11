package com.PassPackages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserCanCreateNameTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	public void UserName()throws Exception{
		UserCanCreateName userCanCreateName = new UserCanCreateName("kelechi", "Divine", "Kelechi");
		Assertions.assertEquals("kelechi",userCanCreateName.getFirstName());
//
	}
}