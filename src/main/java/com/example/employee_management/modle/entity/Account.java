package com.example.employee_management.modle.entity;

public class Account {
	private int id;
	private String account;
	private String passwork;
	private String perms;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPasswork() {
		return passwork;
	}

	public void setPasswork(String passwork) {
		this.passwork = passwork;
	}

	public String getPerms() {
		return perms;
	}

	public void setPerms(String perms) {
		this.perms = perms;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", account='" + account + '\'' +
				", passwork='" + passwork + '\'' +
				", perms='" + perms + '\'' +
				'}';
	}
}
