package com.GraceFund.loanapp;

import com.GraceFund.loanapp.LoanappApplication;
import com.GraceFund.loanapp.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LoanApplicationService {
    @Autowired
    private LoanApplicationRepository loanRepository;

    public LoanappApplication applyForLoan(LoanappApplication loan) {
        loan.setStatus("PENDING");
        loan.setApplicationDate(LocalDate.now());
        return loanRepository.save(loan);
    }

    public List<LoanappApplication> getLoansByUser(Long userId) {
        return loanRepository.findByUserId(userId);
    }
}
