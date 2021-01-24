package Pkg1;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("A");
		v.add("C");
		v.add("B");
		v.add("D");
		v.add("F");
		v.add("E");
		v.add("H");
		v.add("G");
		
		System.out.println(v);
		
		//v.clear();
		
		v.firstElement();
		System.out.println(v.firstElement());
		//v.forEach(arg0);
		
		

	}

}
