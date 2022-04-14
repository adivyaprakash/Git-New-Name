package file.com;

public class String1 {
public static void main(String[] args) {
	
	String s= "Java";
	String s1= "java";
	String s2= new String("java");
	
	
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s));
	String replace = s.replace('a' , 'q');
	
	System.out.println(replace);
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(replace));

	StringBuffer sb =new StringBuffer();
	sb.append("java");
	System.out.println(System.identityHashCode(sb));
	System.out.println(sb.substring(0, 2));
	System.out.println(System.identityHashCode(sb));
	

}
}