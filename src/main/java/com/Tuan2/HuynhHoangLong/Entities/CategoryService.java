package com.Tuan2.HuynhHoangLong.Entities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    private final List<Category> categories = new ArrayList<>();

    public CategoryService() {
        categories.add(new Category(1L, "Lập trình Web"));
        categories.add(new Category(2L, "Lập trình Ứng dụng"));
    }

    public List<Category> getAllCategories() {
        return new ArrayList<>(categories);
    }

    public Category getCategoryById(long id) {
        return categories.stream()
                .filter(category -> category.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void updateCategory(Category category) {
        for (Category existingCategory : categories) {
            if (existingCategory.getId() == category.getId()) {
                existingCategory.setName(category.getName());
                break;
            }
        }
    }

    public void deleteCategory(long id) {
        categories.removeIf(category -> category.getId() == id);
    }
}
