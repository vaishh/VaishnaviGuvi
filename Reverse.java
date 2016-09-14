import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		
		String reverse=sb.reverse().toString();
		System.out.println(s);
		System.out.println(reverse);
			}

}
