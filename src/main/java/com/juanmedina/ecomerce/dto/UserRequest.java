package com.juanmedina.ecomerce.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UserRequest {
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email is not valid")
    private String email;
    @NotBlank(message = "Password is mandatory")
    private String password;
    @NotBlank(message = "Direction is mandatory")
    private String direction;
    @NotBlank(message = "Phone is mandatory")
    @Positive(message = "Phone is not valid")
    private String phone;

}
