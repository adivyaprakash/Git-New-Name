package file.com;

public class Exception_eg {

	public static void main(String[] args) {
		
		
		try
		{
			String [] colour= {"blue","red","green","black"};
			System.out.println(colour[10]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("It ends with finally block");
		}
		
}}
