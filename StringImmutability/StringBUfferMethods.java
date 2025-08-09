package StringImmutability;

public class StringBUfferMethods {
	public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("append: " + sb);

        
        sb.insert(5, ",");
        System.out.println("insert: " + sb);

        
        sb.replace(7, 12, "Java");
        System.out.println("replace: " + sb);

        
        sb.delete(5, 6);
        System.out.println("delete: " + sb);

        
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt: " + sb);

       
        sb.reverse();
        System.out.println("reverse: " + sb);

        
        sb = new StringBuffer("Hello World");

        
        System.out.println("length: " + sb.length());

        
        System.out.println("capacity: " + sb.capacity());

        
        System.out.println("charAt(1): " + sb.charAt(1));

        
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt: " + sb);

        
        System.out.println("substring(6): " + sb.substring(6));

        
        System.out.println("substring(0,5): " + sb.substring(0,5));

        
        String str = sb.toString();
        System.out.println("toString: " + str);

        
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity: " + sb.capacity());

        
        sb.setLength(5);
        System.out.println("setLength: " + sb);
    }
}
