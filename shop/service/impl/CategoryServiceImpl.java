package com.example.shop.service.impl;

import com.example.shop.model.entity.Category;
import com.example.shop.model.entity.enums.CategoryNameEnum;
import com.example.shop.repository.CategoryRepository;
import com.example.shop.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void initCategories() {
        if (categoryRepository.count() != 0) {
            return;
        }
            Arrays.stream(CategoryNameEnum.values()).forEach(categoryNameEnum -> {
                Category category = new Category();
                category.setName(categoryNameEnum);
                switch (categoryNameEnum) {
                    case COFFEE -> category.setNeededTime(2);
                    case CAKE -> category.setNeededTime(10);
                    case DRINK -> category.setNeededTime(1);
                    case OTHER -> category.setNeededTime(5);
                }
                categoryRepository.save(category);
            });
    }

    @Override
    public Category findByCategoryNameEnum(CategoryNameEnum categoryNameEnum) {

        return categoryRepository
                .findByName(categoryNameEnum)
                .orElse(null);
    }

}
