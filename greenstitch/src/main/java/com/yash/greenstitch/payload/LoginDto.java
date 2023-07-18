package com.yash.greenstitch.payload;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {

    @NotEmpty(message = "usernameOrEmail can not be empty")
    private String usernameOrEmail;

    @NotEmpty(message = "password can not be empty")
    private String password;
}
