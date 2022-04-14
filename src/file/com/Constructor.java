package file.com;

public class Constructor {

	int c,d;
	String name;
	Constructor (int a){
		this.c=a;
	}
	public Constructor(int a,String name1) {
		this.d=a;
		this.name=name1;
	}
	public static void main(String[] args) {
		Constructor c=new Constructor(12);
		Constructor c1=new Constructor(12,"java");
		System.out.println(c.c);
		System.out.println(c1.d);
		System.out.println(c1.name);
		
		
	}
}
