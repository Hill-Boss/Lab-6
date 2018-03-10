/**************************************************************************************************
 * 
 * @author Cody Hill-Boss
 * @file Panels.java
 * 
 * @porpose Add panels and info to LabMain
 * @startdate Mar 7, 2018
 * 
 * 
 *************************************************************************************************/


package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import P1Game.Game;
import P2Characters.Movement;

@SuppressWarnings("serial")
public class Panels extends JPanel {

	private JPanel Main, PSouth, PNorth, PCenter;
	
	// Public and static to allow for paintComponent and Score value/ top scores after game over
	public static JPanel GamePanel;
	public static JLabel InfoLabel;
	
	private JTextField NameGetter;
	private JButton StartButton;

	private Dimension DefaultSize;	
	
	// All the Formatting
	public Panels() {

		DefaultSize = new Dimension(900, 600);
		setPreferredSize(DefaultSize);
		Font FontA = new Font("Arial", Font.BOLD, 20);
		Main = new JPanel();
		Main.setLayout(new BorderLayout());
		Main.setPreferredSize(DefaultSize);

		PNorth = new JPanel();
		PNorth.setPreferredSize(new Dimension(900, 100));
		PSouth = new JPanel();
		PSouth.setPreferredSize(new Dimension(900, 100));
		PCenter = new JPanel();
		PCenter.setBackground(Color.lightGray);
		GamePanel = new JPanel();
		GamePanel.setPreferredSize(new Dimension(375, 375));
		GamePanel.setVisible(false);
		GamePanel.addKeyListener(new Movement());
		GamePanel.setFocusable(true);
		GamePanel.setFocusTraversalKeysEnabled(false);
		PCenter.add(GamePanel);
		
		// Info
		InfoLabel = new JLabel("<html><body><br> Eat as much as you can.<br> use WASD </body></html>");
		InfoLabel.setFont(FontA);
		PNorth.add(InfoLabel);
		
		NameGetter = new JTextField("Enter Name");
		NameGetter.setPreferredSize(new Dimension(200, 30));
		NameGetter.setFont(FontA);
		PCenter.add(NameGetter);
		
		StartButton = new JButton("Start");
		StartButton.setPreferredSize(new Dimension(200, 75));
		StartButton.addActionListener(new Button());
		PSouth.add(StartButton);
		
		// Main.add(Stuff);
		Main.add(PNorth, BorderLayout.NORTH);
		Main.add(PSouth, BorderLayout.SOUTH);
		Main.add(PCenter, BorderLayout.CENTER);
		add(Main);

	}
	
	public void paintComponent(Graphics2D g, int x, int y) {
		ImageIcon Img = new ImageIcon();
		super.paintComponent(g);
		Img.paintIcon(GamePanel, g, x, y);
	}
	
	// Name of player
	public static String Name;
	
	private class Button implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent b) {
			StartButton.setVisible(false);
			InfoLabel.setText("<html><body><br>Score: 0</body></html>");
			Name = NameGetter.getText();
			NameGetter.setVisible(false);
			GamePanel.setVisible(true);
			System.out.println(Name);
			@SuppressWarnings("unused")
			Game GetFood = new Game(1);
			
		}
		
	}
}

/** Different Way **/

//// Laypout stuff
//private static int Size = 25;
//// 25 by 25 grid of square labels;
//public static JLabel[][] Squares = new JLabel[Size][Size];

// IN MAIN
//GamePanel.setLayout(new GridLayout(Size, Size));
//GridLayout Grid = new GridLayout(50,50);
//GamePanel.setLayout(Grid);


//KeyListener Keys = new KeyHandle();
//contents.addKeyListener(Keys);

//// Set all squares to be JLabels
//for (int i = 0; i < Size; i++) {
//	for (int j = 0; j < Size; j++) {
//								// i + "," + j just looks like 3 dots lol
//		Squares[i][j] = new JLabel(i + "," + j);
//		GamePanel.add(Squares[i][j]);
//	}
//}
//Player.setImage(PImage);
//Food.setImage(FImage);
//Enemy.setImage(EImage);
//
//Squares[Prow][Pcol].setIcon(Player);
//Squares[Frow][Fcol].setIcon(Food);
//Squares[Erow][Ecol].setIcon(Enemy);
