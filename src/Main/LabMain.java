/**************************************************************************************************
 * 
 * @author Cody Hill-Boss
 * @file Main.java
 * 
 * @porpose Main JFrame
 * @startdate Mar 7, 2018
 * 
 * 
 *************************************************************************************************/

// JFrame

package Main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;


public class LabMain {

	public final static int WIDTH = 1000;
	public final static int HEIGHT = 650;

	public static JFrame GameFrame;
	
	public static void main(String[] args) {

		GameFrame = new JFrame("Lab 6 Game");

		GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameFrame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		// add main panel
		Panels MainP = new Panels();
		MainP.setBackground(Color.BLACK);
		GameFrame.getContentPane().add(MainP);
		GameFrame.pack();
		GameFrame.setVisible(true);

	}

}
