package controlstatementquestions;
import java.util.Scanner;
public class MultipicationTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number you want: ");
		int x = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(x +"X"+ i +"=" +(x*i));
		}
	}

}
