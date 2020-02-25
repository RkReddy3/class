package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class read_And_Write_data {

	public static void main(String[] args) throws FileNotFoundException 
	{
		//To Read data from file
		FileInputStream x=new FileInputStream("C:\\RkReddy3\\123.xlsx");
		
		
		
		//To write data into file
		FileOutputStream y=new FileOutputStream("C:\\RkReddy3\\123.xlsx");
		

	}

}
