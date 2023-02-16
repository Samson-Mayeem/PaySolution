package com.markcommerce.scope.repository;

import com.markcommerce.scope.models.Cart;
import com.markcommerce.scope.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepo extends JpaRepository<Cart, Long> {
    Optional<Cart> findById(Long CartId);
    Optional<Cart> findByName(String Name);
}
