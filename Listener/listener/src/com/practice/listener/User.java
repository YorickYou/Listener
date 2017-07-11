package com.practice.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener{
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
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	@Override
	public void valueBound(HttpSessionBindingEvent evt) {
		/*
		 * 当前对象被添加到session中时被调用
		 */
		System.out.println("我是一个快乐的User，我的名称叫" + username + "！我很高兴session把我添加了！");
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		/*
		 * 当前对象被session移除时被调用
		 */
		System.out.println("我是一个倒霉的User，我的名称叫" + username + "！无情的session把我抛弃了！");
	}
}
