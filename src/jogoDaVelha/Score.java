package jogoDaVelha;

/**
 * 
 * @author Tiago Barbosa, https://github.com/tiagocbarbosa
 *
 */
public class Score {

	private int score;
	
	public Score() {
		score = 0;
	}
	
	public int getScore() {
		return score;
	}
	
	public void increaseScore() {
		score += 1;
	}
	
	public void restartScore() {
		score = 0;
	}
	
}
