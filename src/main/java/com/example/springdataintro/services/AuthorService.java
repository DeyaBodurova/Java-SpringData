package com.example.springdataintro.services;

import com.example.springdataintro.domain.entity.Author;

import java.util.List;

public interface AuthorService {
void seedAuthors(List<Author> authors);

boolean isDataSeeded();

Author getRandomAuthor();
}