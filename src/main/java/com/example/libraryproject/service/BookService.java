package com.example.libraryproject.service;

import com.example.libraryproject.dao.BookRepository;
import com.example.libraryproject.model.dto.BookDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookService {
    private final BookRepository repository;


    public BookDTO addBook(BookDTO book) {
        return repository.save(book);
    }

    public BookDTO getBookById(int id) {
        return repository.getBookById(id);
    }
}