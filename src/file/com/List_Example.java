package file.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Example {
	
	public static void main(String[] args) {
		
		List l=new Vector();
		l.add(10);
		l.add(15);
		l.add(55);
		l.add(66);
		System.out.println(l);
		
		l.addAll(l);
		System.out.println(l);
		
		boolean contains = l.contains(55);
		System.out.println(contains);
		boolean equals = l.equals(15);
		System.out.println(equals);
		Object remove = l.remove(0);
		System.out.println(remove);
		
		
	}

}
