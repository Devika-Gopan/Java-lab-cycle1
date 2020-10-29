import java.util.*;
public class javaprime
{
	public static void main(String[] args)	
	{
		int i;
		boolean flag=false;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=ip.nextInt();
		for(i=2;i<n/2;++i)
		{
			if(n%i==0)
			{
				flag=true;
				break;	
			}
		}
		if(!flag)
		{
			System.out.println("Given is number prime ");
		}
		else
		{
			System.out.println("Given number is not prime");
		}


	}
}
