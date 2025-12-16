/**
 * 
 */
package ph.com.bpi.practice.main;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 */
public class M2_Activity1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		ArrayList<String> products = new ArrayList<String>();
		
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Printer");
        
        System.out.println("All products: ");
        for(int i = 0 ; i < products.size() ; i++){
        	System.out.printf("  %d) %s%n", i + 1, products.get(i));
        }
        

        products.add("Webcam");              // add new
        products.remove("Mouse");            // remove by value
        System.out.println("After adding and removing products: ");
        
        for(int i = 0 ; i < products.size() ; i++){
        	System.out.printf("  %d) %s%n", i + 1, products.get(i));
        }
        
        System.out.println("Enter string to search: ");
        String search = scanner.nextLine();
        
        
        if(products.contains(search)) {
        	System.out.println("Product Found: " + search);
        }
        else {
        	System.out.println("Product not found!");
        }

		scanner.close();
	}
	
}
