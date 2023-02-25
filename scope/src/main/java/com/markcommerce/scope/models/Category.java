package com.markcommerce.scope.models;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "category_sequence")
    private Long CategoryId;
    private String CategoryName;
    public long getCategoryId() {
        return CategoryId;
    }
    public void setCategoryId(long categoryId) {
        CategoryId = categoryId;
    }
    public String getCategoryName() {
        return CategoryName;
    }
    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
    public Category(long categoryId, String categoryName) {
        CategoryId = categoryId;
        CategoryName = categoryName;
    }
    public Category(String categoryName) {
        CategoryName = categoryName;
    }
    public Category() {
    }

    @Override
    public String toString() {
        return "Category{" +
                "CategoryId=" + CategoryId +
                ", CategoryName='" + CategoryName + '\'' +
                '}';
    }
}
