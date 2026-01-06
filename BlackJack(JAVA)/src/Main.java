import static javax.swing.JOptionPane.*;

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
            dealer.dealToSelf();

            showMessageDialog(null,
                    "Your Hand:\n" + handToString(player));

            // PLAYER TURN
            playerTurn(player, dealer);

            if (player.getHand().getValue() <= 21) {
                dealerTurn(dealer);
            }

            // SHOW HANDS
            showMessageDialog(null,
                    "Your Final Hand:\n" + handToString(player) +
                            "\n\nDealer Hand:\n" + handToString(dealer));

            // Finish round
            int playerValue = player.getHand().getValue();
            int dealerValue = dealer.getHand().getValue();

            if (playerValue > 21) {
                showMessageDialog(null, "You Lost!");
                player.loseBet();
            } else if (dealerValue > 21 || playerValue > dealerValue) {
                showMessageDialog(null, "You win!");
                player.winBet();
            } else if (playerValue == dealerValue) {
                showMessageDialog(null, "Push!");
                player.pushBet();
            } else {
                showMessageDialog(null, "Dealer wins!");
                player.loseBet();
            }

            int again = showConfirmDialog(
                    null,
                    "Play another round?\nMoney: " + player.getMoney(),
                    "Continue",
                    YES_NO_OPTION
            );

            if (again != YES_OPTION) {
                break;
            }
        }

        showMessageDialog(null, "Game Over!");
    }
}