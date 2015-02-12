import java.util.Scanner;
import java.util.Random;

public class PaperRockScissors {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int choice;
		
		System.out.print("Choose to play with Scissors (0), Rock (1), or Paper (2)");
		choice = in.nextInt();
		
		Random randomGenerator = new Random();
		int randNum = randomGenerator.nextInt(3);
		
		if(choice==0 && randNum==1)
			System.out.println("You lose!");
		else if(choice==1 && randNum==2)
			System.out.println("You lose!");
		else if(choice==2 && randNum==0)
			System.out.println("You lose!");
		else if(choice==1 && randNum==0)
			System.out.println("You win!");
		else if(choice==2 && randNum==1)
			System.out.println("You win!");
		else if(choice==0 && randNum==2)
			System.out.println("You win!");
		else
			System.out.println("Tie!");
	}

}
