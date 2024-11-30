package com.juanmedina.ecomerce.service;

import com.juanmedina.ecomerce.model.User;
import com.juanmedina.ecomerce.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        if (userRepository.findByName(user.getName()) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already exist");
        }
        return userRepository.save(user);
    }


}



