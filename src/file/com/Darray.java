package file.com;

public class Darray {
	public static void main(String[] args) {
		
	
	String s[][]=new String[2][2];
	
	s[0][0]="abc";
	s[0][1]="def";
	s[1][0]="vuw";
	s[1][1]="xyz";
	 
	for(int i = 0; i <s.length; i++)
	for(int j= 0; j <s.length; j++)
	
	System.out.print(s[i][j]+ "  " );
}
}