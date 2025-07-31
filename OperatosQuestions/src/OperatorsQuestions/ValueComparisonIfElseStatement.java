package OperatorsQuestions;
import java.io.IOException;
import java.util.Scanner;
public class ValueComparisonIfElseStatement {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Compare two integers and display which one is greater or if they are equal.
		System.out.println("Enter any two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) System.out.println("The number " +a+" is greater than " +b);
		else System.out.println("The number "+b+" is greater than " +a);
	}
}
