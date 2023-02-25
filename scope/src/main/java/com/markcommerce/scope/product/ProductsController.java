package com.markcommerce.scope.product;
import com.markcommerce.scope.models.Product;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/secure/v1/products")
public class ProductsController {
    private  final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> GetProd(){
        return productService.getProducts();
    }
    @GetMapping("prod")
    public List<Product> getProd(){
        return productService.getProd();
    }
    @GetMapping("/{Name}")
    public Optional<Product> GetProdName(@PathVariable String Name){
        return productService.GetProdByName(Name);
    }
    @PostMapping
    public void addProd(@RequestBody Product product){
       productService.addProd(product);
    }
    @PutMapping("{id}")
    public void updateProd(
            @PathVariable ("id") Long id,
            @PathVariable(required = false) String name,
            @PathVariable(required = false) String Description,
            @PathVariable(required = false) String ImageUrl,
            @PathVariable(required = false) BigDecimal Price,
            @PathVariable(required = false) int Qty,
            @PathVariable(required = false) Long CategoryId
    ){
        productService.updateProd(
                id,
                name,
                Description,
                ImageUrl,
                Price,
                Qty,
                CategoryId);
    }
    @DeleteMapping("{id}")
    public void deleteProd(@RequestBody Product product){
        productService.deleteProd(product);
    }
}