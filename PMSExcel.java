/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class PMSExcel extends Program {
	/**
	 * @param args
	 */
	public PMSExcel (String name) {
		super(name);
	}
	
	public void run() {
    	String sysout = "Open MS Excel...";
       	System.out.println(sysout);
       	setisRunning(true); }
	
	@Override
    public void stop() {
    	String sysout = "Stop MS Excel...";
        System.out.println(sysout);
        setisRunning(false); }
}
