package Corejava;

public class Wrapper_Class {

	public static void main(String[] args) {
		 //String to int
		String a="120";
		int a1=Integer.parseInt(a);
		System.out.println(a1+80);
		
		//String to double
		String d="12.12";
		double d1=Double.parseDouble(d);
		System.out.println(d1+12);
		
		//String to boolean
		String b="true";
		boolean b1=Boolean.parseBoolean(b);
		System.out.println(b1);
		
		//int to string NumberFormatException:
		int i=120;
		String s=String.valueOf(i);
		System.out.println(i+200);
		System.out.println(200+s);
		
		String x="120AB";
		int y=Integer.parseInt(x);
		System.out.println(y);
		
		
	}

}
