/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class M3_Activity3 {
	public static void main(String[] args) {
		Car kotsem1 = new Car();
		kotsem1.setBrand("Toyota");
		kotsem1.setKulay("Red");
		
		kotsem1.Drive();
		
		Car kotsem2 = new Car("Hoda", "Blue");
		kotsem2.Drive();
	}

}
