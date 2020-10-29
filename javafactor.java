import java.util.*;
public class javafactor
{
	public static void main(String args[])		
	{
		int i,f=1;		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n =ip.nextInt();
                System.out.println("Factors of "+n);
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{ 
				System.out.println(i);	
			}
		}
	}
}
