package com.markcommerce.scope.product;
import com.markcommerce.scope.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepo productRepo;
    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getProd(){
        return List.of(new Product(
                1L,
                "Demo Name",
                "Demo Desc",
                "demo disc",
                BigDecimal.valueOf(4.09),
                8,
                1L
        ));
    }

    public List<Product> getProducts(){
        try {
            return productRepo.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    public Optional<Product> GetProdByName(String Name){
        return  productRepo.findById(Long.valueOf(Name));
    }

    public Product addProd(Product product) {
       var prod = productRepo.save(product);
       return prod;
    }
    public void updateProd(Long id,
                           String name,
                           String description,
                           String imageUrl,
                           BigDecimal price,
                           int qty,
                           Long categoryId) {
        Product product = productRepo
                .findById(id).orElseThrow(
                        ()->new IllegalStateException
                                ("product with id"+ id + "does not exist"));
        if(id != null) {
            if (name != null
                    && name.length() > 0
                    && !Objects.equals(product.getName(), name)) ;
            {
                product.setName(name);
            }
            if (description != null
                    && description.length() > 0
                    && !Objects.equals(product.getDescription(), description)) ;
            {
                product.setDescription(description);
            }
            if (imageUrl != null
                    && imageUrl.length() > 0
                    && !Objects.equals(product.getImageUrl(), imageUrl)) ;
            {
                product.setImageUrl(imageUrl);
            }
            if (price != null
                    && price != null
                    && !Objects.equals(product.getPrice(), price)) ;
            {
                product.setPrice(price);
            }
            if (qty >= 0
                    && !Objects.equals(product.getQty(), qty)) ;
            {
                product.setQty(qty);
            }
            if (categoryId >= 0
                    && !Objects.equals(product.getCategoryId(), categoryId)) ;
            {
                product.setCategoryId(categoryId);
            }
        }
    }
    public void deleteProd(@RequestBody Product product){
        try {
            if (product.getId() == null) {
                System.out.println("product doesn't exist");
            }
            productRepo.delete(product);
        } catch (Exception e){
            System.out.println(e.getCause());
        }finally {
            System.out.println("make a retry to delete with a different id");
        }
    }
}
