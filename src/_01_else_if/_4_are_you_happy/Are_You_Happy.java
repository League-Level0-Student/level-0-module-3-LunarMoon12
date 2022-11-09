package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {

	public static void main(String args[]) {

		String question = JOptionPane.showInputDialog("Are you happy?");
		if (question.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		}
		if (question.equals("No")) {
			String question2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if (question2.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			if (question2.equals("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
			}
		}
	}
}
