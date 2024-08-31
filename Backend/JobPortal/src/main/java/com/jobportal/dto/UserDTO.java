package com.jobportal.dto;

import com.jobportal.entity.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter 
@ToString 
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	private String id;
	@NotBlank(message="{user.name.absent}")
	private String name;
	@NotBlank(message="{user.email.absent}")
	@Email(message="{user.email.invalid}")
	private String email;
	@NotBlank(message="{user.password.absent}")
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,15}$" , message="{user.password.invalid}")
	private String password;
	private AccountType accountType;

	public UserDTO(String id, String name, String email, String password, AccountType accountType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.accountType = accountType;
	}

	public User toEntity() {
		return new User(this.id , this.name , this.email , this.password , this.accountType);
	}
}
