import java.util.*;
class fact
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n =sc.nextInt();
		int f=1,i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				f*=j;
			}
			System.out.println("Factorial of"+i+" is : "+f);
			f=1;
		}
	}
} 
