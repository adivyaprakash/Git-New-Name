package file.com;

public class Abstract extends New {

	void sub1()
	{
		System.out.println("sub");
	}

	 public static void main(String[] args) {

        Abstract a=new Abstract();
        a.sub1();
        a.sub();
	 }

}

