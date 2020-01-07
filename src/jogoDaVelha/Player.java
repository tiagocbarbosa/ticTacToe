package jogoDaVelha;

/**
 * 
 * @author Tiago Barbosa, https://github.com/tiagocbarbosa
 *
 */
public class Player {

	private Score score;
	private boolean playerTurn;
	
	public Player() {
		score = new Score();
		playerTurn = false;
	}
	
	public int getScore() {
		return score.getScore();
	}
	
	public void scored() {
		score.increaseScore();
	}
	
	public void setPlayerTurn(boolean turn) {
		playerTurn = turn;
	}
	
	public boolean isPlayerTurn() {
		return playerTurn;
	}
	
	public void restartScore() {
		score.restartScore();
	}
	
}
