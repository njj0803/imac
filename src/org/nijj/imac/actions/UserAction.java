package org.nijj.imac.actions;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2516059548074284144L;
	private String username;
	private String password;
	
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

	public String login(){
		System.out.println(username);
		System.out.println(password);
		return SUCCESS;
	}
	
	private boolean checkUser(){
		
		return false;
	}

}
