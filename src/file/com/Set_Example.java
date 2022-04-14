package file.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Example {
	public static void main(String[] args) {
		Set s1= new HashSet <>();
		
		s1.add(10);
		s1.add(25);
		s1.add("java");
		s1.add(20);
		s1.add(15);
		System.out.println(s1);
		
		boolean contains = s1.contains(25);
		System.out.println(contains);
		
		Iterator<Integer> iterator = s1.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
			for (Object k : s1) {
				System.out.println("for each"+k);
				
		List l= new ArrayList(s1);
		Object object = l.get(4);
		System.out.println(object);
				
				
			}
		
	}

}}
