package org.anudip.bankexception;

import java.util.Scanner;

public class BankTransaction {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter initial balance: ");
	            double initialBalance = scanner.nextDouble();
	            BankAccount account = new BankAccount(initialBalance);

	            System.out.print("Enter deposit amount: ");
	            double depositAmount = scanner.nextDouble();
	            account.deposit(depositAmount);

	            System.out.print("Enter withdrawal amount: ");
	            double withdrawalAmount = scanner.nextDouble();
	            account.withdraw(withdrawalAmount);

	        } catch (InvalidAmountException e) {
	            System.err.println("Invalid Amount Exception: " + e.getMessage());

	        } catch (InsufficientFundsException e) {
	            System.err.println("Insufficient Funds Exception: " + e.getMessage());

	        } catch (BankException e) {
	            System.err.println("Bank Exception: " + e.getMessage());

	        } catch (Exception e) {
	            System.err.println("An unexpected error occurred: " + e.getMessage());

	        } finally {
	            System.out.println("Transaction completed. Thank you for using our bank services.");
	            scanner.close();
	        }
	    }
	}