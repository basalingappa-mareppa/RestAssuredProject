package com.api.model.request;

public class LogiRequest {
	
	private String username;
	
	public LogiRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	private String password;
	@Override
	
	public String toString() {
		return "LogiRequest [username=" + username + ", password=" + password + "]";
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
