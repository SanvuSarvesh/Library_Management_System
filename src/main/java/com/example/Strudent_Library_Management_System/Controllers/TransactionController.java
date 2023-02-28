package com.example.Strudent_Library_Management_System.Controllers;

import com.example.Strudent_Library_Management_System.DTOs.BookRequestDTO;
import com.example.Strudent_Library_Management_System.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @PostMapping("/issue_Book")
    public String issueBook(@RequestBody BookRequestDTO bookRequestDTO){
        try{
           return transactionService.issueBook(bookRequestDTO);
        }
        catch (Exception excp){
            return excp.getMessage();
        }
    }
    @GetMapping("/transaction_info")
    public String getTransactionInfo(@RequestParam("bookId") Integer bookId, @RequestParam
            ("cardId") Integer cardId){
        return transactionService.getTransactionDetails(bookId,cardId);
    }
}
