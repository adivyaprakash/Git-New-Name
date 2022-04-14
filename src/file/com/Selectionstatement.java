package file.com;

import java.util.Scanner;

public class Selectionstatement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the month");
	String month = sc.nextLine();
	
	if (month.equals("January"))
	{
		System.out.println("This is january");
	}

	else if(month.equals("Febraruy"))
	{
		System.out.println("This is Febraruy");
	}
	else
	{
		System.out.println("This is Summer begining");
	}
}
}
