package Corejava;

public class Two_dimensional_Array {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		System.out.println(a.length);//no of rows
		System.out.println(a[0].length );//no of columns
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print("  "+a[i][j]+"  ");
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println(a[1][1]);
		

	}

}
