package com.example.Strudent_Library_Management_System.Repositories;

import com.example.Strudent_Library_Management_System.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
