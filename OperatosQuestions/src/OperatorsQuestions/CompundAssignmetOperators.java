package OperatorsQuestions;
import java.io.IOException;
import java.util.Scanner;
public class CompundAssignmetOperators {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Demonstrate compound assignment operators on a number.
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y=1;
		
		System.out.println("Compound Assignment Operators:");
	    System.out.println("Perfomed operator is += and the value is "+(x+=y));
	    System.out.println("Perfomed operator is -= and the value is "+(x-=y));
	    System.out.println("Perfomed operator is *= and the value is "+(x&=y));
	    System.out.println("Perfomed operator is /= and the value is "+(x/=y));
	    System.out.println("Perfomed operator is %= and the value is "+(x%=y));
	    System.out.println();

	    System.out.println("Bitwise Compound Assignment Operators:");
	    System.out.println("Perfomed operator is &= and the value is "+(x&=y));
	    System.out.println("Perfomed operator is |= and the value is "+(x|=y));
	    System.out.println("Perfomed operator is ^= and the value is "+(x^=y));
	    System.out.println("Perfomed operator is <<= and the value is "+(x<<=y));
	    System.out.println("Perfomed operator is >>= and the value is "+(x>>=y));
	    System.out.println("Perfomed operator is >>>= and the value is "+(x>>>=y));
	}
}
