package com.markcommerce.scope.repository;

import com.markcommerce.scope.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.OptionalInt;

public interface CategoryRepo extends JpaRepository<Category, Long> {
    Optional<Category> findById(Long categoryId);
    Optional<Category> findByName(String name);
    Optional<Category> findByIdOrName(Long categoryId, String name);
}
