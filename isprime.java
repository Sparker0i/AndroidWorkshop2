import java.util.Scanner;

public class isprime
{
	public static void main(String args[])
	{
		int n;
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Enter a number ");
		n=scanner.nextInt();
		System.out.print(isprime(n));
		
	}	
	

	public static boolean isprime(int number)
	{
		int i,flag=0;
		for(i=2;i<=(number/2);i++)
		{
			if((number%i)==0)
				flag=1;
		
		}	
		
		if(flag==0)
			return true;
		
			
		return false;
	
	}	
}
