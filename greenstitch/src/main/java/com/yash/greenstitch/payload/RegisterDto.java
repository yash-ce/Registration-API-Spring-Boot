package com.yash.greenstitch.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {

    @NotEmpty
	@Size(min = 4, message = "Name must be min of 4 characters !!")
    private String name;

    @NotEmpty
	@Size(min = 4, message = "Username must be min of 4 characters !!")
    private String username;

    @Email(message = "Email address is not valid !!")
	@NotEmpty(message = "Email is required !!")
    private String email;

    @NotEmpty
	@Size(min = 3, max = 10, message = "Password must be min of 3 chars and max of 10 chars !!")
    private String password;
}
