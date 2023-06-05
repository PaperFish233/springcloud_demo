package com.neusoft.po;

public class User {
	
	private Integer userId;
	private String uname;
	private String upass;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", uname=" + uname + ", upass=" + upass + ", getUserId()=" + getUserId()
				+ ", getUname()=" + getUname() + ", getUpass()=" + getUpass() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public User() {
		super();
	}
	public User(Integer userId, String uname, String upass) {
		super();
		this.userId = userId;
		this.uname = uname;
		this.upass = upass;
	}
	
	

}
