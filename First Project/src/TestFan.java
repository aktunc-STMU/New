import java.util.Scanner;

public class TestFan {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int speed;
		boolean fanStatus;
		double radius;
		String color;
		
		System.out.println("Enter the fan speed: ");
		speed = scan.nextInt();
		System.out.println("Enter the radius: ");
		radius = scan.nextDouble();
		System.out.println("Enter the fan status: ");
		fanStatus = scan.nextBoolean();
		System.out.println("Enter the color of the fan: ");
		color = scan.nextLine();
		
		Fan f1 = new Fan(speed, fanStatus, radius, color);
		System.out.println(f1.toString());
		
	}

}
