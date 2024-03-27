package Prac;
import java.util.*;
public class Exp24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("Enter number: ");
		n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of digit " + n + " is"+sum);

	}

}