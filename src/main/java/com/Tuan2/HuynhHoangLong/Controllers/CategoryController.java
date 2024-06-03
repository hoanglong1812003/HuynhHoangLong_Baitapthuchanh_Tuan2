package com.Tuan2.HuynhHoangLong.Controllers;

import com.Tuan2.HuynhHoangLong.Entities.Category;
import com.Tuan2.HuynhHoangLong.Entities.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public String showAllCategories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        return "category/list";
    }

    @GetMapping("/add")
    public String addCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "category/add";
    }

    @PostMapping("/add")
    public String addCategory(@ModelAttribute("category") Category category) {
        categoryService.addCategory(category);
        return "redirect:/categories";
    }

    @GetMapping("/edit/{id}")
    public String editCategoryForm(Model model, @PathVariable long id) {
        var category = categoryService.getCategoryById(id);
        if (category != null) {
            model.addAttribute("category", category);
            return "category/edit";
        }
        return "redirect:/categories";
    }

    @PostMapping("/edit")
    public String editCategory(@ModelAttribute("category") Category category) {
        categoryService.updateCategory(category);
        return "redirect:/categories";
    }

    @GetMapping("/delete/{id}")
    public String deleteCategoryForm(Model model, @PathVariable long id) {
        var category = categoryService.getCategoryById(id);
        if (category != null) {
            model.addAttribute("category", category);
            return "category/delete";
        }
        return "redirect:/categories";
    }

    @PostMapping("/delete")
    public String deleteCategory(@ModelAttribute("category") Category category) {
        categoryService.deleteCategory(category.getId());
        return "redirect:/categories";
    }
}
