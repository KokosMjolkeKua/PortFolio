import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        createDeck();
        shuffle();
    }

    //Creating the deck using two four loops, making a deck of 52 cards, each with a value
    private void createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};

        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    //Finally found a shuffle, i need to learn more about java..
    public void shuffle() {
        Collections.shuffle(cards);
    }

    //in the game blackJack you remove a card before dealing the first cards
    //im not good at the game but i think it is to prevent cardcounting..
    public Card dealCard() {
        return cards.remove(0);
    }
}
