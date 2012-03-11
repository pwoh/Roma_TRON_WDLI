
public class FirstTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Initialise test:");
		System.out.println ("Create new game:");
		Game Roma = new Game ();
		System.out.println ("Assert players have right values:");
		assert (Roma.red.getVP() == 10);
		assert (Roma.blue.getGold() == 0);
		System.out.println ("Assert bank has right values:");
		assert (Roma.romaBank.getGold() == 100);
		assert (Roma.romaBank.getVP() == 100);
		System.out.println ("All tests passed! You are awesome! Go team Brock's Eyes!");

	}

}
