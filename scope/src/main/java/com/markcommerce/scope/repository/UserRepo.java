package com.markcommerce.scope.repository;

import com.markcommerce.scope.security.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<Users, Long> {
    Optional<Users> findByUserId(Long UserId);
    Optional<Users> findByEmail(String Email);
}
