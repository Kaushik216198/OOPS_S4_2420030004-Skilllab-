package Strings;

public class StringMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. program to work with multiple string methods.
		String str = "Hello Everyone, this is Kaushik";
		String str1 = "CSE department ";
		String str2 = "                     Hello World      ";
		String str3 ="";
		Integer rollno = 30004;
		System.out.println("Your string str is: "+ str);
		System.out.println("Your string str1 is: "+ str1);
		System.out.println("Your string str2 is: "+ str2);
		System.out.println("Your string str3 is: "+ str3);
		System.out.println("Your Integer(WC) rollno is: "+ rollno);
		System.out.println();
		
		System.out.println("Length of the string is: "+str.length());
		System.out.println("Character at 6th index is: "+str.charAt(6));
		System.out.println("Substring from index 3 is: "+str.substring(3));
		System.out.println("Substring from index 5 to index 10: "+str.substring(5,10));
		System.out.println("Checking equality of str and str1: "+str.equals(str1));
		System.out.println("Checking equality of by ingoring case: "+str.equalsIgnoreCase(str1));
		System.out.println("Comparing str and str1: "+str.compareTo(str1));
		System.out.println("Checking equality of str and str1: "+str.equals(str1));
		System.out.println("Checking weather str contains 's' or not: "+str.contains("s"));
		System.out.println("Whether str1 is starting with 'A' or not: "+str.startsWith("A"));
		System.out.println("Character 'E' in str string is at index: "+str.indexOf("E"));
		System.out.println("Last index of 'i': "+str.lastIndexOf("i"));
		System.out.println("After trimming string str2: "+str2.trim());
		System.out.println("Replacing 'H' in str with 'x': "+str.replace('H','x'));
		System.out.println("Replacing all 'i' in str with 'x': "+str.replaceAll("i","x"));
		System.out.println("Replacing first 'i' in str with 'x': "+str.replaceFirst("i","x"));
		System.out.println("Converting str2 to lower case: "+str2.toLowerCase());
		System.out.println("Converting str2 to upper case: "+str2.toUpperCase());
		System.out.println("Weather str3 is emmpty or not: "+str3.isEmpty());
		System.out.println("Printing value of string str: "+String.valueOf(str));
		System.out.println("Printing value of Integer(WC) rollno: "+Integer.valueOf(rollno));
	}



	}

