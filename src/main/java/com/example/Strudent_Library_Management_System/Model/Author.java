package com.example.Strudent_Library_Management_System.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Author_info")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String country;
    private double rating;

    // we're writing this in parent entity it is a part of bidirectional mapping
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Books> booksWritten;


    public Author() {
        booksWritten =  new ArrayList<>();
    }

    public Author(int id, String name, int age, String country, double rating, List<Books> booksWritten) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
        this.rating = rating;
        this.booksWritten = booksWritten;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Books> getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(List<Books> booksWritten) {
        this.booksWritten = booksWritten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

