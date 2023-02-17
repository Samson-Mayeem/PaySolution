package com.markcommerce.scope.repository;

import com.markcommerce.scope.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.OptionalInt;


@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
    Optional<Category> findById(Long categoryId);
    Optional<Category> findByName(String name);
}
