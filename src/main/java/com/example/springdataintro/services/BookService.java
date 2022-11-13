package com.example.springdataintro.services;

import com.example.springdataintro.domain.entity.Book;

import java.util.List;

public interface BookService {
void seedBooks(List<Book> books);
}