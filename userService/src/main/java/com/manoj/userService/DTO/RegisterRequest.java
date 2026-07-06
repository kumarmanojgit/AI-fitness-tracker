package com.manoj.userService.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterRequest {

    @NotBlank(message = "Email is Required")
    @Email(message = "Invalid Email format")
    private  String email;

    @NotBlank(message = "Password Must Required")
    @Size(min = 6, message = "Password Must have atleast 6 characters")
    private String password;

    private  String firstName;
    private String lastName;
}
