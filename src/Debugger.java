import java.util.concurrent.Semaphore;

public class Debugger {
	private static Debugger appInstance = null;
	public Semaphore semaphore;
	private DebuggerInterface debuggerInterface;

	
	public static Debugger getInstance() {
		if (appInstance == null) {
			appInstance = new Debugger();
		}
		return appInstance;
	}

	private Debugger() {
		this.semaphore = new Semaphore(1);
	}
	
	public void pauseExecution(){
		System.out.println("PAUSED");
		try {
			this.semaphore.acquire();
			this.debuggerInterface.takeCommand();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setInterface(DebuggerInterface debuggerInterface) {
		this.debuggerInterface = debuggerInterface;
	}
	
	public void continueExecution(){
		semaphore.release();
	}
}
