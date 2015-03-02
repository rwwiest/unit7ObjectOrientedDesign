/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        
        Deck deck1 = new Deck(new String[]{"A", "B","C"}, new String[]{"Giraffes", "Lions"}, new int[]{2,1,6});
        Deck deck2 = new Deck(new String[]{"D", "E","F"}, new String[]{"Cat", "Dog"}, new int[]{1,2,3});
        Deck deck3 = new Deck(new String[]{"G", "H","I"}, new String[]{"Riley", "Zach","Mr. Schmit"}, new int[]{12,13,16});
        System.out.println(deck1.isEmpty());
        System.out.println(deck2.size());
        System.out.println(deck3.size());
        deck3.deal();
        System.out.println(deck3.size());
    }
}
