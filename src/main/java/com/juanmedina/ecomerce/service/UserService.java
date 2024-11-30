package com.juanmedina.ecomerce.service;

import com.juanmedina.ecomerce.dto.UserRequest;
import com.juanmedina.ecomerce.model.User;

public interface UserService {
    User createUser(User user);
}
