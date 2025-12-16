/**
 * 
 */
package ph.com.bpi.practice.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 */
public class M2_FActivity1 {

	//array name
		static Scanner scanner = new Scanner(System.in);
		static HashSet<String> products = new HashSet<>(Arrays.asList("Laptop","Mouse","Keyboard","Monitor","Printer"));
		static String pName;
		
		
		//choices
		public static void mainMenu(){
	        System.out.print("===== Select An Option =====\n"
	        		+ "1 - Search a product\n"
	        		+ "2 - Add a product\n"
	        		+ "3 - Print all products and count \n"
	        		+ "4 - EXIT\n"
	        		+ "Enter your Choice: ");   
	          enterChoice();
		}// main menu options
		public static void enterChoice(){
	        char choice = scanner.next().charAt(0);
	        int LowerChoice = choice;
	        switch(LowerChoice){
	        	case '1':
	        		searchProduct();
	        		mainMenu();
	        		break;
	        	case '2':
	        		addProduct();
	        		mainMenu();
	        		break;
	        	case '3':
	        		printProductCount();
	        		mainMenu();
	        		break;
	        	case '4':
	        		System.out.println("==== EXIT ====");
	        		scanner.close();
	        		System.exit(0);
	        }
		}
		public static void searchProduct() {
				
			System.out.print("Enter Product name you want to search: ");
			scanner.nextLine();
			
			pName = scanner.nextLine();
			
			if(products.contains(pName)) {
				System.out.println("Product Found: " + pName);
			}
			else {
				System.out.println("There is no product named: " + pName);
			}
		}// search function
		public static void addProduct() {
			scanner.nextLine();
			
			System.out.print("Enter Product name you want to add: ");
			pName = scanner.nextLine();
			
			products.add(pName);
			System.out.println("Product added: " + pName);
		}// add function
		public static void printProductCount() {
			System.out.println("All Products: ");
			for(String i: products) {
				System.out.println(i);
		    }
			System.out.println("Total Unique Products: " + products.size());
		}// display function
		public static void main(String[] args) {
			mainMenu();
		}

}
