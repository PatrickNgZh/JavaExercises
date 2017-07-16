package StringUsage;

public class testSpilt {

	public static void main(String[] args) {
		String res = "Hello! This is a test using spilt.";
		String[] result;
		result=res.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
