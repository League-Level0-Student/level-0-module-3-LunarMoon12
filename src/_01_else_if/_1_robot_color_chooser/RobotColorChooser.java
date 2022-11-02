
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);
		while(true) {
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for(int i = 0; i < 10;i++) {
			rob.move(50);
		rob.turn(50);
		}
		//3. Set the pen width to 10
		rob.setPenWidth(50);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color do you want?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("Red")) {
			rob.setPenColor(255, 0, 0);	
		}
			if (color.equals("Green")) {
				rob.setPenColor(0,255,0);
			}
		if (color.equals("Blue")) {
		rob.setPenColor(0,0,255);
		}
		
        //6. If the user doesn't enter anything, choose a random color
		if(color.equals("exit")) {
			break;
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		


		}
	}
}
