
public class CalculatorClass {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		double result = obj.multiply(2.0f,3); //--function call
		int result1 = obj.multiply(2); // ---function call
		
		System.out.println(result);
		System.out.println(result1);
		
		
		//type casting
		float f = 1000;// here 10 is integer or int and 
					 //is called as implicit type casting
		
		byte b = (byte)1000; //explicit type casting
		
		
		int i = (int)10.0;
		
		double d = 10;
		
		System.out.println(i);
		
		int a =65;
		
		char c =(char)a;
		
		int result3 = obj.convertStringToInt("123");
		System.out.println(result3);
		
		System.out.println(c);

	}

}

class Calculator{
	
	int sum(int num1, int num2){
		int num3 = num1 + num2;
		return num3;
	}
	
	
	//method overloading depends upon number and type of parameters
	//method overloading
	double multiply(double num1, double num2){
		return num1 * num2;
	}
	
	
	//method overloading
	int multiply(int num1, int num2){
		return num1 * num2;
	}
	
	//method overloading
	int multiply(int num1){
		return num1* num1;
	}
	
	int difference(int num1, int num2){
		int num3 = num1 - num2;
		return num3;
	}
	
	int division(int num1,int num2){
		return num1/num2;
	}
	
	
	int convertStringToInt(String input) {
		int result = Integer.parseInt(input);
		return result;
	}
}
