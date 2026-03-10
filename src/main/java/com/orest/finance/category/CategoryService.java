package com.orest.finance.category;

import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }
    public List<Category> getAllCategories() {
        return repository.findAll();
    }

    public Category createCategory(Category category) {
        return repository.save(category);
    }

    public void deleteCategory(Integer id) {
        repository.deleteById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public Category updateCategory(Integer id, Category updatedCategory) {
        Category category = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        category.setName(updatedCategory.getName());

        return repository.save(category);
    }
}