import java.util.*;
public class javaarmstrong
{
	public static void main(String args[])		
	{
		int rem,sum=0,m,i;		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n =ip.nextInt();
		m=n;
                while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(m==sum)
		{ 
			System.out.println("Given number is armstrong");	
		}
		else
		{
			
			System.out.println("Given number is not armstrong");
		}
	}
}

