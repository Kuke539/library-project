package com.example.libraryproject.model.dto;



import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class BookDTO {
    private int id;
    private String title;
    private String author;
}