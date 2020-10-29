import java.util.*;
public class javaoddeven
{
	public static void main(String args[])		
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number  :");
		int num =ip.nextInt();
		if(num%2==0)
		{ 
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number is odd");
		}
	}
}
