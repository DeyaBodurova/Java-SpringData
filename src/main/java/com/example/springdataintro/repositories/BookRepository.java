package com.example.springdataintro.repositories;

import com.example.springdataintro.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
