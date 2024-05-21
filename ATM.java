package Employees;
import java.util.Scanner;

public class ATM {
     public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int accountNumber = 123456; 
	        int pin = 1234;

	        System.out.println("Welcome to ATM System!");

	        while (true) {
	       System.out.println("Enter account number:");
	       int enteredAccountNumber = scanner.nextInt();

	        System.out.println("Enter PIN:");
	        int enteredPIN = scanner.nextInt();

	        if (enteredAccountNumber == accountNumber && enteredPIN == pin)
	        {
	        int choice;

	        do {
	              System.out.println("Select an option:");
	              System.out.println("1. Balance Inquiry");
	              System.out.println("2. Withdraw Cash");
	              // Add options for Deposit and Exit
	              System.out.println("Enter your choice:");
	              choice = scanner.nextInt();

	               switch (choice) {
	                case 1:
	                  System.out.println("Your balance is: $" + 1000);
	              break;
	          case 2:
	    System.out.println("Enter amount to withdraw:");
	    int withdrawAmount = scanner.nextInt();
	    System.out.println("Withdraw" + withdrawAmount);
	     break;
	       default:
	   System.out.println("Invalid choice!");
	     }
	  }
	        while (choice != 4); 
	          System.out.println("Thank you for using ATM System!");
	          break;
	            }
	        else
	        {
	          System.out.println("Invalid account number or PIN. Please try again.");
	           
	             }
	        }
	        scanner.close();
	    }
	}



