package StringImmutability;

public class StringBufferAppend {
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before append: " + sb);
        sb.append(" World");
        System.out.println("After append: " + sb);
    }
}
