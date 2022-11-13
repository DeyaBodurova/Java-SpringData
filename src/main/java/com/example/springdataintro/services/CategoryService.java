package com.example.springdataintro.services;

import com.example.springdataintro.domain.entity.Category;

import java.util.List;
import java.util.Set;

public interface CategoryService {
 void seedCategory(List<Category> categories);

 boolean isDataSeeded();
 Set<Category> getRandomCategories();

}