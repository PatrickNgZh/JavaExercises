import java.util.Arrays;

public class testSort {

	public static void main(String[] args) {
		int[] array =new int[] {7,4,5,20,77,18,6,30};
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
