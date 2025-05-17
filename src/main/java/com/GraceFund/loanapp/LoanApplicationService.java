package com.GraceFund.loanapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LoanApplicationService {

    @Autowired
    private LoanApplicationRepository loanRepository;

    public LoanApplication applyForLoan(LoanApplication loan) {
        loan.setStatus("PENDING");
        loan.setApplicationDate(LocalDate.now());
        return loanRepository.save(loan);
    }

    public List<LoanApplication> getLoansByUser(Long userId) {
        return loanRepository.findByUserId(userId);
    }
}
