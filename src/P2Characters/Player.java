/**************************************************************************************************
 * 
 * @author Cody Hill-Boss
 * @file Player.java
 * 
 * @porpose "what is the purpose of this file"
 * @startdate Mar 8, 2018
 * 
 * 
 *************************************************************************************************/

package P2Characters;

import java.awt.Image;

import javax.swing.ImageIcon;

import Main.Panels;
import P1Game.Game;

public class Player {
	
	public static boolean isAlive = true;
	
	// Player Pos 1D int array 2 spots [0] = X [1] = Y
	public static int[] PXY = new int[2];
	
	// Image Stuff
	public static ImageIcon Player = new ImageIcon("./src/Resources/Player.png");
	public static Image PImage = Player.getImage().getScaledInstance(Game.imgSize, Game.imgSize, Image.SCALE_DEFAULT);
		
	public Player() {
		System.out.println("I am the PLAYER");
		
		// set default postion
		PXY[0] = Panels.GamePanel.getWidth()/2;
		PXY[1] = Panels.GamePanel.getHeight()/2;
		Movement En = new Movement();
	}	
}
