package jogoDaVelha;

/**
 * 
 * @author Tiago Barbosa, https://github.com/tiagocbarbosa
 *
 */
public class Turn {

	private Player playerOne;
	private Player playerTwo;
	private int[][] gameScore;

	public Turn(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		playerOne.setPlayerTurn(true); // Setting player's turn
		gameScore = new int[3][3];
		gameStarted();
	}

	public Player getPlayerTurn() {
		if(playerOne.isPlayerTurn())
			return playerOne;
		return playerTwo;
	}

	public String getPlayerTurnString() {
		if(playerOne.isPlayerTurn())
			return "Player 1 Turn";
		return "Player 2 Turn";
	}
	
	public String getPlayerTurnStringShort() {
		if(playerOne.isPlayerTurn())
			return "Player 1";
		return "Player 2";
	}

	public void nextTurn() {
		if(playerOne.isPlayerTurn()) {
			playerOne.setPlayerTurn(false);
			playerTwo.setPlayerTurn(true);
		} else {
			playerOne.setPlayerTurn(true);
			playerTwo.setPlayerTurn(false);
		}
	}

	public void restartGame() {
		playerOne.restartScore();
		playerTwo.restartScore();
		playerOne.setPlayerTurn(true);
		playerTwo.setPlayerTurn(false);
		gameStarted();
	}

	public void gameStarted() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				gameScore[i][j] = 0;
			}
		}
	}
	
	public void nextGame() {
		playerOne.setPlayerTurn(true);
		playerTwo.setPlayerTurn(false);
		gameStarted();
	}

	public void buttonPressed(int i, int j) {
		Player player = getPlayerTurn();
		if(player.equals(playerOne)) {
			gameScore[i][j] = 1;
		} else {
			gameScore[i][j] = 2;
		}
	}

	// The button is pressed when value is equal to '1'
	public boolean isButtonPressed(int i, int j) {
		if(gameScore[i][j] != 0)
			return true;
		return false;
	}

	// I got lazy and this is how I'm going to check the score :(
	public boolean isGameFinished() {
		int result;

		// First row
		result = 1;
		for(int i = 0; i < 3; i++) {
			result *= gameScore[0][i];
		} if(result == 1 || result == 8) {
			return true;
		}

		// Second row
		result = 1;
		for(int i = 0; i < 3; i++) {
			result *= gameScore[1][i];
		} if(result == 1 || result == 8) {
			return true;
		}

		// Third row
		result = 1;
		for(int i = 0; i < 3; i++) {
			result *= gameScore[2][i];
		} if(result == 1 || result == 8) {
			return true;
		}

		// First column
		result = 1;
		for(int i = 0; i < 3; i++) {
			result *= gameScore[i][0];
		} if(result == 1 || result == 8) {
			return true;
		}

		// Second column
		result = 1;
		for(int i = 0; i < 3; i++) {
			result *= gameScore[i][1];
		} if(result == 1 || result == 8) {
			return true;
		}

		// Third column
		result = 1;
		for(int i = 0; i < 3; i++) {
			result *= gameScore[i][2];
		} if(result == 1 || result == 8) {
			return true;
		}

		// First diagonal
		result = 1;
		for(int i = 0; i < 3; i++) {
			result *= gameScore[i][i];
		} if(result == 1 || result == 8) {
			return true;
		}

		// Second diagonal
		result = 1;
		int j = 2;
		for(int i = 0; i < 3; i++) {
			result *= gameScore[i][j];
			j--;
		} if(result == 1 || result == 8) {
			return true;
		}

		return false;
	}

}
