package com.example.shop.model.entity;

import com.example.shop.model.entity.enums.CategoryNameEnum;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

    private CategoryNameEnum name;
    private int neededTime;

    public Category() {
    }


    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    public CategoryNameEnum getName() {
        return name;
    }

    public void setName(CategoryNameEnum categoryNameEnum) {
        this.name = categoryNameEnum;
    }

    @Column(name = "needed_time", nullable = false)
    public int getNeededTime() {
        return neededTime;
    }

    public void setNeededTime(int neededTime) {
        this.neededTime = neededTime;
    }
}
