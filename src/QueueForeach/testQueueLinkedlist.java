package QueueForeach;

import java.util.LinkedList;
import java.util.Queue;

public class testQueueLinkedlist {
	public static void main(String[] args) {
		Queue<Integer> test=new LinkedList<Integer>();
		for (int i = 0; i < 8; i++) {
			test.add(i);
		}
		for (Integer integer : test) {
			System.out.print(integer+" ");
		}
		System.out.println();
		Integer temp =test.poll();
		System.out.println(temp);
		for (Integer integer : test) {
			System.out.print(integer+" ");
		}
		System.out.println();
		test.add(temp);
		for (Integer integer : test) {
			System.out.print(integer+" ");
		}
		System.out.println();
	}
}
