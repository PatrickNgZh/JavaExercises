package QueueForeach;

import java.util.LinkedList;
import java.util.Queue;

public class testQueueLinkedlist {
	public static void main(String[] args) {
		Queue<Integer> test=new LinkedList<Integer>();//fix the infornation of OOP
		for (int i = 0; i < 8; i++) {//the type of Queue is the t
			test.add(i);             //the realization of type is LinkedList
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
