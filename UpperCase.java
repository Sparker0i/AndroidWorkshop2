import java.util.Scanner;

public class UpperCase
{
	public static void main(String args[])
	{
		String userInput;
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n Enter a string ");
		userInput=scanner.next();
		System.out.println("\n"+userInput.toUpperCase());

	}
}
