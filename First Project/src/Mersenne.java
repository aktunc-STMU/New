import java.util.Scanner;

public class Mersenne {
	public static void main(String[] args)
	{
		int n, count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number. The system will find the Mersenne prime numbers smaller than this number");
		n = scan.nextInt();
		System.out.println("These are the Mersenne prime numbers smaller than " +n+ ":\n");
		for(int h = 2; h < n;h++)
		{
				int mersenne = (int) (Math.pow(2, h))-1;
				if(mersenne>n)
					break;
				for(int j = 2; j < Math.sqrt(mersenne); j++)
				{
					if(mersenne%j==0)
						break;
					System.out.println(mersenne+ "  ");
					count++;
				}
				
				
				
			
		}
		System.out.println("\n\nThere are a total of "+count+" Mersenne prime numbers");
	}
}
