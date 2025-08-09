package StringImmutability;
import java.util.Scanner;
public class ReverseLastName {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();

        int spaceIndex = fullName.lastIndexOf(" ");
        if (spaceIndex == -1) {
            System.out.println("Please enter both first and last name.");
            return;
        }

        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1);

        StringBuffer sb = new StringBuffer(lastName);
        sb.reverse();

        System.out.println("Result: " + firstName + " " + sb);
    }
}
