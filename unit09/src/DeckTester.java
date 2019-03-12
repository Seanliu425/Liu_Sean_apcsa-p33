/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck myDeck = new Deck(new String[] {"1", "3", "5"}, 
				new String[] {"spades", "hearts"}, 
				new int[] {1, 6, 7});
		System.out.println(myDeck);
		myDeck.shuffle();
		System.out.println(myDeck);
		
		Deck deckTwo = new Deck(new String[] {"Jack", "Queen", "King"},
				new String[] {"diamonds", "spades", "clubs"},
				new int[] {11, 12, 13});
		System.out.println(deckTwo);
		deckTwo.deal();
		deckTwo.deal();
		System.out.println(deckTwo);
		
		int temp = myDeck.size();
		for (int i = 0; i < temp; i++) {
			myDeck.deal();
		}
		System.out.println(myDeck);
	}
}