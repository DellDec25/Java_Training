/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class ATMSystem {

		static double[] accounts = { 10000, 15000, 20000 };

		public static void processWithdrawal(String accountIndex, String amountInput) {

		try {
			int index = Integer.parseInt(accountIndex);
			Double balance = accounts[index];
			Double amount = Double.parseDouble(amountInput);
			
			System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);
		    //  System.out.println("Withdrawal: " + String.valueOf(amount));
			System.out.println(String.format("Withdrawal:  %.2f", amount) );
								
			if (amount > balance) {
				System.out.println("Insufficient funds! Cannot withdraw P" + amountInput);
			} else {
			//	System.out.println("Current balance: " + String.valueOf(balance));
				System.out.println(String.format("Current balance:  %.2f", balance) );
				balance -= amount;
				accounts[index] = balance;
			//	System.out.println("New balance: " + String.valueOf(balance));
				System.out.println(String.format("New balance:  %.2f", balance) );
				System.out.println("Withdrawal successful!");
			}
						
		} catch (NumberFormatException e) {
			System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);
			System.out.println("Error: Invalid input!");
			System.out.println("Please enter valid numbers.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);
			System.out.println("Error: Account not found!");
			System.out.println("Invalid account index.");
		} catch (Exception e) {
			System.out.println("Transaction failed!");
		}

		System.out.println();
	}
}
