package calc;
import java.util.Scanner;



public class calculator {
	
	public static int sum(int number1, int number2) {
		return number1 + number2;  // (5 + 5) 
	}
	
	
	public static int minus(int number1, int number2) {
		return number1 - number2;  // (5 - 5)
	}
	
	public static int Multiply(int number1, int number2) {
		return number1 * number2; //(2 * 2)
	}

	
	public static int divide(int number1, int number2) {
		if (number2==0) {
			throw new IllegalArgumentException("Number can not be divided bt zero");
		}
		else
		return number1 / number2; //(6 / 3)
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int number1=sc.nextInt();
		System.out.println("enter second number");
		int number2=sc.nextInt();
		calculator calculator=new calculator();
		System.out.println("sum "+calculator.sum(number1, number2));
		System.out.println("minus "+calculator.minus(number1, number2));
		System.out.println("Multiply "+calculator.Multiply(number1, number2));
		System.out.println("divide "+calculator.divide(number1, number2));
	sc.close();
	}


	
}
