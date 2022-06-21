package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueWithComparator {

	public static void main(String[] args) {
		
		NumberComparator obj =  new NumberComparator();
PriorityQueue<Integer> numbers = new PriorityQueue<Integer>(obj);
		
		numbers.add(4);
		
		numbers.add(2);
		numbers.add(5);
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		
		numbers.add(8);
		
		numbers.add(6);
		
		numbers.add(0);	
		
		System.out.println(numbers);

	}

}


class NumberComparator implements Comparator<Integer>{

	
	public int compare(Integer number1, Integer number2) {
		System.out.println("compare called");
		if(number1 > number2) {
			return -1;
		}
		
		else if(number1 < number2) return 1;
		
		else return 0;
	}
	
}
