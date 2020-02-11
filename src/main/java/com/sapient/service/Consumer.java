package com.sapient.service;

import java.util.Date;

public class Consumer {
	private int consumerId;
	private String userName;
	private Date dateOfBirth;
	private long mobile;
	private String password;
	private String email;
	private Grade grading;
	private String foodStoreName;
	
	public int getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Grade getGrading() {
		return grading;
	}
	public void setGrading(Grade grading) {
		this.grading = grading;
	}
	public String getFoodStoreName() {
		return foodStoreName;
	}
	public void setFoodStoreName(String foodStoreName) {
		this.foodStoreName = foodStoreName;
	}
	@Override
	public String toString() {
		return "Consumer [consumerId=" + consumerId + ", userName=" + userName + ", dateOfBirth=" + dateOfBirth
				+ ", mobile=" + mobile + ", password=" + password + ", email=" + email + ", grading=" + grading
				+ ", foodStoreName=" + foodStoreName + "]";
	}
	
}
