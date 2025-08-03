package com.example.libraryproject.controller;

import com.example.libraryproject.model.dto.BookDTO;
import com.example.libraryproject.service.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
@Slf4j
public class Controller {
    private final BookService service;

    @PostMapping
    public BookDTO createBook(@RequestBody BookDTO book) {
        return service.addBook(book);
    }

    @GetMapping("/{id}")
    public BookDTO showBook(@PathVariable int id) {
        return service.getBookById(id);
    }
    @PutMapping
    public BookDTO updateBook(@RequestBody BookDTO book) {
        return service.updateBook(book);
    }
    @DeleteMapping
    public void deleteBook(@RequestBody BookDTO book) {
        return service.deleteBook(id);
    }
}
