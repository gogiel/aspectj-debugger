
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		(new Thread(new DebuggerCLI())).start();
		
		// TODO make it xml/cli/anything-else based
		(new TestApp()).callMethods();
	}

}
