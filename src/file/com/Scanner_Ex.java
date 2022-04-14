package file.com;

import java.util.Scanner;

public class Scanner_Ex {
	public static void main(String[] args) throws ToooldException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String next = sc.nextLine();
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		if(age>60) 
		{
			throw new ToooldException ("Way too old");
		
		}
		else
			System.out.println("Successfully Registered");
	}
}