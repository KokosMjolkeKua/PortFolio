public class Player {

    private String name;
    private int money;
    private int currentBet;
    private Hand hand;

    public Player(String name, int startingMoney) {
        this.name = name;
        this.money = startingMoney;
        this.hand = new Hand();
    }

    public void receiveCard(Card card) {
        hand.addCard(card);
    }

    public void placeBet(int bet) {
        if (bet > money) {
            System.out.println("Not enough money.");
            return;
        }
        money -= bet;
        currentBet = bet;
        Dealer.addMoney(bet);
    }

    public void winBet() {
        money += currentBet * 2;
        currentBet = 0;
    }

    public void pushBet() {
        money += currentBet;
        currentBet = 0;
    }

    public void loseBet() {
        currentBet = 0;
    }

    public int getMoney() {
        return money;
    }

    public Hand getHand() {
        return hand;
    }

    public void resetHand() {
        hand = new Hand();
    }

    public void showHand() {
        System.out.println(name + "'s hand:");
        hand.showHand();
    }
}