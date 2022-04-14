package file.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Example {
	public static void main(String[] args) {
		
		Map<Integer,String> m= new HashMap();
		m.put(1, "java");
		m.put(2, "Selinium");
		m.put(3,"c");
		m.put(4,"html");
		System.out.println(m);
		
		boolean ck = m.containsKey(1);
		System.out.println(ck);
		
		boolean cv = m.containsValue("c");
		System.out.println(cv);
		
		Set<Entry <Integer,String >> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		 Iterator<Entry<Integer, String>> i = entrySet.iterator();
		 
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		 Set<Integer> keySet = m.keySet();
		 System.out.println(keySet);
		 
		 Collection<String> values = m.values();
		 System.out.println(values);
		 
		 String replace = m.replace(1, "j");
		 System.out.println(replace);
		 System.out.println(m);
		 
		 String remove = m.remove(1);
		 System.out.println(remove);
		 System.out.println(m);
		 
		 }
	

}

