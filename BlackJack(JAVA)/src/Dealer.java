public class Dealer {

    //Need to be able to start the game,
    //deal the cards
    //maybe interact?

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

    //Moneypot for the the bets to be placed when i add that
    public static int getMoneyPot() {
        return moneyPot;
    }

    public Card dealCard() {
        return deck.dealCard();
    }

    //Dealing to player
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