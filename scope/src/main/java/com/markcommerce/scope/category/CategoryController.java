/*
package com.markcommerce.scope.controllers;
import com.markcommerce.scope.models.Category;
import com.markcommerce.scope.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@RestController
@RequestMapping("api/secure/v1/category")
public class CategoryController {
    private final CategoryService categoryService;
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping
    public void getCategory(@PathVariable Category category){
        categoryService.getCategory();
    }
    @GetMapping
    public Optional<Category> getCategoryByName(@PathVariable String name){
        return categoryService.getCategoryByName(name);
    }
    @PostMapping
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }
    @DeleteMapping(path = "{id}")
    public  void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }
    @PutMapping(path = "{id}")
    public void  updateCategory(
            @PathVariable ("id") Long id,
            @PathVariable(required = false) String name
    ){
        categoryService.updateCategory(id, name);
    }
}
*/
