package com.markcommerce.scope.services;
import com.markcommerce.scope.models.Cart;
import com.markcommerce.scope.repository.CartRepo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class CartService {
    private CartRepo cartRepo;

    public CartService(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }
    public List<Cart> getProducts(){
        return cartRepo.findAll();
    }
    public void updateCart(Long id, int newQuantity) {
        Cart cart = cartRepo.findById(id)
                .orElseThrow(() -> new IllegalStateException("Item with id " + id + " not found in cart"));

        cart.setId();
        cartRepo.save(cart);
    }

    public void addCart(Cart cart) {
        Optional<Cart> cartOptional = cartRepo.findById(cart.getId());
        if (cartOptional.isPresent()){
            throw new IllegalStateException("user already exists");
        }
        cartRepo.save(cart);
        System.out.println(cart);
    }
}
