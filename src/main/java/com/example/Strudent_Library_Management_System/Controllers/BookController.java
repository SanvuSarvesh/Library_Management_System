package com.example.Strudent_Library_Management_System.Controllers;

import com.example.Strudent_Library_Management_System.Model.Books;
import com.example.Strudent_Library_Management_System.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/add_book")
    public String addBook(@RequestBody Books books){
        return bookService.addBook(books);
    }
}
