package Lab_5;

import java.util.Scanner;

public class Exercise_three {

	static void prime(int n)
	{
		System.out.println("Prime numbers are: ");
		for(int i=2;i<=n;i++)
		{
			boolean flag=false;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer");
		int n=sc.nextInt();
		prime(n);
	}

}
