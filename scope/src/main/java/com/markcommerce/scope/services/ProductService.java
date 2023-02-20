package com.markcommerce.scope.services;
import com.markcommerce.scope.models.Product;
//import com.markcommerce.scope.repository.ProductRepo;
import com.markcommerce.scope.repository.ProductRepo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepo productRepo;
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public List<Product> getProd(){
        return List.of(new Product(
                1L,
                "Demo Name",
                "demo disc",
                "demo image",
                BigDecimal.valueOf(4.09),
                4,
                1L
        ));
    }
    /*
    public List<Product> getProducts(){
        try {
            return productRepo.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    *//*public Product getAProduct(String Name){
        return productRepo.findByName(Name).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
    }*//*
    public void addProd(@RequestBody Product product) {
        Optional<Product> productOptional = productRepo.findById(product.getId());
        if (productOptional.isPresent()){
            throw new IllegalStateException("product already exists");
        }
        try {
            productRepo.save(product);
        }catch (Exception e){
            e.getCause();
        }
        System.out.println(product);
    }
    public void deleteProduct(Long id, String name) {
        boolean id_exists = productRepo.existsById(id);
        if (!id_exists){
            throw new IllegalStateException("prod with Id" + id + "does not exist");
        }
        productRepo.deleteById(id);
    }
    @Transactional
    public void updateProduct(Long id, String name, String description, String imageUrl, BigDecimal price, int qty, Long categoryId) {
        Product product = productRepo.findById(id).orElseThrow(() -> new IllegalStateException("Product with id " + id + " does not exist"));

        if (name != null && !name.isEmpty() && !Objects.equals(product.getName(), name)) {
            product.setName(name);
        }

        if (description != null && !description.isEmpty() && !Objects.equals(product.getDescription(), description)) {
            product.setDescription(description);
        }

        if (imageUrl != null && !imageUrl.isEmpty() && !Objects.equals(product.getImageUrl(), imageUrl)) {
            product.setImageUrl(imageUrl);
        }

        if (price != null && !Objects.equals(product.getPrice(), price)) {
            product.setPrice(price);
        }

        if (qty != product.getQty()) {
            product.setQty(qty);
        }

        if (categoryId != null && !Objects.equals(product.getCategoryId(), categoryId)) {
            product.setCategoryId(categoryId);
        }
    }*/
}
