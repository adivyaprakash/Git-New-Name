package file.com;

public class Stringfunctions {
	public static void main(String[] args) {
		String s="java";
		
		System.out.println(System.identityHashCode(s));
		
		int length = s.length();
		System.out.println(length);
		
		char charAt = s.charAt(1);
		System.out.println(charAt);
		
		int codePointBefore = s.codePointBefore(1);
		System.out.println(codePointBefore);
		
		int codePointCount = s.codePointCount(0, 2);
		System.out.println(codePointCount);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean contentEquals = s.contentEquals("java");
		System.out.println(contentEquals);
		
		int compareTo = s.compareTo("javaw");
		System.out.println(compareTo);
		
		String s2="";
		
		for (int i =s.length()-1; i>= 0; i--)
			s2=s2+s.charAt(i);
		
			System.out.println(s2);
		
		String st= new String("Hi welcome to newclass");
		
		for (int i = 0; i < st.length(); i++) {
			
			if(st.charAt(i) == 'a'|| st.charAt(i) == 'e'|| st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u')
				System.out.println("Given string contains "+st.charAt(i)+" at the index "+i);
			
		}
		
		
	}

	
}
