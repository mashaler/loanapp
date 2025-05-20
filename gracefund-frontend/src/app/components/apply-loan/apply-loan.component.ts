import { Component } from '@angular/core';
import { LoanService } from '../../services/loan.service';

@Component({
  selector: 'app-apply-loan',
  templateUrl: './apply-loan.component.html'
})
export class ApplyLoanComponent {
  loan = { amount: 0, termMonths: 0, user: { id: 1 } }; // Default user ID for testing

  constructor(private loanService: LoanService) {}

  apply() {
    this.loanService.applyForLoan(this.loan).subscribe({
      next: () => alert('Loan application submitted!'),
      error: () => alert('Application failed!')
    });
  }
}
