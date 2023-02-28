package com.example.Strudent_Library_Management_System.DTOs;

public class StudentUpdateDTO {
    private int id;
    private String mobileNo;

    public StudentUpdateDTO() {
    }

    public StudentUpdateDTO(int id, String mobileNo) {
        this.id = id;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
