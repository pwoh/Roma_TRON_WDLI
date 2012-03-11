
public class Game {
	// players[]
	// bank
	
	Player red;
	Player blue;
	Bank romaBank;
	
	public Game () {
		red = new Player();
		blue = new Player();
		romaBank = new Bank();
		Player [] players;
		players = new Player[2];
		
		players[0] = red;
		players[1] = blue;
		
	}
	
		
}
