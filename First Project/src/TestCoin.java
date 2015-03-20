
public class TestCoin {
	public static void main(String[] args)
	{
		int hCount=0, tCount=0;
		Coin c1 = new Coin();
		for(int i = 0; i < 20; i++)
		{
			c1.toss();
			System.out.println("Toss: "+c1.getSideUp());
			if(c1.getSideUp() == "Heads")
				hCount++;
			else
				tCount++;
		}
		System.out.println("Heads facing up: "+hCount+" times");
		System.out.println("Tails facing up: "+tCount+" times");
	}

}
