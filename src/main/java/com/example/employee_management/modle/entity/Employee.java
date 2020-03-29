package com.example.employee_management.modle.entity;

public class Employee {
	private Integer emplNum;
	private String emplName;
	private String duty;
	private String sex;
	private Integer age;
	private String  address;

	public Integer getEmplNum() {
		return emplNum;
	}

	public void setEmplNum(Integer emplNum) {
		this.emplNum = emplNum;
	}

	public String getEmplName() {
		return emplName;
	}

	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"emplNum=" + emplNum +
				", emplName='" + emplName + '\'' +
				", duty='" + duty + '\'' +
				", sex='" + sex + '\'' +
				", age=" + age +
				", address='" + address + '\'' +
				'}';
	}
}
