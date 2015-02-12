import java.util.Scanner; 


public class CompareNumbers {
	public static void main(String[] args)
	{
		int one;
		int two;
		int three;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		one = in.nextInt();
		System.out.print("Enter second integer: ");
		two = in.nextInt();
		System.out.print("Enter third integer: ");
		three = in.nextInt();
		System.out.println("For the numbers "+one+", "+two+", and "+three);
		
		if(one>two && one>three)
			System.out.println("Largest is " +one);
		else if(two>one && two>three)
			System.out.println("Largest is " +two);
		else
			System.out.println("Largest is " +three);
		
		if(one<two && one<three)
			System.out.println("Smallest is " +one);
		else if(two<one && two<three)
			System.out.println("Smallest is " +two);
		else
			System.out.println("Smallest is " +three);
		
		int sum = one + two + three;
		int product = one * two * three;
		int average = sum / 3;
		System.out.println("Sum is " +sum);
		System.out.println("Product is " +product);
		System.out.println("Average is " +average);
	}

}
