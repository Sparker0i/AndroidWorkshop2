import java.util.Scanner;
import java.lang.Math;

public class armstrong
{
	public static void main(String args[])
	{
		int integer,a,i,z;
		double sum=0;		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Enter the no.:  ");
		integer=scanner.nextInt();
		z=integer;		
		while(integer>0)
		{
			a=integer%10;
			sum=sum+Math.pow(a,3);
			integer=integer/10;
		}
			
		if(z==sum)
			System.out.print("armstrong");
		else
			System.out.print("Not armstrong");	

	}
}	
