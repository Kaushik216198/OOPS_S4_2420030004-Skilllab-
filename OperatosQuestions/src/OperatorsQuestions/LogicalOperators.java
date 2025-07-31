package OperatorsQuestions;
import java.io.IOException;
import java.util.Scanner;
public class LogicalOperators {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//Check if a student passed both theory and practical exams using logical AND.	
		boolean theory = true;
		boolean practical = false;
		if(theory && practical) System.out.println("Student is passed");
		else System.out.println("Student is failed");
				
	}
}
