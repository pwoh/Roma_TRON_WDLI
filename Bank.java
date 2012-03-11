
public class Bank {
	public final int totalGold = 100;
	public final int totalVP = 100;
	int gold;
	int VP;
	// List discardDeck;
	// Card [] deck;
	
	public Bank () {
		this.gold = totalGold;
		this.VP = totalVP;
	}
	
	int getGold () {
		return (this.gold);
	}
	
	int getVP () {
		return (this.VP);
	}
	
}
