/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class CarM6 extends Vehicle {

	public CarM6(String brand, int numofwheels) {

	    super(brand, numofwheels); }
	
	@Override
	public void startEngine() {
		System.out.println(getbrand() + " car with " + getnumofwheels() + " wheels started..."); }
	
	@Override
	public void refuel() {
		System.out.println("Refuelling " + getbrand() + " car...."); }
	

}
