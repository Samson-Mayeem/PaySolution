package com.markcommerce.scope.configs;
import com.markcommerce.scope.models.Cart;
import com.markcommerce.scope.models.Product;
import com.markcommerce.scope.product.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class AppConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProductRepo prodRepo){
        return args ->{
            Product myCart = new Product(
              1L,
              "Demo Name",
                    "Demo Desc",
                    "Demo Image",
                    BigDecimal.valueOf(55.34),
                    6,
                    1L
            );
        };
    }
}
