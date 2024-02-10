package com.karina.one_to_one_join;

public class Emp1 {
	int id;
	String name;
	String dept;
	
	int pincode;
	String city;
	public Emp1(int id, String name, String dept, int pincode, String city) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.pincode = pincode;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
