package JNIUsage.TypeJNI;

public class testType {
	
	public native static String getStringFromCPP();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static {
		System.loadLibrary(libname);
	}

}
