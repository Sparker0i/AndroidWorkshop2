import java.util.Scanner;

public class Input
{
	public static void main(String args[])
	{
		int userInput;
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n > Enter an integer :: ");
		userInput = scanner.nextInt();
		System.out.println("You just entered "+userInput);
	}
}
