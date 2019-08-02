package _06_test_scores;

import javax.swing.JOptionPane;

public class testScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ts = JOptionPane.showInputDialog("what was your test score?");
double TS = Double.parseDouble(ts);

if(TS <= 65) {
	JOptionPane.showMessageDialog(null, "You did Horible!!");
}
else if(TS >= 90) {
	JOptionPane.showMessageDialog(null, "You did Amazing!!");
}
else {
	JOptionPane.showMessageDialog(null, "You did Good!!");
}
	}

}
