
public class FindPi {
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		double pi = 3.1415922535897423;
		double summation = 0;
		double number = 0;
		int iteration = 0;
		for(double n = 0; 4*summation != pi ; n++)
		{
			number = Math.pow(-1, n)/(2*n + 1);
			summation += number;
			iteration++;
		}
		summation = 4*summation;
		
		System.out.println("PI="+summation+" after "+iteration+" iterations");
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		
		System.out.println("The program took " +totalTime+ " milliseconds");
	}
}
