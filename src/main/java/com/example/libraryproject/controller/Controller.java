package com.example.libraryproject.controller;

import com.example.libraryproject.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RequestMapping("/books")
public class Controller {
    public class BookController {

        private final BookService service;

        @RestController
        @AllArgsConstructor
        public class BookController {
            private final BookService service;
        }

        @PostMapping
        public String createBook(@RequestBody Book Book) {
            service.addBook(Book);
            return "Book created successfully";
        }

        @GetMapping("/{id}")
        public Object showBook(@PathVariable int id) {
            Book book = service.getBookById(id);
            if (book != null) {
                return book;
                {
                    return "Книга не найдена.";
                }
            }