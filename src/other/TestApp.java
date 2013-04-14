package other;
// move it later to another project
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestApp {
	
	public void callMethods(){
		
		methodWithSymbol("this is test argument");
		methodA();
		methodB();
	}
	
	void methodWithSymbol(String input) {
		System.out.println("Method: " + input);
	}
	
	void methodA(){
		System.out.println("Method A");
	}
	
	void methodB(){
		System.out.println("Method B");
	}


}
