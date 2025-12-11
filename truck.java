/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class truck extends Vehicle{

	public truck(String brand, int numofwheels) {

	    super(brand, numofwheels); }
	
	@Override
	public void startEngine() {
		System.out.println(getbrand() + " truck with " + getnumofwheels() + " wheels started..."); }
	
	@Override
	public void refuel() {
		System.out.println("Refuelling " + getbrand() + " truck...."); }
	
	/**
	 * @param args
	 */
}
