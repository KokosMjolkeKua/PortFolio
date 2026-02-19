//Making the player turn method

import static javax.swing.JOptionPane.*; //using the static version so i dont have to add JOption pane for every different one in case i change my mind

public class Game {

    // Player turn using dialog choices
    public static void playerTurn(Player player, Dealer dealer){
        while(true){
            int choice = showOptionDialog(
                    null,
                    "Your hand:\n" + handToString(player) + "\nTotal: " + player.getHand().getValue() + "\n\nHit or Stand?",
                    "Your turn.",
                    YES_NO_OPTION, QUESTION_MESSAGE, null, new String[]{"Hit", "Stand"},
                    "Hit"
            );

            if(choice == 0){ // If you HIT
                dealer.dealToPlayer(player);

                if(player.getHand().getValue() > 21){ // bust
                    showMessageDialog(null, "You busted!");
                    break;
                }
            }
            else{ // Stand
                break;
            }
        }
    }

    // Convert a player's hand to a readable String
    public static String handToString(Player player){
        return handToString(player.getHand());
    }

    // Convert a dealer's hand to a readable String
    public static String handToString(Dealer dealer){
        return handToString(dealer.getHand());
    }

    // Convert a Hand to string
    public static String handToString(Hand hand){
        StringBuilder builder = new StringBuilder();
        for(Card c: hand.getCards()){
            builder.append(c).append("\n");
        }
        builder.append("\nTotal: ").append(hand.getValue());
        return builder.toString();
    }

    // Dealer automated play
    public static void dealerTurn(Dealer dealer) {
        while (dealer.getHand().getValue() < 17) {
            dealer.dealToSelf();
        }
    }


}
