import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random randomGenerator = new Random();
		int randNum = randomGenerator.nextInt(100) + 1;
		
		System.out.println("Enter a number between 1 and 100");
		int num = scan.nextInt();
		while(num != randNum)
		{
			if(num > randNum)
			{
				System.out.println("Guess lower");
				num = scan.nextInt();
			}
			else
			{
				System.out.println("Guess higher");
				num = scan.nextInt();
			}
		}
			System.out.println("You guessed it right");	
	}

}
