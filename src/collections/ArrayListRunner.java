package collections;

import java.util.*;

public class ArrayListRunner {

	public static void main(String[] args) {
		//int [] arr
ArrayList<Integer> arraylist = new ArrayList<Integer>();

arraylist.add(12);
arraylist.add(20);

//System.out.println(arraylist.size());

arraylist.add(20);

//System.out.println(arraylist.size());
arraylist.add(30);
arraylist.add(30);
arraylist.add(30);

arraylist.set(4, 40);

//System.out.println(arraylist);


arraylist.remove(0);

arraylist.add(1,50);

//System.out.println(arraylist);



//way of iteration - iteration is looping through or
//accessing all the elements of an arrayList
for(int i=0; i< arraylist.size(); i++) {
	//System.out.println(arraylist.get(i));
}



ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
arraylist1.add(200);


Iterator it = arraylist.iterator();

Iterator it1 = arraylist1.iterator();

while(it.hasNext()) {
	System.out.println(it.next());
}














	}

}
