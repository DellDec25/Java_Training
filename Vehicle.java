/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public abstract class Vehicle {
		/**
		 * @param args
		 */
	private String brand;
	private int numofwheels;
	
	public Vehicle() {
		
	}
	public Vehicle(String brand, int numofwheels) {
		this.brand = brand;
		this.numofwheels = numofwheels ;
	}
	public void setnumofwheels(int numofwheels) {
		this.numofwheels = numofwheels ;
	}
	public int getnumofwheels () {
		return numofwheels;
	}
	public void setbrand(String brand) {
		this.brand = brand ;
	}
	public String getbrand() {
		return brand;
	}
	public void destroy() {
		System.out.println(brand + " with " + numofwheels + " wheels destroyed");
	}
		/**
	 * @param args
	 */
		// TODO Auto-generated method stub
	public void startEngine() {
		// TODO Auto-generated method stub
		
	}
		public void refuel() {
			// TODO Auto-generated method stub
			
		}

	}
