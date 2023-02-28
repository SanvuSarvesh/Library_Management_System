package com.example.Strudent_Library_Management_System.Controllers;

import com.example.Strudent_Library_Management_System.Model.Author;
import com.example.Strudent_Library_Management_System.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("/add_author")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @GetMapping("/get_author")
    public Author getAuthor(@RequestParam  ("authorId") int authorId){
        return authorService.getAuthor(authorId);
    }
}
