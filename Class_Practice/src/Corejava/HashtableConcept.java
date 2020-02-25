package Corejava;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		
		Hashtable hs=new Hashtable();
		
		hs.put("A", "Ram");
		hs.put("B", "Krishna");
		hs.put("C", "Reddy");
		hs.put('d', '9');
		hs.put(2, 100);
		hs.put(3,12.12);
		System.out.println(hs.size());
		System.out.println(hs.get('d'));
		System.out.println(hs.get(3));
		System.out.println(hs.get("C"));
		
		
		
		
		
		
	}

}
