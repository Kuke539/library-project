package com.example.libraryproject.dao;

import com.example.libraryproject.model.dto.BookDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BookRepository {

    private final Map<Integer, BookDTO> database = new HashMap<>();
    private int currentId = 1;


    public BookDTO save(BookDTO book) {
        int id = currentId++;
        book.setId(id);
        database.put(id, book);
        return book;
    }

    public BookDTO getBookById(int id) {
        return database.get(id);
    }
    public BookDTO updateBook(BookDTO book) {
        database.put(book.getId(), book);
        return book;
    }
    public void deleteBook(int id) {
        database.remove(id);
    }
}

