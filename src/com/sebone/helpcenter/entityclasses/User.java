package com.sebone.helpcenter.entityclasses;
/*
 * Class Name  -  User
 * Objective   -  This class carrying out user details.
 * @author VivekSharma
 * Date -  24 march 2022
 * 
 */
public class User {
               
	  private int userId;
	  private String userName;
	/**
	 * @param userId
	 * @param userName
	 */
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	  
	
}
