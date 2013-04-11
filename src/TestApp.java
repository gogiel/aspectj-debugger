
public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestApp app = new TestApp();
		app.callMethods();
	}
	
	void callMethods(){
		methodA();
		methodB();
	}
	
	void methodA(){
		System.out.println("Method A");
	}
	
	void methodB(){
		System.out.println("Method B");
	}

}
