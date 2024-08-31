package com.jobportal.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.jobportal.dto.AccountType;
import com.jobportal.dto.UserDTO;

import lombok.*;

@Getter
@Setter 
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="users")
public class User {
	@Id
	private String id;
	private String name;
	@Indexed(unique=true)
	private String email;
	private String password;
	private AccountType accountType;
	
	
	
	public User(String id, String name, String email, String password, AccountType accountType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.accountType = accountType;
	}

	public UserDTO toDTO() {
		return new UserDTO(this.id , this.name , this.email , this.password , this.accountType);
	}
}
