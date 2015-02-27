import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args)
	{
		Circle c = new Circle();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		c.radius = scan.nextDouble();
		
		System.out.println("The diameter is: "+c.getDiameter());
		System.out.println("The area is: "+c.getArea());
		System.out.println("The circumference is: "+c.getCircumference());
	}

}
