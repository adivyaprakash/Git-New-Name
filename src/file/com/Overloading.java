package file.com;

public class Overloading {
	void employee()
	{
		System.out.println("Employee");
	}
	void employee(String name)
{
		System.out.println("Employee name  :"+name);

	}
	void employee(String gender, int age,float experience) {
		System.out.println("Employee gender  :"+gender);
		System.out.println("Employee age  :"+age);
		System.out.println("Employee experience  :"+experience);
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.employee();
		o.employee("Jay");
		o.employee("male", 28,3.5f);
	}
}