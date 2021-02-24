import java.util.*;
public class javanfactorial
{
	public static void main(String args[])		
	{
		int f=1,i,j;		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n =ip.nextInt();
		System.out.println("Factorial of :");
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
                System.out.println("Factorial of "+i+ " is "+f);
                f=1;
        }
}
