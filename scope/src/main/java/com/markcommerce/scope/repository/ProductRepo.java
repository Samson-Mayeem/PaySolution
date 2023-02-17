package com.markcommerce.scope.repository;

import com.markcommerce.scope.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepo extends JpaRepository <Product, Long> {
    Optional<Product> findById(Long ProductId);
    Optional<Product> findByName(String Name);
    Optional<Product> findByIdOrName(Long ProductId, String Name);
}
