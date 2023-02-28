package com.example.Strudent_Library_Management_System.Services;

import com.example.Strudent_Library_Management_System.Model.Author;
import com.example.Strudent_Library_Management_System.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public String addAuthor(Author author){
        authorRepository.save(author);
        return "Author has been created.";
    }
    public Author getAuthor(int authorId){
        Author author = authorRepository.findById(authorId).get();
        return author;
    }
}
