import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getValue() {
        int total = 0;
        int aces = 0;

        //Adding value to every card
        for (Card card : cards) {
            switch (card.getValue()) {
                case "JACK":
                case "QUEEN":
                case "KING":
                    total += 10;
                    break;
                case "ACE":
                    total += 11;
                    aces++;
                    break;
                default:
                    total += Integer.parseInt(card.getValue());
            }
        }

        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }

        return total;
    }

    //showHand
    //thinking of maybe changing it to be automatic if a certain set of numbers is set.
    public void showHand() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    public List<Card> getCards(){
        return cards;
    }
}