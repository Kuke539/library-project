package com.example.libraryproject.dao;

import com.example.libraryproject.model.dto.BookDTO;

import java.util.HashMap;
import java.util.Map;


public class BookRepository {

    private final Map<Integer, BookDTO> database = new HashMap<>();
    private int currentId = 1;


    public void save(BookDTO book) {
        book.setId(currentId++);
    }
}
