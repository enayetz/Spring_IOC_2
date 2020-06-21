package com.nt.ioc2;


public class Users {

	private String[] users;

	public Users() {
		System.out.println("Users constructor");
	}
	
	public void setUsers(String[] users) {
		this.users = users;
	}

	public void display() {
		for (String str : users) {
			System.out.println(str);
		}
	}

}
