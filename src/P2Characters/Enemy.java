package P2Characters;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import Main.Panels;
import P1Game.Game;

public class Enemy {

	// Postions [0]=X [1]=Y
	int[] EXY = new int[2];
	
	// Image and resizes
	 
	
	public static ImageIcon Enemy = new ImageIcon("./src/Resources/Enemy.png");
	public static Image PImage = Enemy.getImage().getScaledInstance(Game.imgSize, Game.imgSize, Image.SCALE_DEFAULT);
	
	public Enemy() {
		System.out.println("I am the ENEMY");
		// paint player
		Movement En = new Movement();
	}
}
