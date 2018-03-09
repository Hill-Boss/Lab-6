/**************************************************************************************************
 * 
 * @author Cody Hill-Boss
 * @file Food.java
 * 
 * @porpose Food for Game
 * @startdate Mar 9, 2018
 * 
 * 
 *************************************************************************************************/
package P2Characters;

import java.awt.Image;

import javax.swing.ImageIcon;

import P1Game.Game;

public class Food {
	
	public static ImageIcon Food = new ImageIcon("./src/Resources/Food.png"); 
	public static Image FImage = Food.getImage().getScaledInstance(Game.imgSize, Game.imgSize, Image.SCALE_DEFAULT);
	
	public Food() {
		System.out.println("I am FOOD");
		Food.setImage(FImage);
		
		
		
	}
}
