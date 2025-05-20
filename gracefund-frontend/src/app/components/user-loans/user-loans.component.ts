import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { LoanService } from '../../services/loan.service';

@Component({
  selector: 'app-user-loans',
  templateUrl: './user-loans.component.html'
})
export class UserLoansComponent implements OnInit {
  loans: any[] = [];
  userId!: number;

  constructor(private route: ActivatedRoute, private loanService: LoanService) {}

  ngOnInit() {
    this.userId = +this.route.snapshot.paramMap.get('userId')!;
    this.loanService.getUserLoans(this.userId).subscribe({
      next: data => this.loans = data,
      error: () => alert('Failed to fetch loans')
    });
  }
}
