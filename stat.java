import java.util.Scanner;
import java.util.Arrays;
class stat
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int i,j,k,n;	
		float avg,sum;		
		int[] a,r;
		
			
		int t=scanner.nextInt();
		for(i=0;i<t;i++)
		{	
			sum=0;
			n=scanner.nextInt();
			a = new int[n];
			k=scanner.nextInt();
			for(j=0;j<n;j++)
				a[j]=scanner.nextInt();
				
			Arrays.sort(a);
			
			
			for(j=k;j<n-k;j++)
				sum+=a[j];
	

			
			avg=sum/(n-2*k);
			System.out.println(avg);

				/*for(j=0;j<k;j++)
				a[j]=null;


			for(j=0;j<k;j++)
				{
					a[m]=null;
					m--;
				}

			for(j=0;j<n;j++)
				if(a[j]!=null)
					sum+=a[j];	*/
	
	
					
		}
		

	

	}

}
