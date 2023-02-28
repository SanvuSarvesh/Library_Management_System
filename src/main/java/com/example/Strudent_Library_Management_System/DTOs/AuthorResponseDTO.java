package com.example.Strudent_Library_Management_System.DTOs;

import java.util.List;

public class AuthorResponseDTO {
    private String name;
    private int age;
    private double ratings;
    private String country;
    private List<BookResponseDTO> booksWritten;

    public AuthorResponseDTO() {

    }

    public AuthorResponseDTO(String name, int age, double ratings, String country,
                             List<BookResponseDTO> booksWritten) {
        this.name = name;
        this.age = age;
        this.ratings = ratings;
        this.country = country;
        this.booksWritten = booksWritten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<BookResponseDTO> getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(List<BookResponseDTO> booksWritten) {
        this.booksWritten = booksWritten;
    }
}
