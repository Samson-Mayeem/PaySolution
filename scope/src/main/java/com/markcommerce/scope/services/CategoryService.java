package com.markcommerce.scope.services;
import com.markcommerce.scope.models.Category;
import com.markcommerce.scope.repository.CategoryRepo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CategoryService {
    private CategoryRepo categoryRepo;
    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }
    public List<Category> getCategory(){
        return categoryRepo.findAll();
    }
    public Optional<Category> getCategoryByName(String name){
        var category = categoryRepo.findByName(name);
        return category;
    }
    public void addCategory(Category category) {
        Optional<Category> categoryOptional = categoryRepo.findByName(category.getCategoryName());
        if (categoryOptional.isPresent()){
            throw new IllegalStateException("category already exists");
        }
        categoryRepo.save(category);
        System.out.println(category);
    }
    public void deleteCategory(Long id) {
        boolean id_exists = categoryRepo.existsById(id);
        if (!id_exists){
            throw new IllegalStateException("category with Id" + id + "does not exist");
        }
        categoryRepo.deleteById(id);
    }
    public void updateCategory(Long id,
                              String name) {
        Category category = categoryRepo
                .findById(id).orElseThrow(
                        ()->new IllegalStateException
                                ("product with id"+ id + "does not exist"));
        if(id !=null || name != null && name.length()>0
                && !Objects.equals(category.getCategoryName(), name));
        {
            category.setCategoryName(name);
        }
    }
}
