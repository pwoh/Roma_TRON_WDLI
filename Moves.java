
public class Moves {
	
	// phase 1
	// access player array
	// for each player access laidCards array and check for empty 
	// dice discs, adding them up
	// minus that amount of VP from the player's pile
	// and add to bank

	// write separate function for minus VP so we never forget to 
	// add to bank
	
	// phase 2
	// condition is that game not over
	
	// don't know how to reference Game.java to access array, so here:
	/*private final int maxPlayers = 2;
	
	public Moves (Game g) {
		
		
	}*/
	
	int diceRoll () {
		int roll = 1;
		return roll;
	}
	/*
	boolean gameOverCheck () {
		boolean gameOver = false;
		int playerNum;
		Player potentialWinner;
		// for (playerNum = 0; playerNum < maxPlayers; playerNum++){
			if ((potentialWinner == null) ||
					(red.getVP() > potentialWinner.getVP())){
				potentialWinner = this.players[playerNum];
			}
			if (players[playerNum].getVP() == 0) {
				gameOver = true;
			}
		}

		if (bank.getVP() <= 0) {
			gameOver = true;
		}
		return gameOver;
	}*/
	// phase 3
	// condition is that game not over, still have gold, still have
	// action dice and haven't said end
	
}
