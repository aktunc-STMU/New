import java.util.Scanner;

public class TestPet {
	public static void main(String[] args)
	{
		Pet p = new Pet();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the pet's name: ");
		p.name = scan.nextLine();
		System.out.print("Enter the pet's type: ");
		p.type = scan.nextLine();
		System.out.print("Enter the pet's age: ");
		p.age = scan.nextInt();
		
		System.out.println("\nThe name of the pet is " +p.getName()+ ".");
		System.out.println("The pet is a " +p.getType()+ ".");
		System.out.println("The pet is "+p.getAge()+" years old.");	
	}
	

}
