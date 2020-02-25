package practice;

import java.io.File;
import java.io.IOException;

public class javapackage {

	public static void main(String[] args) throws IOException 
	{
		//Creating new file
		File x=new File("D:\\rkreddy\\autocreatedfilesandfolders\\rkreddy.xlsx");
		if(!(x.exists()))
		{
			{x.createNewFile();}
		}
		
		
//		//file exist verification
//		if((x.exists()))
//		{
//			System.out.println("file already exist");
//		}
//		//to print absolute path	
//		System.out.println(x.getAbsolutePath());
//		
//		//to delete file
//		x.delete();
		
	}

}
