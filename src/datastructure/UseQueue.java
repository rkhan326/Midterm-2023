package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> list= new PriorityQueue<Integer>();
		for (int i = 0 ;i<15;i++){
			list.add(i);
		}

		System.out.println(list);
		System.out.println(list.peek());
		list.add(15);
		System.out.println(list);
		System.out.println("-------------");
		list.remove(0);
		System.out.println(list.poll());
		System.out.println("-------------");
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
