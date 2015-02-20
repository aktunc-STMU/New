import java.util.Scanner;

public class Mersenne {
	public static void main(String[] args)
	{
		int n, count = 0, num = 3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number. The system will find the Mersenne prime numbers smaller than this number");
		n = scan.nextInt();
		System.out.println("These are the Mersenne prime numbers smaller than " +n+ ":\n");
		for(int h = 1; h < n;)
		{
			for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
			{
				if (num%j == 0)
				{
					break;
				}
			
				int mersenne = (int)(Math.pow(2, j))-1;
				if(mersenne == num)
				{
					System.out.println(num+ "  ");
					count++;
				}
				num++;
			
			}
			if(n < num)
				break;
		}
		System.out.println("\n\nThere are a total of "+count+" Mersenne prime numbers");
	}
}
