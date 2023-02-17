package com.markcommerce.scope.controllers;
import com.markcommerce.scope.models.Cart;
import com.markcommerce.scope.services.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/secure/v1/cart")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping
    public List<Cart> getCarts(){
        return  cartService.findCarts();
    }
    @GetMapping
    public Optional<Cart> getCartByName(@PathVariable String name) {
        return cartService.getCartByName(name);
    }
    @PostMapping
    public void addCart(@PathVariable Cart cart){
         cartService.addCart(cart);
    }
    @PutMapping(path={"cart_id","user_id"})
    public void  updateCart(
            @PathVariable ("cart_id") Long cart_id,
            @PathVariable("user_id") Long user_id

    ){
        cartService.updateCart(cart_id, user_id );
    }

}
