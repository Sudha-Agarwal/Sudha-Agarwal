package Admin;


//we donot create the objects of abstract class
public abstract class Animal {
	
	//abstract method
	protected abstract void sound();	
	
	
	//non abstract or concrete method
	public void eat() {
		System.out.println("animal is eating");
	}
}
