
public class Fan {
	private int speed;
	private boolean fanStatus = false;
	private double radius = 5;
	private String color  = "blue";
	String power;

	public Fan()
	{
		speed = 10;
		fanStatus = true;
		radius = 10;
		color = "red";
	}
	
	public Fan(int speed, boolean fanStatus, double radius, String color)
	{
		this.speed = speed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.color = color;
	}
	
	public String toString()
	{
		if(fanStatus == false)
			power = "off";
		else 
			power = "on";
		return speed+ " " +color+ " " +radius+ " " +power;
	}
}
