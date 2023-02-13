package com.example.Strudent_Library_Management_System.Model;

import com.example.Strudent_Library_Management_System.ENUMS.Genre;

import javax.persistence.*;

@Entity
@Table(name="Book_info")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    private boolean isIssued;


    // Book is child with respect to Author
    // Setting here the foreign key :- 3 standard steps
    @ManyToOne
    @JoinColumn
    private Author author;

    // Books is also a child WRT card
    @ManyToOne
    @JoinColumn
    private Card card;

    public Books() {
    }

    public Books(int id, String name, int price, Genre genre, Author author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.genre = genre;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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
