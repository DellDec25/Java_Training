/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class M4_Actvity4 {
	
	public static void main(String[] args) {
	
	try {
		AccountValidator.validateAccountNumber("1234567890");
         
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    
    try {
    	AccountValidator.validateAccountNumber("123");
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    
    try {
    	AccountValidator.validateAccountNumber(null);
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

}

}
