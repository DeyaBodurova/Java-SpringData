package com.example.springdataintro.repositories;

import com.example.springdataintro.domain.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
Optional<Author> findAuthorById(Long id);
}