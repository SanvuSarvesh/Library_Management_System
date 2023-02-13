package com.example.Strudent_Library_Management_System.Model;

import com.example.Strudent_Library_Management_System.ENUMS.CardStatus;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Card_Info")
public class Card {

    // Plan is to save this in Database
    // Before saving need to set all the attributes , Rule No-1
    // Always set the value before setting the attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    private Date createdOn;
    @UpdateTimestamp
    private Date updatedOn;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    public Student getStudentVariableName() {
        return studentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        this.studentVariableName = studentVariableName;
    }

    @OneToOne
    @JoinColumn
    private Student studentVariableName; // this is written in parent class
    // while doing the bidirectional mapping

    @OneToMany(mappedBy = "", cascade = CascadeType.ALL)
    private List<Books> booksIssued;

    public List<Books> getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(List<Books> booksIssued) {
        this.booksIssued = booksIssued;
    }

    public Card() {
        booksIssued = new ArrayList<>();
    }

    public Card(int id, Date createdOn, Date updatedOn, CardStatus cardStatus) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.cardStatus = cardStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
