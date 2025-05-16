package com.GraceFund.loanapp;

import com.GraceFund.loanapp.LoanappApplication;
import com.GraceFund.loanapp.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanApplicationController {
    @Autowired
    private LoanApplicationService loanService;

    @PostMapping("/apply")
    public LoanappApplication applyForLoan(@RequestBody LoanappApplication loan) {
        return loanService.applyForLoan(loan);
    }

    @GetMapping("/user/{userId}")
    public List<LoanappApplication> getUserLoans(@PathVariable Long userId) {
        return loanService.getLoansByUser(userId);
    }
}
