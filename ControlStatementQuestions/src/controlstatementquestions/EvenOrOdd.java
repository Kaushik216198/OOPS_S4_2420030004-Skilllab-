package controlstatementquestions;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if the given number is even or odd
		System.out.print("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x%2==0) System.out.println("The given number "+x+" is Even");
		else System.out.println("The given number "+x+" is Odd");
	}
}
