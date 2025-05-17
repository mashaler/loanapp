package com.GraceFund.loanapp;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "loan_applications")
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private Integer termMonths;

    private String status;

    private LocalDate applicationDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and Setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Double getAmount() { return amount; }

    public void setAmount(Double amount) { this.amount = amount; }

    public Integer getTermMonths() { return termMonths; }

    public void setTermMonths(Integer termMonths) { this.termMonths = termMonths; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public LocalDate getApplicationDate() { return applicationDate; }

    public void setApplicationDate(LocalDate applicationDate) { this.applicationDate = applicationDate; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }
}
