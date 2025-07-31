package controlstatementquestions;
import java.util.Scanner;
public class AcceptingNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accept numbers until user enters 0
		
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("Enter any number (0 to stop):");
			num = sc.nextInt();
			if(num != 0) {
				System.out.print("You enterned number is "+num);
				System.out.println();
			}
		}while(num!=0);
		System.out.println("You entered 0 and the program is stopped");
	}

}



