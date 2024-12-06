package com.juanmedina.ecomerce.repository;

import com.juanmedina.ecomerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {

}
