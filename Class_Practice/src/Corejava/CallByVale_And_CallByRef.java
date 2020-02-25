package Corejava;

public class CallByVale_And_CallByRef {
	int p;
	int q;

	public static void main(String[] args) {
		CallByVale_And_CallByRef obj=new CallByVale_And_CallByRef();
		int x=20;
		int y=30;
		obj.testsum(x,y);//call by value OR
		obj.p=60;
		obj.q=80;
		obj.swap(obj);
		//After swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	public int testsum(int a,int b) {
		a=30;
		b=50;
		int c=a+b;
		return c;		
	}
	// call by reference
	public void swap(CallByVale_And_CallByRef t) {
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
	}
	

}
