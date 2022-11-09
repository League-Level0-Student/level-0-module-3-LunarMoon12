
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(5);

		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response
			String guess = JOptionPane.showInputDialog("Guess the number!");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int int_guess = (Integer.parseInt(guess));
			// 5. if the guess is correct
			if (int_guess == random) {
				// 6. Win
				JOptionPane.showMessageDialog(null, "You're correct! You win!");

				// 12. Use "System.exit(0);" to quit the game if the user guessed the right
				// answer.
				System.exit(0);
			}
			// 7. if the guess is high
			if (int_guess > random) {
				// 8. Tell them it's too high
				JOptionPane.showMessageDialog(null, "Your guess is too high. Try again.");
			}

			// 9. if the guess is low
			if (int_guess < random) {
				// 10. Tell them it's too low
				JOptionPane.showMessageDialog(null, "Your guess is too low. Try again.");
			}

			// 13. Tell them they lose
			if (int_guess < random) {
				JOptionPane.showMessageDialog(null, "You lose!");
			}
			if (int_guess > random) {
				JOptionPane.showMessageDialog(null, "You lose!");
			}
		}

	}
}
