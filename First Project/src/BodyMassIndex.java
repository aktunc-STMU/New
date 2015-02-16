import javax.swing.JOptionPane;


public class BodyMassIndex {
	public static void main(String[] args)
	{
		
		
		double height;
		double weight;
		
		
		String h = JOptionPane.showInputDialog("What is your height?");
		height = Double.parseDouble(h);
		String w = JOptionPane.showInputDialog("What is your weight?");
		weight = Double.parseDouble(w);
		weight *= .453592;
		height *= .0254;
		
		double BMI = weight / (height*height);
		JOptionPane.showMessageDialog(null,"Your BMI is " +BMI);
	}

}
