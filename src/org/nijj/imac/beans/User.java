package org.nijj.imac.beans;

import java.util.Date;

public class User {

	private int id;
	private String username;
	private String password;
	private Date modify;
	private String name;
	private String email;
	private String telephone;
	private int role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getModify() {
		return modify;
	}
	public void setModify(Date modify) {
		this.modify = modify;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", modify=" + modify + ", name="
				+ name + ", email=" + email + ", telephone=" + telephone + ", role=" + role + "]";
	}
	
}
