package OperatorsQuestions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ArithmeticOperations {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. Perform addition, subtraction, multiplication, division, and modulus of two numbers.
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br  = new BufferedReader(isr);
		//System.out.println("Enter 1st number: ");
		//int a = Integer.parseInt(br.readLine());
		//System.out.println("Enter 2nd number: ");
		//int b = Integer.parseInt(br.readLine());
		System.out.println("The sum of given values is : " +(a+b));
		System.out.println("The Subtraction of given values is : " +(a-b));
		System.out.println("The Multiplication of given values is : " +(a*b));
		System.out.println("The Division of given values is : " +(a/b));
		System.out.println("The Modulus of given values is : " +(a%b));


	}
}
