package debugger.impl;
import java.io.IOException;
import java.util.Scanner;
import org.aspectj.lang.JoinPoint;

import debugger.Debugger;
import debugger.DebuggerInterface;


public class DebuggerCLI implements  DebuggerInterface {

	@Override
	public void takeCommand(JoinPoint point, StackTraceElement[] stack) {
		System.out.println("Method: " + point.getSignature().getName());
		
		waitForInput();
		
		Debugger debugger = Debugger.getInstance();
		debugger.continueExecution();
		
	}

	private void waitForInput() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setup() {
		
	}

	@Override
	public void takeDown() {
		
	}

}
