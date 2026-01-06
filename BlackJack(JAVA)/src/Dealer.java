public class Dealer {

    private static int moneyPot = 100000;

    private Deck deck;
    private Hand hand;

    public Dealer() {
        deck = new Deck();
        hand = new Hand();
    }

    public static void addMoney(int amount) {
        moneyPot += amount;
    }

    public static int getMoneyPot() {
        return moneyPot;
    }

    public Card dealCard() {
        return deck.dealCard();
    }

    public void dealToPlayer(Player player) {
        player.receiveCard(dealCard());
    }

    public void dealToSelf() {
        hand.addCard(dealCard());
    }

    public Hand getHand() {
        return hand;
    }

    public void resetHand() {
        hand = new Hand();
    }
}