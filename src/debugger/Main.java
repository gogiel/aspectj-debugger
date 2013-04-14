package debugger;

import other.TestApp;
import debugger.impl.DebuggerCLI;

public class Main {

	public static void main(String[] args) {
		// change it to debuggerinterfacefactory or smth
		DebuggerInterface debuggerInterface = new DebuggerCLI();
		Debugger.getInstance().setInterface(debuggerInterface);
		
		debuggerInterface.setup();
		
		// TODO make it xml/cli/anything-else Reflection-based
		(new TestApp()).callMethods();
		debuggerInterface.takeDown();
	}

}
