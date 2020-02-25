package Corejava;

public class static_and_nonstatic {
	String name="Rkreddy";
	static int age=28; 

	public static void main(String[] args) {
		//System.out.println(name);
		System.out.println(age);
		krishna();
		static_and_nonstatic.krishna();
		static_and_nonstatic obj=new static_and_nonstatic();
		obj.ram();
		obj.krishna();

	}
	public void ram()
	{
		System.out.println("Ramkrishna");
		krishna();
	}
	public static void krishna() {
		System.out.println("Ramkrishna method");
	}

}
