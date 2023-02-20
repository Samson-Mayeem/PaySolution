package com.markcommerce.scope.controllers;
import com.markcommerce.scope.models.Product;
import com.markcommerce.scope.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("api/secure/v1/products")
public class ProductsController {

    private final ProductService productService;
    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getProd(){
        return productService.getProd();
    }

    /*
   @PostMapping
   public void SaveProd(@RequestBody Product product){
       productService.addProd(product);
   }
   *//*@GetMapping("{name}")
   public Product getProduct(@PathVariable("name") String name){
         return productService.getAProduct(name);
   }*//*
    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    @DeleteMapping(path = "{id}")
    public  void userDelete(@PathVariable Long id, String Name){
        productService.deleteProduct(id, Name);
    }
    @PutMapping(path = "{id}")
    public void  updateProduct(
            @PathVariable ("id") Long id,
            @PathVariable(required = false) String Name,
            @PathVariable(required = false) String Description,
            @PathVariable(required = false) String ImageUrl,
            @PathVariable(required = false) BigDecimal Price,
            @PathVariable(required = false) int Qty,
            @PathVariable(required = false) Long CategoryId
    ){
        productService.updateProduct(id, Name, Description, ImageUrl, Price, Qty, CategoryId);
    }*/
}
