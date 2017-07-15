package PriorityQueueComparetor;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class testPriorityQueue {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		PriorityQueue<String> p=new PriorityQueue<String>(
				new Comparator<String>() {	 //the comparable is inner but the compartor is outer
					public int compare(String s1,String s2) {
						return s1.length()-s2.length();
					}
				});
		while(c.hasNext()) {
			p.add(c.nextLine());
			for (String string : p) {
				System.out.println(string);
			}
			System.out.println("***************************************");
		}

	}

}
