package Corejava;

import java.util.ArrayList;

public class ArrayListConsept {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("rkr");
		System.out.println(al.size());
		al.add(250);
		System.out.println(al.size());
		al.add(12.33);
		al.add(true);
		al.add("reddy");
		al.add('$');
		System.out.println(al.size());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(100);
		
		
		
		
		
		
	}

}
