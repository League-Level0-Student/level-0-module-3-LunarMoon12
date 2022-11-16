package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Choose_Your_Own_Adventure {

	public static void main(String args[]) {

		String quest_1 = JOptionPane.showInputDialog("Red or Blue?");
		{
			if (quest_1.equals("Red")) {
				String quest_2 = JOptionPane.showInputDialog("Fire or Ice?");

				if (quest_2.equals("Fire")) {
					JOptionPane.showMessageDialog(null, "You're favorite food is chilli!");
				}
				if (quest_2.equals("Ice")) {
					JOptionPane.showMessageDialog(null, "You're favorite food is sushi!");
				}

			}
		}
		if (quest_1.equals("Blue")) {
			String quest_3 = JOptionPane.showInputDialog("Sunny or Thunderstorm?");

			if (quest_3.equals("Sunny")) {
				JOptionPane.showMessageDialog(null, "You're favorite food is pizza!");
			}
			if (quest_3.equals("Thunderstorm")) {
			JOptionPane.showMessageDialog(null,"You're favorite food is ice cream!");
			}
		}
	}
}
