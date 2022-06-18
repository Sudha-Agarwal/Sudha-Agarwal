package IT;

import Admin.Animal;
import Admin.AnimalInterface;

public class RunnerClass {

	public static void main(String[] args) {
		//second second = new second();
		//second.setValue();
		
		AnimalInterface obj =  (AnimalInterface) new Dog();
		//here obj is the base class reference variable
		//it can be assigned object of child class
		//this is called as dynamic method dispatch
		//also called as runtime polymorphism
		
		obj.eat();//here eat method of the dog class would be called
		
		AnimalInterface obj1 = new Cat();
		obj1.sound();	

	}

}
