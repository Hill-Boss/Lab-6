/**************************************************************************************************
 * 
 * @author Cody Hill-Boss
 * @file Movement.java
 * 
 * @porpose Movement of the player
 * @startdate Mar 7, 2018
 * 
 * 
 *************************************************************************************************/

package P2Characters;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import Main.Panels;

public class Movement implements ActionListener, KeyListener {

	static int X;
	static int Y;
	
	public Movement() {
		System.out.println("I am Movement of " + this.toString());
	}

	public Graphics2D RotateImg(ImageIcon Char, int Direction) {
		Image image = Char.getImage();
		Graphics2D g = (Graphics2D) image.getGraphics();
		g.rotate(Direction);
		return g;
	}
	

	// Collision Detection
	private boolean areRectsColliding(int r1TopLeftX, int r1BottomRightX, int r1TopLeftY, int r1BottomRightY,
			int r2TopLeftX, int r2BottomRightX, int r2TopLeftY, int r2BottomRightY) {
		if (r1TopLeftX < r2BottomRightX && r1BottomRightX > r2TopLeftX && r1TopLeftY < r2BottomRightY
				&& r1BottomRightY > r2TopLeftY) {
			return true;
		} else {
			return false;
		}
	}

	// Key stuff
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}