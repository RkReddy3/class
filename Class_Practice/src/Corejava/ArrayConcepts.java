 package Corejava;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		//int array
		int i[]=new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		System.out.println(i.length);//length of array
		System.out.println(i[4]);
		//System.out.println(i[5]);// java.lang.ArrayIndexOutOfBoundsException
		
		//print all values from array list
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//double array
		double d[]=new double[5];
		d[0]=10.12;
		d[1]=20.23;
		d[2]=30.34;
		d[3]=40.45;
		d[4]=50.56;
		System.out.println(d[2]);
		System.out.println(d[1]+d[2]);
		
		//String Array
		String s[]=new String[2];
		s[0]="ram";
		s[1]="krishna";
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//Project class
		Object o[]=new Object[5];
		o[0]=25;
		o[1]="Ram";
		o[2]="Krishna";
		o[3]='@';
		o[4]=true;
		System.out.println(o.length);
		for(int n=0;n<o.length;n++) {
			System.out.print(o[n]);
			System.out.print(" ");
			
		}
		
		
		
		
		
	}
	

}
