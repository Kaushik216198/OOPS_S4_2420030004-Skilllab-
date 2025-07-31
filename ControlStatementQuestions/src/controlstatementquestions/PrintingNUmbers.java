package controlstatementquestions;
import java.util.Scanner;
public class PrintingNUmbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print numbers from 1 to N
		System.out.print("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(" "+i);
		}
	}
}
