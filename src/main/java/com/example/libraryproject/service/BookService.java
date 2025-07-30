package com.example.libraryproject.service;

import com.example.libraryproject.model.dto.BookDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final List<BookDTO> books = new ArrayList<>();

    public void addBook(BookDTO book) {
        books.add(book);
    }

    public BookDTO getBookById(int id) {
        Optional<BookDTO> found = books.stream()
                .filter(book -> book.getId() == id)
                .findFirst();

        return found.orElse(null);
    }
}