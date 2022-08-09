import java.util.Scanner;

// Display Welcome message to the user
// 5 functions: Check balance, deposit, withdraw, check previous, exit


public class BankingApplication{
	
}

class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	void deposit(int amount) {
		// Case 1 amount wanting to deposit is not 0
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction(){
		if(previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdrawn: " + previousTransaction);
		}
		else {
			System.out.println("None occured.");
		}
	}
}
