import java.util.Scanner;

public class LCM {

	public static void main(String args[])
	{
		int lcm=0;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=a;i<=a*b;i++)
		{
		if(i%a==0 && i%b==0)
		{
			lcm=i;
			break;
		}
		}
		System.out.println(lcm);
	}
}

