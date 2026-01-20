/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class M4_Activity5 {

	public class InvalidAccountnumberException extends Exception {
		public InvalidAccountnumberException (String message) {
			super(message);
    	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Accountvalidataor.validateAccountNumber("1234567890");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		try {
			Accountvalidataor.validateAccountNumber("123000000X");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		try {
			Accountvalidataor.validateAccountNumber(null);
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
}
}