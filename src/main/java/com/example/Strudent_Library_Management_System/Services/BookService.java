package com.example.Strudent_Library_Management_System.Services;

import com.example.Strudent_Library_Management_System.Model.Author;
import com.example.Strudent_Library_Management_System.Model.Books;
import com.example.Strudent_Library_Management_System.Repositories.AuthorRepository;
import com.example.Strudent_Library_Management_System.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;
    public String addBook(Books books){
        // I want to fetch the AuthorEntity
        int authorId = books.getAuthor().getId();

        Author author = authorRepository.findById(authorId).get();
        books.setAuthor(author);

        // Do exception handling by your own

        // Basic attributes are already set from postman
        // Setting the foreign key attributes in child class

        List<Books> recentWrittenBook = author.getBooksWritten();
        recentWrittenBook.add(books);
        author.setBooksWritten(recentWrittenBook);

        // Now books to be saved but at the same time author should be also saved
        // We're saving/updating author bcoz we have made changes in author entity
        // .save function works as save as well as update

        authorRepository.save(author);

        return "Book has been added.";
    }
}
