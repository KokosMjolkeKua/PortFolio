public class Main {

    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        Player player = new Player("Player", 1000);

        while (player.getMoney() > 0) {

            player.resetHand();
            dealer.resetHand();

            player.placeBet(100);

            dealer.dealToPlayer(player);
            dealer.dealToPlayer(player);
            dealer.dealToSelf();

            // Dealer hits until 17+
            while (dealer.getHand().getValue() < 17) {
                dealer.dealToSelf();
            }

            System.out.println("Player Hand:");
            player.showHand();
            System.out.println("Value: " + player.getHand().getValue());

            System.out.println("\nDealer Hand:");
            dealer.getHand().showHand();
            System.out.println("Value: " + dealer.getHand().getValue());

            int playerValue = player.getHand().getValue();
            int dealerValue = dealer.getHand().getValue();


            //Need to change so this is not in the main,
            //Add it as a seperate class because now its not very clean

            if (playerValue > 21) {
                System.out.println("Player busts!");
                player.loseBet();
            } else if (dealerValue > 21 || playerValue > dealerValue) {
                System.out.println("Player wins!");
                player.winBet();
            } else if (playerValue == dealerValue) {
                System.out.println("Push!");
                player.pushBet();
            } else {
                System.out.println("Dealer wins!");
                player.loseBet();
            }

            System.out.println("Player money: " + player.getMoney());
            System.out.println("--------------------------");
        }

        System.out.println("Game Over");
    }
}
