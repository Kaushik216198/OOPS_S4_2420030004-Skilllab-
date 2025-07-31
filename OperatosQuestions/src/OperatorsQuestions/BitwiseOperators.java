package OperatorsQuestions;
import java.util.Scanner;
public class BitwiseOperators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demonstrate bitwise AND, OR, XOR, and complement operators on two numbers.
		System.out.println("Enter any two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();	
		System.out.println("Performed AND operator on given numbers: "+(a&b));
		System.out.println("Performed OR operator on given numbers: "+(a|b));
		System.out.println("Performed XOR operator on given numbers: "+(a^b));
		System.out.println("Performed COMPLEMENT operator on given numbers: "+(~b));
		System.out.println("Performed COMPLEMENT operator on given numbers: "+(~a));

		
	}
}
