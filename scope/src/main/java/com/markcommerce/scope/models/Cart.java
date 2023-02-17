package com.markcommerce.scope.models;


import javax.persistence.*;


@Entity
@Table(name = "_cart")
public class Cart {
    @Id
    @SequenceGenerator(name = "cart_sequence", sequenceName = "cart", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "_cart_sequence")
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
    public Cart(Long userId) {
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
