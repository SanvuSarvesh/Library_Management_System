package com.example.Strudent_Library_Management_System.DTOs;

import com.example.Strudent_Library_Management_System.ENUMS.Genre;

import javax.persistence.Enumerated;

public class BookRequestDTO {
    private String name;
    private int price;
    @Enumerated
    private Genre genre;
    private int authorId;

    public BookRequestDTO() {
    }

    public BookRequestDTO(String name, int price, Genre genre, int authorId) {
        this.name = name;
        this.price = price;
        this.genre = genre;
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

}
