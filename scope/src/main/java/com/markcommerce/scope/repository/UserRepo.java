package com.markcommerce.scope.repository;
import com.markcommerce.scope.security.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
    Optional<Users> findByUserId(Long UserId);
    Optional<Users> findByEmail(String Email);
}
