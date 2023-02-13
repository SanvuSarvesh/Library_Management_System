package com.example.Strudent_Library_Management_System.Repositories;

import com.example.Strudent_Library_Management_System.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books,Integer> {

}
