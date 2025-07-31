package controlstatementquestions;
import java.util.Scanner;
public class WeekdayNames {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the day number (1-7):");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x==1) System.out.println("Sunday");
		else if(x==2) System.out.println("Monday");
		else if(x==3) System.out.println("Tueday");
		else if(x==4) System.out.println("Wedday");
		else if(x==5) System.out.println("Thursday");
		else if(x==6) System.out.println("Friday");
		else System.out.println("Satday");
	}
}
