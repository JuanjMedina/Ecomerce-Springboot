package com.juanmedina.ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDetailsRepository extends JpaRepository<com.juanmedina.ecomerce.model.CartDetails, Long> {
}
