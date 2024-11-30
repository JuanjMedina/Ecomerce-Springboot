package com.juanmedina.ecomerce.controller;

import com.juanmedina.ecomerce.dto.UserRequest;
import com.juanmedina.ecomerce.model.User;
import com.juanmedina.ecomerce.service.UserServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private UserServiceImpl userService;

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@Valid @RequestBody UserRequest userRequest) {
        User user = User.builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .direction(userRequest.getDirection())
                .phone(userRequest.getPhone())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }




}
