package com.GraceFund.loanapp;

import com.GraceFund.loanapp.LoanappApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LoanApplicationRepository extends JpaRepository<LoanappApplication, Long> {
    List<LoanappApplication> findByUserId(Long userId);
}
