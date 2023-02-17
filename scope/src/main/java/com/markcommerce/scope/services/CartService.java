package com.markcommerce.scope.services;
import com.markcommerce.scope.models.Cart;
import com.markcommerce.scope.models.Category;
import com.markcommerce.scope.repository.CartRepo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class CartService {
    private CartRepo cartRepo;

    public CartService(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }
    public List<Cart> findCarts(){
        return cartRepo.findAll();
    }
    public void updateCart(Long cart_id, Long user_id) {
        Cart cart = cartRepo
                .findById(cart_id).orElseThrow(
                        ()->new IllegalStateException
                                ("cart with id"+ cart_id + "does not exist"));
        if(cart_id !=null && user_id != null && user_id >0
                && !Objects.equals(cart.getId(), cart_id));
        {
            cart.setUserId(user_id);
        }
    }

    public void addCart(Cart cart) {
        Optional<Cart> cartOptional = cartRepo.findById(cart.getId());
        if (cartOptional.isPresent()){
            throw new IllegalStateException("user already exists");
        }
        cartRepo.save(cart);
        System.out.println(cart);
    }

    public Optional<Cart> getCartByName(String name) {
        return cartRepo.findByName(name);
    }
}
