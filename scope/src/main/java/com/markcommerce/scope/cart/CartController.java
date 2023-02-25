/*
package com.markcommerce.scope.controllers;
import com.markcommerce.scope.models.Cart;
import com.markcommerce.scope.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/secure/v1/cart")
public class CartController {
    private final CartService cartService;
    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("all")
    public List<Cart> getCarts(){
        return  cartService.findCarts();
    }
    @GetMapping("getcart")
    public Optional<Cart> getCartByName(@RequestParam String name) {
        var cart = cartService.getCartById(name);
        return cart;
    }
    @PostMapping("add")
    public void addCart(@RequestBody Cart cart){
         cartService.addCart(cart);
    }
    @PutMapping(path={"cartid"})
    public void  updateCart(
            @PathVariable ("cartid") Long cart_id,
            @PathVariable Long user_id

    ){
        cartService.updateCart(cart_id, user_id );
    }
    @DeleteMapping(path = "{id}")
    public  void deleteCategory(@PathVariable Long id){
        cartService.deleteCart(id);
    }

}
*/
