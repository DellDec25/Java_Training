/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class Accountvalidataor {

	public static void validateAccountNumber(String accountNumber) throws InvalidAccountnumberException {

        if (accountNumber == null) {
        	System.out.println("Account Numer: " + accountNumber);
            throw new NullPointerException("Cannot be null");
        }

        if (accountNumber.length() != 10) {
        	System.out.println("Account Numer: " + accountNumber);
            throw new InvalidAccountnumberException("Must be contains digits only");
        }

        for (char c : accountNumber.toCharArray()) {
			if (!Character.isDigit(c)) {
				System.out.println("Account Numer: " + accountNumber);
				throw new InvalidAccountnumberException("Warning: Account number must contain only digits");
			}
		}

        System.out.println("Valid account: " + accountNumber);
    }

}
