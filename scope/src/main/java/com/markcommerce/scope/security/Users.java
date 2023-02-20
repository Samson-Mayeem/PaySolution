package com.markcommerce.scope.security;
import javax.persistence.*;
import com.markcommerce.scope.security.Enums.UserRole;


@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private Long UserId;
    private String Email;
    private String Password;
    private UserRole Role;
    public Long getUserId() {
        return UserId;
    }
    public void setUserId(Long userId) {
        UserId = userId;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public UserRole getRole() {
        return Role;
    }
    public void setRole(UserRole role) {
        Role = role;
    }
    public Users(Long userId, String email, String password, UserRole role) {
        UserId = userId;
        Email = email;
        Password = password;
        Role = role;
    }
    public Users(String email, String password, UserRole role) {
        Email = email;
        Password = password;
        Role = role;
    }
    public Users() {
    }
}
