import java.util.Scanner;


public class DebuggerCLI implements Runnable, DebuggerInterface {

	public void run() {
		Debugger debugger = Debugger.getInstance();
		debugger.setInterface(this);
	}

	@Override
	public void takeCommand() {
		System.out.println("I have command");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		
		Debugger debugger = Debugger.getInstance();
		debugger.continueExecution();
		
	}



}
