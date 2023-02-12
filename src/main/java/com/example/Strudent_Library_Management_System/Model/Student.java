package com.example.Strudent_Library_Management_System.Model;

import javax.persistence.*;

@Entity
@Table(name = "Students_Info")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int admissionNo;
    private String name;
    private int age;
    @Column(unique  = true)
    private String email;
    private String mobileNo;
    private String country;

    // Plain syntax for Bidirectional Mapping
    @OneToOne(mappedBy = "studentVariableName", cascade = CascadeType.ALL)
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Student() {
    }

    public Student(int admissionNo, String name, int age, String email, String mobileNo, String country) {
        this.admissionNo = admissionNo;
        this.name = name;
        this.age = age;
        this.email = email;
        this.mobileNo = mobileNo;
        this.country = country;
    }

    public int getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(int admissionNo) {
        this.admissionNo = admissionNo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
