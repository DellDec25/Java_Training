/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class M4_Activity3 {

	public static void main(String[] args) {
		{
		//	ATMTransaction atm = new ATMTransaction();

	        System.out.println("--- Test Case 1: Savings Account ---");
	        ATMTransaction.checkBalance("100123456", 15000.00);

	        System.out.println("--- Test Case 2: Checking Account ---");
	        ATMTransaction.checkBalance("200987654", 25000.00);

	        System.out.println("--- Test Case 3: Invalid Account Number Format ---");
	        ATMTransaction.checkBalance("ABC12345", 15000.00);

	        System.out.println("--- Test Case 4: Account Number ---");
	        ATMTransaction.checkBalance(" ", 15000.00);
    	}
	}
}
