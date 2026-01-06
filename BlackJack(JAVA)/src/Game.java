//Making the player turn method

import static javax.swing.JOptionPane.*; //using the static version so i dont have to add JOption pane for every different one in case i change my mind

public class Game {

    public static void PlayerTurn(Player player, Dealer dealer){
        while(true){
            int choice = showOptionDialog(
                    null, "Your hand: " + player.getHand().getValue() +
                            "\nHit or Stand?", "Your turn.",
                    YES_NO_OPTION, QUESTION_MESSAGE, null, new String[]{"Hit", "Stand"},
                    "Hit"
            );

            if(choice == 0){ //If you HIT
                dealer.dealToPlayer(player);

                if(player.getHand().getValue() > 21){ //if the value exceeds 21, you loos
                    showMessageDialog(null, "You Loose...");
                    break;
                }
            }
            else{ //In this case its stand
                break;
            }
        }
    }



    //showing the hand of the player(might reworke to always visible..)

    public static String handToString(Player player){
        StringBuilder builder = new StringBuilder();
        for(Card c: player.getHand().getValue()){
            builder.append(c).append("\n");
        }

        builder.append("\nCard: ").append(player.getHand().getValue());
        return builder.toString();
    }


    //Adding dealer mechanics, that are automatic (need to change the main as well)
    public static void dealerTurn(Dealer dealer) {
        while (dealer.getHand().getValue() < 17) {
            dealer.dealToSelf();
        }
    }


}
