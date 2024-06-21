package com.ygorportes.api_rest.repository;

import com.ygorportes.api_rest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
