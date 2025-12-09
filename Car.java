/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class Car {
    private String Brand;
    private String Kulay;


public Car() {
}
   
public Car (String Brand, String Kulay) {
	this.Brand = Brand;
	this.Kulay = Kulay;
}

public String getBrand() {
	return Brand;
}

public String setBrand(String Brand) {
	return this.Brand = Brand;
}

public String getKulay(String Kulay) {
	return this.Kulay = Kulay;
}
public String setKulay(String Kulay) {
	return this.Kulay = Kulay;
}

public void Drive() {
	System.out.println("This Car brand is " + Brand + " and color is " + Kulay);
}
}




