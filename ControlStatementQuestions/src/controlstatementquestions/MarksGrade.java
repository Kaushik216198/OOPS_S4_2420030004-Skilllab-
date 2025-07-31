package controlstatementquestions;
import java.util.Scanner;
public class MarksGrade {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Grade a student based on marks
		System.out.print("Enter your total marks out of 100:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		 if(x>90 && x<=100) System.out.println("Your grade is O");
		else if(x>80 && x<=90) System.out.println("Your grade is A+");
		else if(x>70 && x<=80) System.out.println("Your grade is A");
		else if(x>60 && x<=70) System.out.println("Your grade is B+");
		else if(x>50 && x<=60) System.out.println("Your grade is B");
		else if(x>40 && x<=50) System.out.println("Your grade is C+");
		else if(x>30 && x<=40) System.out.println("Your grade is C");
		else  System.out.println("Your grade is F");

	}

}
