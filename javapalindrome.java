import java.util.*;
public class javapalindrome
{
	public static void main(String args[])		
	{
		int rem,rev=0,m,i;		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n =ip.nextInt();
		m=n;
                while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(m==rev)
		{ 
			System.out.println("Given number is palindrome");	
		}
		else
		{
			
			System.out.println("Given number is not palindrome");
		}
	}
}

