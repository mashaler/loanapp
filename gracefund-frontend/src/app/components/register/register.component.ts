import { Component } from '@angular/core';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html'
})
export class RegisterComponent {
  user = { name: '', email: '', phoneNumber: '' };

  constructor(private userService: UserService) {}

  register() {
    this.userService.registerUser(this.user).subscribe({
      next: () => alert('User registered successfully!'),
      error: () => alert('Registration failed!')
    });
  }
}
