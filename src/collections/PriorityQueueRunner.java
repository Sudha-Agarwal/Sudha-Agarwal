package collections;

import java.util.PriorityQueue;

public class PriorityQueueRunner {

	public static void main(String[] args) {
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
		
		numbers.add(4);
		
		numbers.add(2);
		numbers.add(5);
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		
		numbers.add(8);
		
		numbers.add(6);
		
		numbers.add(0);
		
		
		//System.out.println(numbers.remove());
		System.out.println(numbers.peek());
		
		
		
		System.out.println(numbers);
		
		
		/*
		 * PriorityQueue<String> cities = new PriorityQueue<String>();
		 * 
		 * cities.add("Calcutta"); cities.add("Agra"); cities.add("Bangalore");
		 * cities.add("Delhi");
		 * 
		 * cities.add("Andra");
		 * 
		 * System.out.println(cities);
		 * 
		 * cities.remove();
		 * 
		 * System.out.println(cities);
		 * 
		 * cities.remove();
		 * 
		 * System.out.println(cities);
		 */
		
		
		
		
		

	}

}
