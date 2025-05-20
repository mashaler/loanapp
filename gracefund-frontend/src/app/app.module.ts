import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './components/register/register.component';
import { ApplyLoanComponent } from './components/apply-loan/apply-loan.component';
import { UserLoansComponent } from './components/user-loans/user-loans.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    ApplyLoanComponent,
    UserLoansComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
