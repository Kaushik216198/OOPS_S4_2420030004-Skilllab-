package StringBufferOrStringBuilderClasses;

public class StringBufferOrStringBuilderClassesMethods {
	public static void main(String[] args) {
        // 1. append(String s)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("append: " + sb);

        // 2. insert(int offset, String s)
        sb.insert(5, ",");
        System.out.println("insert: " + sb); 

        // 3. replace(int start, int end, String s)
        sb.replace(7, 12, "Java");
        System.out.println("replace: " + sb); 

        // 4. delete(int start, int end)
        sb.delete(5, 6); // Removes the comma
        System.out.println("delete: " + sb);
        // 5. deleteCharAt(int index)
        sb.deleteCharAt(5); // Removes space
        System.out.println("deleteCharAt: " + sb); 

        // 6. reverse()
        sb.reverse();
        System.out.println("reverse: " + sb); 
        
        sb = new StringBuffer("Hello World");

        // 7. length()
        System.out.println("length: " + sb.length()); 

        // 8. capacity()
        System.out.println("capacity: " + sb.capacity()); 

        // 9. charAt(int index)
        System.out.println("charAt(1): " + sb.charAt(1));

        // 10. setCharAt(int index, char ch)
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt: " + sb); 

        // 11. substring(int start)
        System.out.println("substring(6): " + sb.substring(6)); 

        // 12. substring(int start, int end)
        System.out.println("substring(0,5): " + sb.substring(0,5)); 

        // 13. toString()
        String str = sb.toString();
        System.out.println("toString: " + str); 

        // 14. ensureCapacity(int min)
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity: " + sb.capacity()); 

        // 15. setLength(int newLength)
        sb.setLength(5);
        System.out.println("setLength: " + sb); 
    }
}

