package org.nijj.imac.actions;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.nijj.imac.beans.User;
import org.nijj.imac.utils.HibernateUtil;

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

	public String login() {
		System.out.println(username+":"+password);
		if(checkUser()){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}

	private boolean checkUser() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		String hql = "from User u where u.username =? and u.password =?";
		System.out.println(hql);
		List<User> users = session.createQuery(hql).setParameter(0, username).setParameter(1, password).list();
		session.close();
		if(users!=null &&users.size()>0){
			return true;
		}else{
			return false;
		}
		
	}

}
