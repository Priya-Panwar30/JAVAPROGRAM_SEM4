package Prac;
import java.util.*;
public class Exp23{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n;
		long fact=1;
		System.out.println("Enter number:");
		n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
        System.out.println("Factorial of " + n + " is "+fact);
	}

}