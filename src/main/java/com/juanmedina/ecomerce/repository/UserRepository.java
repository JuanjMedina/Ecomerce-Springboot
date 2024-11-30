package com.juanmedina.ecomerce.repository;

import com.juanmedina.ecomerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByName(String name);
}
