import java.util.Scanner;
public class RevNo {
	public static void main(String args[])
	   { 
	      System.out.println("Enter the no to be reversed: ");
	      Scanner in = new Scanner(System.in);
	      int num = in.nextInt();
	      int reversenum =0;
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of input number is: "+reversenum);
	   }
	}

