import java.util.Scanner;

public class fibonacci
{
	

	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);		
		int n,a=0,b=1,c,i;
		System.out.println("Enter the no.: ");
		n=scanner.nextInt();
		
		if(n==1)
		{	
			System.out.print("0");
			System.exit(0);
		}
			
		
		if(n==2)
		{	
			System.out.print("0,1");		
			System.exit(0);		
		}
		
		
		if(n>2)
			System.out.print("0,1");
					
		

		for(i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.print(","+c);			
			a=b;
			b=c;
		}
	


	}
}


