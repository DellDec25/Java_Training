/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class M4_Activity1 {

	public static void main(String[] args) {
		Bank_Account bankAccount = new Bank_Account();
		
		System.out.println("=== Bank Account Name Display ===");
		bankAccount.getAccountNameString("ACC-001"); 
		bankAccount.getAccountNameString("ACC-002"); 
        bankAccount.getAccountNameString("ACC-999"); 
        
        System.out.println("=== Program completed succesfully! ===");

	}

}
