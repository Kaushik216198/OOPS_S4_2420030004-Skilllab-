package WrapperClasses;

public class AllDataTypesUsage {
	public static void main(String[] args) {
		
		
		int a = 10;
		Integer i=Integer.valueOf(a);
		System.out.println("Integer: "+i);
		
	    Long l =Long.valueOf(a);
	    System.out.println("Long: "+l);
	    
	    Float f= Float.valueOf(a);
	    System.out.println("Float: "+f);
	    
	    Double d = Double.valueOf(a);
	    System.out.println("Double: "+d);
	    
	    Character c = 'S';
	    System.out.println("Character: "+c);
	    
	    Byte b = Byte.valueOf((byte) a);
        System.out.println("Byte: " + b);

        Boolean bool = Boolean.valueOf(true);
        System.out.println("Boolean: " + bool);
	    
	    
	    

	}

	private static void valueOf(int a) {
		
		
	}

}
