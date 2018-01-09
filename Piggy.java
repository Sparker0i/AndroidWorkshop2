import java.util.Scanner;
import java.util.Arrays;
public class Piggy

{	
	public static void main(String args[]) 
	{	
		
		Scanner scanner = new Scanner(System.in);
		int t=scanner.nextInt();
		for(int i=0;i<t;i++)
		{
			
			int z,e,f,n,a=0,amt,N,small,k,j,ele,sam;
			int []p = new int[500];
			int []w = new int[500];
			int []p1= new int[500];
			int []w1= new int[500];
			e=scanner.nextInt();
			f=scanner.nextInt();
			N=scanner.nextInt();
			
			for(j=0;j<N;j++)
			{
				p[j]=scanner.nextInt();			
				w[j]=scanner.nextInt();
				
			}
				
			
			k=0;
			for(j=0;j<N;j++)
			{	
								
				if(a%w[j]==0)				
				{	w1[k]=a/w[j];
					p1[k]=p[j];										
					k++;
					System.out.println("w[j]="+w1[k-1]+"k="+k);
				}		
						
			}			
			for(j=0;j<k;j++)
			{
				p1[k]=p1[k]*w1[k];
			}
		
			Arrays.sort(p1);
			
			//if(amt<0)
			//amt*=-1;
	
			System.out.println("\namt ="+p1[0]);
		
		}
			
	}
}			
