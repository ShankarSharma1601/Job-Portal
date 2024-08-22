package com.jobportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "userregistration")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String name;
	private String email;
	private String password;
	private String phonenumber;
	
	private String area;
	private String city;
	private String state;
	private String pincode;
	
	public User(int userId, String name, String email, String password, String phonenumber, String area, String city,
			String state, String pincode) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public User() {
		super();
	}

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", phonenumber=" + phonenumber + ", area=" + area + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	
}
