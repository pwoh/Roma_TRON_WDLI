
public class Player {
	private final int firstGold = 0;
	private final int firstVP = 10;
	
	int gold;
	int VP;
	// List hand;
	// index to be used as dice number
	// Card [] laidCards;
	// getVP()
	
	public Player () {
		this.gold = firstGold;
		this.VP = firstVP;
		// to be tested
		//this.laidCards[];
	}
	
	int getGold () {
		return (this.gold);
	}
	
	int getVP () {
		return (this.VP);
	}
	
	
}