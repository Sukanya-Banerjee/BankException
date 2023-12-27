package org.anudip.bankexception;

public class BankAccount 
{
	 private double balance;

	    public BankAccount(double initialBalance) 
	    {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) throws BankException 
	    {
	        if (amount <= 0) 
	        {
	            throw new BankException("Deposit amount must be greater than zero.");
	        }
	        balance += amount;
	        System.out.println("Deposit successful. Current balance: " + balance);
	    }

	    public void withdraw(double amount) throws BankException 
	    {
	        if (amount <= 0) 
	        {
	            throw new BankException("Withdrawal amount must be greater than zero.");
	        }
	        if (amount > balance) 
	        {
	            throw new BankException("Insufficient funds. Cannot withdraw " + amount + ". Current balance: " + balance);
	        }
	        balance -= amount;
	        System.out.println("Withdrawal successful. Current balance: " + balance);
	    }
	}

