import java.util.*;

public class wordnum
{
	




	public static void main(String args[])
	{
				
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no.: ");		
		n = scanner.nextInt();
		System.out.println(wordify(n)+" ");
	}

	




	public static String wordify(long digit)
	{


String primitive_word[]=						{"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
"eighteen","nineteen"};

String tens_word[] = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

String super_word[] = {"","","hundred","thousand","","lakh","","crore"};

	


		if(digit<10000000)
		{
			int level = Long.toString(digit).length();
		
			if(level>3&&level<8&&level%2!=0)
				level--;
	
			if(digit<20)
				return primitive_word[(int)digit];
		
			else if(digit<100)
				return tens_word[(int)digit/10]+wordify(digit%10);
			
			else
				return wordify(digit/(long)Math.pow(10,--level)) +super_word[level] +wordify(digit%(long)Math.pow(10,level));
		}	
			else
				return wordify(digit/(long)Math.pow(10,7)) +super_word[7] +wordify(digit%(long)Math.pow(10,7));


	}
}
