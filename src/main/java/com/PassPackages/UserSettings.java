package com.PassPackages;

public class UserSettings {
	
	private String ChangePassword;
	private String ForgetPassword;
	private String rememberMeMyPassword;
	
	public UserSettings(String changePassword, String forgetPassword, String rememberMeMyPassword) {
		ChangePassword = changePassword;
		ForgetPassword = forgetPassword;
		this.rememberMeMyPassword = rememberMeMyPassword;
	}
	
	public String getChangePassword() {
		return ChangePassword;
	}
	
	public void setChangePassword(String changePassword) {
		ChangePassword = changePassword;
	}
	
	public String getForgetPassword() {
		return ForgetPassword;
	}
	
	public void setForgetPassword(String forgetPassword) {
		ForgetPassword = forgetPassword;
	}
	
	public String getRememberMeMyPassword() {
		return rememberMeMyPassword;
	}
	
	public void setRememberMeMyPassword(String rememberMeMyPassword) {
		this.rememberMeMyPassword = rememberMeMyPassword;
	}
}
