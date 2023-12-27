package org.anudip.bankexception;

public class InvalidAmountException extends BankException
{
	public InvalidAmountException(String message)
	{
        super(message);
    }
}
