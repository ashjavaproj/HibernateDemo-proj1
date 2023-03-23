package com.tcs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class User {
@Id
	private int userId;
	private String userName;
	private String  password;
	private String emailId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
