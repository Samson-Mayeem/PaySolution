package com.markcommerce.scope.models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table
public class Cart {
    @SequenceGenerator(name = "cart_sequence", sequenceName = "cart", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "_cart_sequence")
    @Id
    private Long CartId;
    private Long UserId;
    public Long getId() {
        return CartId;
    }
    public void setId() {
        CartId = CartId;
    }
    public Long getUserId() {
        return UserId;
    }
    public void setUserId(Long userId) {
        UserId = userId;
    }
    public Cart(Long id, Long userId) {
        CartId = id;
        UserId = userId;
    }
    public Cart() {
    }
    @Override
    public String toString() {
        return "Cart{" +
                "CartId=" + CartId +
                ", UserId=" + UserId +
                '}';
    }
}
