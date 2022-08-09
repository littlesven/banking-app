import java.util.Scanner;

// Display Welcome message to the user
// 5 functions: Check balance, deposit, withdraw, check previous, exit
// Finished.

public class BankingApplication{
	
}

class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	// bank account constructor
	BankAccount(String customerName, String customerID){
		this.customerName = customerName;
		this.customerID = customerID;
	}
	
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
	
	void showMenu() {
		char option='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID: " + customerID);
		System.out.println("\n");
		System.out.println("A. Check balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Check previous");
		System.out.println("E. Exit");
		
		do {
			System.out.println("Pick an option.");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'A':
				System.out.println("Balance: " + balance);
				break;
				
			case 'B':
				int amount = scanner.nextInt();
				deposit(amount);
				break;
			
			
			case 'C':
				int withdrawAmount = scanner.nextInt();
				deposit(withdrawAmount);
				break;
			
			case 'D':
				getPreviousTransaction();
			
			case 'E':
				break;
				
			default:
				System.out.println("Please try again.");
				break;
			}
		}while(option !='E');
	}
}
