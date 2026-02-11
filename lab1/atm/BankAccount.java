package atm;

/**
 * represents a simple bank account
 * allows deposits, withdrawals and balance checking
 * 
 * @author Jacob Bocotan
 * @date 11 Feb 2026
 */

public class BankAccount {

    private double balance;

	//Constructors
    /**
     * creates a bank account with zero balance 
     * 
     * @author Jacob Bocotan
     * @date 11 Feb 2026
     */
	public BankAccount()
	{
		balance = 0;
	}
	
	/**
	 * creates initialBalance 
	 * @param initialBalance starting balance of the account
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	// Methods
	/**
	 * Deposits money into the account
	 * 
	 * @param amount amount to deposit
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */
	public void deposit(double amount)
	   {      
		balance = balance + amount;
	       
	    } 
	
	
	/**
	 * withdraws money from the account if enough balance exists
	 * 
	 * @param amount amount to withdraw
	 * @return true if withdrawal successful, false otherwise
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */
	public boolean withdraw(double amount)    
	{ 
		if (balance>= amount)
			{
			balance = balance - amount;
			return true;
			}
		else
			return false;
        
    } 
	
	
	/**
	 * returns the current balance
	 * 
	 * @return current account balance
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */
	public double getBalance() 
	{ 
		return balance;
	}
}

