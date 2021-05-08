package com.PassPackages;

public class UserCanLogin {
	
	String Password;
	String UserName;
	
	public UserCanLogin(String password, String userName) {
		Password = password;
		UserName = userName;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getUserName() {
		return UserName;
	}
	
	public void setUserName(String userName) {
		UserName = userName;
	}
}
