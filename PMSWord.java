/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class PMSWord extends Program {

	/**
	 * @param args
	 */
	public PMSWord (String name) {
		super (name); }
	public void run() {
		String sysout = "Open MS Word...";
		System.out.println(sysout);
		setisRunning(true); }
	public void stop() {
		String sysout = "Stop MS Word...";
		System.out.println(sysout);
		setisRunning(false); }
		// TODO Auto-generated method stub

	}

