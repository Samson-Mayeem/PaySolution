package com.markcommerce.scope.models;

import java.math.BigDecimal;
import java.text.DecimalFormat;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "_products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "_products_sequence")
    private Long ProductId;
    private String Name;
    private String Description;
    private String ImageUrl;
    private BigDecimal Price;
    private int Qty;
    private Long CategoryId;
    public Product(Long id, String name, String description, String imageUrl, BigDecimal price, int qty,
                   Long categoryId) {
        ProductId = id;
        Name = name;
        Description = description;
        ImageUrl = imageUrl;
        Price = price;
        Qty = qty;
        CategoryId = categoryId;
    }
    public Product(String name, String description, String imageUrl, BigDecimal price, int qty, Long categoryId) {
        Name = name;
        Description = description;
        ImageUrl = imageUrl;
        Price = price;
        Qty = qty;
        CategoryId = categoryId;
    }

    public Product() {
    }
    public Long getId() {
        return ProductId;
    }
    public void setId(Long id) {
        ProductId = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public String getImageUrl() {
        return ImageUrl;
    }
    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
    public BigDecimal getPrice() {
        return Price;
    }
    public void setPrice(BigDecimal price) {
        Price = price;
    }
    public int getQty() {
        return Qty;
    }
    public void setQty(int qty) {
        Qty = qty;
    }
    public Long getCategoryId() {
        return CategoryId;
    }
    public void setCategoryId(Long categoryId) {
        CategoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + ProductId +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", ImageUrl='" + ImageUrl + '\'' +
                ", Price=" + Price +
                ", Qty=" + Qty +
                ", CategoryId=" + CategoryId +
                '}';
    }
}
