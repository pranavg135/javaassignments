package Lab_5;

import java.util.Scanner;

public class Exercise_two {
	
	static void nonrecursion(int n)
	{
		int a=1;
		int b=1;
		int sum=0;
		int i=0;
		while(i!=(n-2))
		{
			sum=a+b;
			a=b;
			b=sum;
			i++;
		}
		System.out.println(sum);
	}
	
	static int recursive(int n)
	{
		if(n<=1)
			return n;
		else
			return recursive(n-1) + recursive(n-2);
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Using non recursion method:-");
		System.out.println(n+"th value of Fibonnaci series is :");
		nonrecursion(n);
		System.out.println();
		System.out.println("Using recursion method:-");
		System.out.println(n+"th value of Fibonnaci series is :");
		System.out.println(recursive(n));
		
	}

}
