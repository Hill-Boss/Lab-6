/**************************************************************************************************
 * 
 * @author Cody Hill-Boss
 * @file Game.java
 * 
 * @porpose Game Stuff
 * @startdate Mar 8, 2018
 * 
 * 
 *************************************************************************************************/

package P1Game;

import Main.Panels;
import P2Characters.Enemy;
import P2Characters.Food;
import P2Characters.Movement;
import P2Characters.Player;

@SuppressWarnings("serial")
public class Game{

	int Score, Level;
	static int[] TopScores = new int[2];
	static String[] TopNames = new String[2];
	public static int imgSize = 10;
	
	
	public Game(int Level) {
		this.Level = Level;
		System.out.println("I am the GAME");
		Player P = new Player();
		Enemy E = new Enemy();
	}
	
	public void Level() {
		Food F = new Food();
		
	}
	
	private void LoseGame() {
		Panels.InfoLabel.setText(ToptoString());
	}
	
	public void setScore() {
		Score++;
		Panels.InfoLabel.setText("<html><body><br>Score: "+ Score +"</body></html>");
		
	}
	
	private void setTopScore() {
		if (Score >= TopScores[0]) {
			TopScores[2] = TopScores[1];
			TopScores[1] = TopScores[0];
			TopScores[0] = Score;
			TopNames[0] = Panels.Name;
		} else if (Score >= TopScores[1]) {
			TopScores[2] = TopScores[1];
			TopScores[1] = Score;
			TopNames[1] = Panels.Name;
		} else if (Score >= TopScores[2]) {
			TopScores[2] = Score;
			TopNames[2] = Panels.Name;
		} 
	}
	public String ToptoString() {
		return "<html><body>" + Panels.Name + " Scored: " + Score + "<br> High Scores <br>" + TopNames[0] + "</body></html>";
	}

	
	
}
