
public aspect Breakpoints {
	pointcut methodCall (): within(TestApp) && call(public void *(..));
	// TODO make it more general (template based?).
	// Change within(TestApp) to ! within(debugger-context)
	
	void around() : methodCall() {
		Debugger debugger = Debugger.getInstance();
		debugger.pauseExecution();
		try {
			debugger.semaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		debugger.semaphore.release();
		System.out.println("BEFORE METHOD CALL");
		proceed();
		System.out.println("AFTER METHOD CALL");
	}
	

}
