package com.markcommerce.scope.repository;

import com.markcommerce.scope.models.Cart;
import com.markcommerce.scope.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepo extends JpaRepository<Cart, Long> {
    Optional<Cart> findById(Long CartId);
    Optional<Cart> findByName(String Name);
}
