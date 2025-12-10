/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public abstract class Program {

	/**
	 * @param args
	 */
	private String sysout;
	private boolean isRunning = false;
	
	public Program() {
		
	}
	public void setName(String sysout) {
		this.sysout = sysout;
	}
	public String getName() {
		return sysout;
	}
	public Program (String sysout) {
		this.sysout = sysout;
	}
	abstract void run();
	abstract void stop();
	
	public void setisRunning(boolean isRunning) {
		this.isRunning = isRunning; }
	public boolean getisRunning() {
		return isRunning; }
		
		// TODO Auto-generated method stub
}
