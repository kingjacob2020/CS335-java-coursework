package atm;
import javax.swing.JOptionPane;


	/**
	 * handles bank transactions using dialog boxes
	 * allows users to deposit or withdraw money from a bank account
	 * 
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */
public class Transactions
{
	public int answer1,answer2,amount;
	public boolean withdrawOK = true;
	public BankAccount ba;
    
	
	/**
	 * creates a transactions object and initializes
	 * the bank account with a starting balance
	 * 
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */
	
	public Transactions() {
    	answer1=0;
    	answer2=0;
    	amount=0;
    	ba = new BankAccount(1000);
    	
    }
    
	/**
	 * starts the transaction program
	 * 
	 * @param args command line arguments
	 * 
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */
	
	public static void main(String[] args)
	{
	  Transactions transaction = new Transactions();
	  transaction.getInput();
	  System.exit(0);
		  
	  }
	   
	
	/**
	 * prompts the user to deposit or withdraw money
	 * using dialog boxes and updates the account balance
	 * 
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */
   public void getInput() {	   
	   answer1 = JOptionPane.showConfirmDialog(null,
	                "Make a Deposit?", null, JOptionPane.YES_NO_OPTION);
	     
	   if (answer1 == JOptionPane.YES_OPTION){
	    	  String depString =
	    		         JOptionPane.showInputDialog(
	    		                               "Enter amount:");
	    	  amount = Integer.parseInt(depString);
	   
	    	  
	    ba.deposit(amount);
	    	  //deposit an amount in the account
	    	  
	    	
	    		     
	      }
	   
	   else if (answer1 == JOptionPane.NO_OPTION){
		   answer2 = JOptionPane.showConfirmDialog(null,
	                "Make a Withdraw?", null, JOptionPane.YES_NO_OPTION);
	   
		   if (answer2 == JOptionPane.YES_OPTION){
		    	  String withString =
		    		         JOptionPane.showInputDialog(
		    		                               "Enter amount:");
		    	  amount = Integer.parseInt(withString);
		    	  
		    
		    withdrawOK =  ba.withdraw(amount);
		   //withdraw an amount from the account 	  
		    	  
	   
	   }
		 
			
	   }
	   if (!withdrawOK)
		   JOptionPane.showMessageDialog(
			         null, "Your Balance  = " + ba.getBalance()+ " which is not enough for this withdraw ");
	   else
		   JOptionPane.showMessageDialog( 
				     null, " Your balance is " + ba.getBalance());

		      	   
	      }
}


