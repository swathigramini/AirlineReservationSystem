package com.capgemini.airlinereservationsystem1.bean;

public class Admin {
	private String adminPassword;
	private String adminName;
	private String adminEmail;
	private long adminMobile;
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public long getAdminMobile() {
		return adminMobile;
	}
	public void setAdminMobile(long mobile) {
		this.adminMobile = mobile;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPassword=" + adminPassword + ", adminName=" + adminName
				+ ", adminEmail=" + adminEmail + ", adminMobile=" + adminMobile + "]";
	}
	

}
