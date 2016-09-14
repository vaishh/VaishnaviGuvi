import java.util.Scanner;

public class Count {
	public static void main(String args[])
	{
		int c1=0,c2=0,c3=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	   char ch[]=str.toCharArray();
	   for(int i=0;i<ch.length;i++)
	   {
		   if(Character.isLetter(ch[i]))
		   {
			   c1=c1+1;
		   }
		   else if(Character.isDigit(ch[i]))
		   {
			   c2=c2+1;
		   }
		   if(Character.isLetterOrDigit(ch[i]))
		   {
			   c3=c3+1;
		   }
	   }
	   System.out.println(c1);
	   System.out.println(c2);
	   System.out.println(c3);
		
	}
}
