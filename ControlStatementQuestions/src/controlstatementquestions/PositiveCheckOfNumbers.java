package controlstatementquestions;
import java.io.IOException;
import java.util.Scanner;
public class PositiveCheckOfNumbers {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//Check if a number is positive
		System.out.print("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x>0) System.out.println("The given number "+x+" is positive");
		else System.out.println("The given number "+x+" is negative");
	}
}
