/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class Bank_Account {

	String accountName = "";
    public Bank_Account() {
		
	}
	public void getAccountNameString(String accountNumber) {
		
        try {
            if ("ACC-001".equals(accountNumber)) {
                accountName = "Juan Dela Cruz";
                System.out.println("Looking up account: " + accountNumber);
                System.out.println("Account Holder: " + accountName);
                System.out.println();
                
            } else if ("ACC-002".equals(accountNumber)) {
                accountName = "Maria Santos";
                System.out.println("Looking up account: " + accountNumber);
                System.out.println("Account Holder: " + accountName);
                System.out.println();
            } else {
            	System.out.println("Looking up account: " + accountNumber);
                throw new IllegalArgumentException("Account not found!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(" ");
        }
               
	}

}
