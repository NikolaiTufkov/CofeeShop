package com.example.shop.service;

import com.example.shop.model.entity.Category;
import com.example.shop.model.entity.enums.CategoryNameEnum;

public interface CategoryService {
    void initCategories();

    Category findByCategoryNameEnum(CategoryNameEnum categoryNameEnum);
}
