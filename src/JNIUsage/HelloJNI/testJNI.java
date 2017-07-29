package JNIUsage.HelloJNI;

public class testJNI {

	public native static void sayHelloFromCPP();
	
	public static void main(String[] args) {
		
		sayHelloFromCPP();

	}
	
	static {
		System.loadLibrary("SayHello");
	}

}
