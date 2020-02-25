package Interview_Java;

public class Count_Vowels {

	public static void main(String[] args) {
		String a="ALEKHYA";
		String b=a.toLowerCase().toString();
		
		int count=0;
		
		for(int i=0;i<b.length();i++)
		{
			if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		System.out.println(b.charAt(0));
	}

}
