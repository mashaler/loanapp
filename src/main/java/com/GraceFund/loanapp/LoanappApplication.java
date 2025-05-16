package com.GraceFund.loanapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;
import java.time.LocalDate;

@SpringBootApplication
@Entity
@Table(name = "loan_applications")
public class LoanappApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double amount;

	private Integer termMonths;

	private String status; // e.g. PENDING, APPROVED, REJECTED

	private LocalDate applicationDate;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public static void main(String[] args) {
		SpringApplication.run(LoanappApplication.class, args);
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// Getter for status
	public String getStatus() {
		return status;
	}

	// Setter for applicationDate
	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	// Getter for applicationDate
	public LocalDate getApplicationDate() {
		return applicationDate;
	}
}
