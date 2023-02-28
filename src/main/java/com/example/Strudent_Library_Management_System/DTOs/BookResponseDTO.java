package com.example.Strudent_Library_Management_System.DTOs;

import com.example.Strudent_Library_Management_System.ENUMS.Genre;

public class BookResponseDTO {
    private String name;
    private int price;
    private Genre genre;

    public BookResponseDTO() {

    }

    public BookResponseDTO(String name, int price, Genre genre) {
        this.name = name;
        this.price = price;
        this.genre = genre;
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
}
