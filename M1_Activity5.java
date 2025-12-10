/**
 * 
 */
package ph.com.bpi.practice.main;

/**
 * 
 */
public class M1_Activity5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program Excel = new PMSExcel("MS Excel");
		Program Word = new PMSWord("MS Word");
		
		runProgram(Excel);
		runProgram(Word);
		
		checkProgramStatus(Excel);
		checkProgramStatus(Word);
		
		stopProgram(Excel);
		stopProgram(Word);
		
		checkProgramStatus(Excel);
		checkProgramStatus(Word); }

		public static void runProgram(Program executableProgram) {
	         executableProgram.run();
		}
		private static void stopProgram(Program executableProgram) {
			executableProgram.stop();
		}
		private static void checkProgramStatus(Program executableProgram) {
			if(executableProgram.getisRunning() ) {
				System.out.println("Program " + executableProgram.getName() + " is running. ");
			} else {
				System.out.println("Program " + executableProgram.getName() + " is stopped. ");
		}
	}

}
