import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './components/register/register.component';
import { ApplyLoanComponent } from './components/apply-loan/apply-loan.component';
import { UserLoansComponent } from './components/user-loans/user-loans.component';

const routes: Routes = [
  { path: 'register', component: RegisterComponent },
  { path: 'apply-loan', component: ApplyLoanComponent },
  { path: 'user-loans/:userId', component: UserLoansComponent },
  { path: '', redirectTo: 'register', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
