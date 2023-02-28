package com.example.Strudent_Library_Management_System.Repositories;

import com.example.Strudent_Library_Management_System.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByEmail(String email);

    // this is similar to writing a query :- select * from student where country = India
    List<Student> findByCountry(String country);
    //String updateMobileNo(Student newStudent);

}
