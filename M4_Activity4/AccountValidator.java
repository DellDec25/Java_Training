/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class AccountValidator {

	public static void validateAccountNumber(String accountNumber) throws Exception {

        if (accountNumber == null) {
        	System.out.println("Account Numer: " + accountNumber);
            throw new NullPointerException("Cannot be null");
        }

        if (accountNumber.length() != 10) {
        	System.out.println("Account Numer: " + accountNumber);
            throw new Exception("Must be 10 digits");
        }

        System.out.println("Valid account: " + accountNumber);
    }

}