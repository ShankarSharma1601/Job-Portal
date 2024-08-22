package com.jobportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "adminapproval")
public class AdminApproval {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String email;
	private String phoneNUmber;
	private String approvalStatus;
	
	@JoinColumn(name = "HrId")
	private int approveHrId;

	public AdminApproval() {
		super();
	}

	public AdminApproval(int id, String name, String email, String phoneNUmber, String approvalStatus,
			int approveHrId) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.phoneNUmber = phoneNUmber;
		this.approvalStatus = approvalStatus;
		this.approveHrId = approveHrId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getPhoneNUmber() {
		return phoneNUmber;
	}

	public void setPhoneNUmber(String phoneNUmber) {
		this.phoneNUmber = phoneNUmber;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public int getApproveHrId() {
		return approveHrId;
	}

	public void setApproveHrId(int approveHrId) {
		this.approveHrId = approveHrId;
	}

	@Override
	public String toString() {
		return "AdminApproval [Id=" + Id + ", name=" + name + ", email=" + email + ", phoneNUmber=" + phoneNUmber
				+ ", approvalStatus=" + approvalStatus + ", approveHrId=" + approveHrId + "]";
	}
	
}
