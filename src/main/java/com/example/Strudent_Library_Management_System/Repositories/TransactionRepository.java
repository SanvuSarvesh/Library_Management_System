package com.example.Strudent_Library_Management_System.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.transaction.Transaction;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

    @Query(value = "select * from transactions where book_id=:bookId and card_id=:cardId "
            + "and is_issue_operation=true", nativeQuery = true)
    List<Transaction> getTransactionsForBookAndCard(int bookId, int cardId);

}
