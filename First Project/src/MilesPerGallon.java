import java.util.Scanner;

public class MilesPerGallon {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double miles;
		double gallons;
		
		System.out.print("Enter the miles driven:");
		miles = scan.nextInt();
		System.out.println("Enter the gallons of fuel used:");
		gallons = scan.nextInt();
		
		double mpg = miles / gallons;
		
		System.out.println("The miles-per-gallon is: " +mpg);
		
	}

}
