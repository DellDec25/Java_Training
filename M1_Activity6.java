/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class M1_Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CarM6 carm6 = new CarM6("Honda", 4);
       truck truck = new truck("Toyota",6);
       
       carm6.startEngine();
       carm6.refuel();
       
       System.out.println("");
       
       destroyVehicle(carm6);
       
       System.out.println("");
       
       truck.startEngine();
       truck.refuel();
       
       System.out.println("");
       
       destroyVehicle(truck);
    }
	
	public static void destroyVehicle(Vehicle Vehicle) {
         Vehicle.destroy();
	}
	
}
