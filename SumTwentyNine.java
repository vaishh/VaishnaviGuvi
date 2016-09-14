import java.util.Scanner;

public class SumTwentyNine{
	public static void main(String args[])
	{
		int n,summ=0;
		Scanner cs=new Scanner(System.in);
		n=cs.nextInt();
		
		for(int i=0;i<=n;i++){
			summ=summ+i;
		}
		System.out.println(summ);
		
	}

}
