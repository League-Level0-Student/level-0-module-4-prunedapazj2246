package _05_change_calculator;

import javax.swing.JOptionPane;

public class testScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String testScore = JOptionPane.showInputDialog("What was your test score?");
double tScore = Double.parseDouble(testScore);
if(tScore<=65) {
	JOptionPane.showMessageDialog(null, "You did Horrible!!");
}
else if(tScore>=90) {
	JOptionPane.showMessageDialog(null, "You did Amazing!!");	
}
else {
	JOptionPane.showMessageDialog(null, "You did Good!!");	
}
	}

}
