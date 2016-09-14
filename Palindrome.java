import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int reversedNumber=0;
		 while(n != 0)
		    {
		       int remainder = n%10;
		        reversedNumber = reversedNumber*10 + remainder;
		        n /= 10;
		    }
		 if(n==reversedNumber)
		 {
			 System.out.println("Palindrome");
		 }
		 else
			 System.out.println(" not a Palindrome");
	}

}
