package OperatorsQuestions;
import java.io.IOException;
import java.util.Scanner;
public class TernaryOperators {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//7. Find the greater of two numbers using a ternary operator.
		System.out.print("Enter any two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String result = (a>b)? "First number is greater then second number":"Second number is greater than First number";
		System.out.println("The result is : "+result);

	}

}
