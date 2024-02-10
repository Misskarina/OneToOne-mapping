package com.karina.one_to_one_join;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String city;
	int pincode;
	
	@OneToOne(cascade=CascadeType.ALL)
	Emp emp;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String city, int pincode, Emp emp) {
		super();
		this.id = id;
		this.city = city;
		this.pincode = pincode;
		this.emp = emp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
	
	
	
	
	

}
