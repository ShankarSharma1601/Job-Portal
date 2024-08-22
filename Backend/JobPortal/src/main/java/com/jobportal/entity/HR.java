package com.jobportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "hrregistration")
public class HR {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int HrId;
	private String name;
	private String email;
	private String password;
	private String phoneNumber;
	
	private String area;
	private String city;
	private String state;
	private String pincode;
	
	public HR() {
		super();
	}

	public HR(int hrId, String name, String email, String password, String phoneNumber, String area, String city,
			String state, String pincode) {
		super();
		HrId = hrId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public int getHrId() {
		return HrId;
	}

	public void setHrId(int hrId) {
		HrId = hrId;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
		return "HR [HrId=" + HrId + ", name=" + name + ", email=" + email + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", area=" + area + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
