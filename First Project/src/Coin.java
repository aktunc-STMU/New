import java.util.Random;

public class Coin {
	private String sideUp = "";
	public Coin()
	{
		toss();
	}
	public void toss()
	{
		Random rand = new Random();
		int value = rand.nextInt(2);
		
		if(value==0)
			this.sideUp = "Heads";
		else
			this.sideUp = "Tails";
	}
	public String getSideUp()
	{
		return sideUp;
	}
}
