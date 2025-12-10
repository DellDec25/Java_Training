/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class MyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Executable Excel = new MSExcel();
       Executable Word = new MSWord ();
       
       runProgram(Excel);
       runProgram(Word);
       
       stopProgram(Excel);
       stopProgram(Word);
	}
	
	public static void runProgram(Executable executableProgram) {
         executableProgram.run();
	}
	private static void stopProgram(Executable executableProgram) {
		executableProgram.stop();
	}
}
