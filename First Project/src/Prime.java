import java.util.Scanner;

public class Prime {
	public static void main(String[] args)
	{
		int n, count = 0, status = 1, num = 2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number. The system will find the prime numbers smaller than this number");
		n = scan.nextInt();
		System.out.println("These are the prime numbers smaller than " +n+ ":\n");
		for(int h = 1; h < n;)
		{
			for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
			{
				if (num%j == 0)
				{
					status = 0;
					break;
				}
			}
			if (status != 0)
			{
				System.out.print(num+ "  ");
				count++;
			}
			status = 1;
			num++;
			if(n < num)
				break;
		}
		System.out.print("\n\nThere are a total of "+count+" prime numbers");
	}

}
