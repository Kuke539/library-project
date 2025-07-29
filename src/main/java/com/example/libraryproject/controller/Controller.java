package com.example.libraryproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @   PostMapping
    public String createBook(@RequestBody Book book) {
        service.addBook(book.getTitle(), book.getAuthor());
        return "Книга успешно сохранена.";
    }

    @GetMapping("/{id}")
    public Object showBook(@PathVariable int id) {
        Book book = service.getBookById(id);
        if (book != null) {
            return book;
        } else {
            return "Книга не найдена.";
        }
    }
}
