package com.example.Strudent_Library_Management_System.Services;

import com.example.Strudent_Library_Management_System.DTOs.BookRequestDTO;
import com.example.Strudent_Library_Management_System.Model.Books;
import com.example.Strudent_Library_Management_System.Model.Card;
import com.example.Strudent_Library_Management_System.Repositories.BookRepository;
import com.example.Strudent_Library_Management_System.Repositories.CardRepository;
import com.example.Strudent_Library_Management_System.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.jta.ManagedTransactionAdapter;

import javax.transaction.Transaction;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    CardRepository cardRepository;
    public String issueBook(BookRequestDTO bookRequestDTO) throws Exception{
        int bookId = bookRequestDTO.getBookId();
        int cardId = bookRequestDTO.getCardId();

        Books books = bookRepository.findById(bookId).get();
        Card card = cardRepository.findById(cardId).get();

        Transaction transaction = new Transaction();

        transaction.setBook(book);
        transaction.setCard(card);
        transaction.setTransactionId(UUID.randomUUID().toString());
        transaction.setIssueOperation(true);
        transaction.setTransactionStatus(TransactionStatus.PENDING);

    }
    public String getTransactionInfo(int bookId, int cardId){

    }
}
