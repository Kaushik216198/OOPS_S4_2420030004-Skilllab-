package StringImmutability;

public class StringComparison {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println("str1 == str2: " + (str1 == str2));     
        System.out.println("str1 == str3: " + (str1 == str3));    
        System.out.println("str1.equals(str3): " + str1.equals(str3)); 
    }
}
