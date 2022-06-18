package IT;

import Admin.Animal;
import Admin.AnimalInterface;

public class Dog implements AnimalInterface{
	
	public void sound() {
		System.out.println("Dog barks");
	}
	
	public void eat() {
		System.out.println("dog eats");
	}
	
	
	

}
