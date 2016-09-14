import java.util.Scanner;

public class sumless29 {
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner cs=new Scanner(System.in);
		n=cs.nextInt();
		
		for(int i=0;i<=n;i++){
			sum=sum+i;
		}
		System.out.println(sum);
		
	}

}
