package OperatorsQuestions;
import java.util.Scanner;
public class ShiftingOperators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Demonstrate left shift and right shift operations on an integer.
		System.out.print("Enter any number :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("Enter any number to do operation with "+x+":");
		int y = sc.nextInt();
		System.out.println();
		System.out.println("Before Left shift : "+x);
		System.out.println("After left shift("+x+"<<"+y+") result is " +(x<<y));
		System.out.println();
		System.out.println("Before Right shift : "+x);
		System.out.println("After Right shift("+x+">>"+y+") result is " +(x>>y));
	}

}
