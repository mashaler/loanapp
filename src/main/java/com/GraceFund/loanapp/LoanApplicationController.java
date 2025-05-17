package com.GraceFund.loanapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanApplicationController {

    @Autowired
    private LoanApplicationService loanService;

    @PostMapping("/apply")
    public LoanApplication applyForLoan(@RequestBody LoanApplication loan) {
        return loanService.applyForLoan(loan);
    }

    @GetMapping("/user/{userId}")
    public List<LoanApplication> getUserLoans(@PathVariable Long userId) {
        return loanService.getLoansByUser(userId);
    }
}
