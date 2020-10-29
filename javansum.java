import java.util.*;
public class javansum
{
	public static void main(String args[])		
	{
		int i,s=0;		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n =ip.nextInt();
		for(i=1;i<=n;i++)
		{ 
			s=s+i;
		}
		System.out.println("Sum  = "+s);
	}
}
