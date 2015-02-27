
public class Circle {
		double radius;
		final double PI = 3.14159;
		
		public double getRadius()
		{
			return radius;
		}
		
		public double getArea()
		{
			double area = PI*radius*radius;
			return area;
		}
		
		public double getDiameter()
		{
			double diameter = 2*radius;
			return diameter;
		}

		public double getCircumference()
		{
			double circumference= 2*PI*radius;
			return circumference;
		}
}
