package ReverseAndForeach;

import java.util.ArrayList;
import java.util.Collections;

public class testCollectionsReverse {

	public static void main(String[] args) {
		ArrayList<String> tar=new ArrayList<String>();
		tar.add("hello ");
		tar.add("my ");
		tar.add("name ");
		tar.add("is ");
		tar.add("cong ");
		for (String string : tar) {
			System.out.print(string);
		}
		System.out.println();
		Collections.reverse(tar);
		for (String string : tar) {
			System.out.print(string);
		}
	}
}
