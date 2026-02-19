import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlackjackFrame extends JFrame {

    private Dealer dealer;
    private Player player;

    private JTextArea playerArea;
    private JTextArea dealerArea;
    private JLabel statusLabel;
    private JButton hitButton;
    private JButton standButton;
    private JButton newRoundButton;

    public BlackjackFrame() {
        super("Blackjack");
        dealer = new Dealer();
        player = new Player("Player", 1000);

        initUI();
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initUI() {
        setLayout(new BorderLayout());

        JPanel center = new JPanel(new GridLayout(1,2));

        playerArea = new JTextArea(10,30);
        playerArea.setEditable(false);
        playerArea.setBorder(BorderFactory.createTitledBorder("Player"));

        dealerArea = new JTextArea(10,30);
        dealerArea.setEditable(false);
        dealerArea.setBorder(BorderFactory.createTitledBorder("Dealer"));

        center.add(new JScrollPane(playerArea));
        center.add(new JScrollPane(dealerArea));

        add(center, BorderLayout.CENTER);

        JPanel controls = new JPanel();
        hitButton = new JButton("Hit");
        standButton = new JButton("Stand");
        newRoundButton = new JButton("New Round");

        hitButton.setEnabled(false);
        standButton.setEnabled(false);

        controls.add(hitButton);
        controls.add(standButton);
        controls.add(newRoundButton);

        add(controls, BorderLayout.SOUTH);

        statusLabel = new JLabel("Money: " + player.getMoney());
        add(statusLabel, BorderLayout.NORTH);

        // Actions
        newRoundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startRound();
            }
        });

        hitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dealer.dealToPlayer(player);
                updateDisplays();
                if (player.getHand().getValue() > 21) {
                    endRound();
                }
            }
        });

        standButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game.dealerTurn(dealer);
                endRound();
            }
        });
    }

    private void startRound() {
        if (player.getMoney() <= 0) {
            JOptionPane.showMessageDialog(this, "You have no money left.");
            return;
        }

        player.resetHand();
        dealer.resetHand();

        player.placeBet(100);

        dealer.dealToPlayer(player);
        dealer.dealToPlayer(player);
        dealer.dealToSelf();
        dealer.dealToSelf();

        updateDisplays();

        hitButton.setEnabled(true);
        standButton.setEnabled(true);
        newRoundButton.setEnabled(false);
    }

    private void endRound() {
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
        newRoundButton.setEnabled(true);

        int playerValue = player.getHand().getValue();
        int dealerValue = dealer.getHand().getValue();

        String result;
        if (playerValue > 21) {
            result = "You busted!";
            player.loseBet();
        } else if (dealerValue > 21 || playerValue > dealerValue) {
            result = "You win!";
            player.winBet();
        } else if (playerValue == dealerValue) {
            result = "Push.";
            player.pushBet();
        } else {
            result = "Dealer wins.";
            player.loseBet();
        }

        updateDisplays();
        JOptionPane.showMessageDialog(this, result + "\nYour money: " + player.getMoney());
    }

    private void updateDisplays() {
        playerArea.setText(Game.handToString(player));
        dealerArea.setText(Game.handToString(dealer));
        statusLabel.setText("Money: " + player.getMoney());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BlackjackFrame f = new BlackjackFrame();
            f.setVisible(true);
        });
    }
}
