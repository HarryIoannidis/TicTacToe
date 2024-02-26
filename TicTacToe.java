import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class TicTacToe extends javax.swing.JFrame {

    private javax.swing.JLabel Title;
    private javax.swing.JLabel aiLabel;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel clearAllLabel;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JLabel oLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JSeparator titleSeperator;
    private javax.swing.JLabel xLabel;
    private javax.swing.JLabel youLabel;
    private ArrayList<Integer> ticTacToeList = new ArrayList<>(java.util.Arrays.asList(1,2,3,4,5,6,7,8,9));
    private ArrayList<JButton> jButtonsList = new ArrayList<>();
    private int[] ticTacToeMatrix = new int[9];
    private boolean stop = false;

    public TicTacToe() {
        initComponents();
    }

    private void initComponents() {
        titlePanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        titleSeperator = new javax.swing.JSeparator();
        buttonPanel = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        youLabel = new javax.swing.JLabel();
        aiLabel = new javax.swing.JLabel();
        xLabel = new javax.swing.JLabel();
        oLabel = new javax.swing.JLabel();
        creditsLabel = new javax.swing.JLabel();
        clearAllLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Title.setFont(new java.awt.Font("Cantarell", Font.BOLD | Font.ITALIC, 18));
        Title.setText("TIC-TAC-TOE");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addContainerGap(246, Short.MAX_VALUE)
                                .addComponent(Title)
                                .addContainerGap(246, Short.MAX_VALUE))
                        .addComponent(titleSeperator)
        );
        titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Title)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(titleSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonPanel.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

        button1.setFont(new java.awt.Font("Cantarell", Font.PLAIN, 48));
        button1.setText("");
        button1.addActionListener(evt -> button1ActionPerformed(true));
        buttonPanel.add(button1);

        button2.setFont(new java.awt.Font("Cantarell", Font.PLAIN, 48));
        button2.setText("");
        button2.addActionListener(evt -> button2ActionPerformed(true));
        buttonPanel.add(button2);

        button3.setFont(new java.awt.Font("Cantarell", Font.PLAIN, 48));
        button3.setText("");
        button3.addActionListener(evt -> button3ActionPerformed(true));
        buttonPanel.add(button3);

        button4.setFont(new java.awt.Font("Cantarell", Font.PLAIN, 48));
        button4.setText("");
        button4.addActionListener(evt -> button4ActionPerformed(true));
        buttonPanel.add(button4);

        button5.setFont(new java.awt.Font("Cantarell", Font.PLAIN, 48));
        button5.setText("");
        button5.addActionListener(evt -> button5ActionPerformed(true));
        buttonPanel.add(button5);

        button6.setFont(new java.awt.Font("Cantarell", Font.PLAIN, 48));
        button6.setText("");
        button6.addActionListener(evt -> button6ActionPerformed(true));
        buttonPanel.add(button6);

        button7.setFont(new java.awt.Font("Cantarell", Font.PLAIN, 48));
        button7.setText("");
        button7.addActionListener(evt -> button7ActionPerformed(true));
        buttonPanel.add(button7);

        button8.setFont(new java.awt.Font("Cantarell", Font.PLAIN, 48));
        button8.setText("");
        button8.addActionListener(evt -> button8ActionPerformed(true));
        buttonPanel.add(button8);

        button9.setFont(new java.awt.Font("Cantarell", Font.PLAIN, 48));
        button9.setText("");
        button9.addActionListener(evt -> button9ActionPerformed(true));
        buttonPanel.add(button9);

        youLabel.setFont(new java.awt.Font("Cantarell", Font.BOLD, 18));
        youLabel.setText("You:");

        aiLabel.setFont(new java.awt.Font("Cantarell", Font.BOLD, 18));
        aiLabel.setText("A.I.:");

        xLabel.setFont(new java.awt.Font("Cantarell Extra Bold", Font.BOLD, 18));
        xLabel.setForeground(new java.awt.Color(255, 0, 0));
        xLabel.setText("X");

        oLabel.setFont(new java.awt.Font("Cantarell Extra Bold", Font.BOLD, 18));
        oLabel.setForeground(new java.awt.Color(0, 153, 153));
        oLabel.setText("O");

        creditsLabel.setFont(new java.awt.Font("Fira Code Retina", Font.ITALIC, 14));
        creditsLabel.setText("By Harry Ioannidis");
        creditsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        clearAllLabel.setFont(new java.awt.Font("Cantarell Extra Bold", Font.PLAIN, 14));
        clearAllLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearAllLabel.setText("Clear All");
        clearAllLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearAllLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearAllLabelMouseClicked();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(youLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(xLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(aiLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(oLabel))
                                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(creditsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearAllLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(youLabel)
                                        .addComponent(aiLabel)
                                        .addComponent(xLabel)
                                        .addComponent(oLabel))
                                .addGap(15, 15, 15)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(creditsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(clearAllLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))))
        );

        jButtonsList = new ArrayList<>(java.util.Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8, button9));


        pack();
    }

    private void button1ActionPerformed(boolean player) {
        if (player) {
            playerAction(button1, 1);
        } else {
            aiAction(button1, 1);
        }
    }

    private void button2ActionPerformed(boolean player) {
        if (player) {
            playerAction(button2, 2);
        } else {
            aiAction(button2, 2);
        }    
    }

    private void button3ActionPerformed(boolean player) {
        if (player) {
            playerAction(button3, 3);
        } else {
             aiAction(button3, 3);
        }
    }

    private void button4ActionPerformed(boolean player) {
        if (player) {
            playerAction(button4, 4);
        } else {
            aiAction(button4, 4);
        }
    }

    private void button5ActionPerformed(boolean player) {
        if (player) {
            playerAction(button5, 5);
        } else {
            aiAction(button5, 5);
        }
    }

    private void button6ActionPerformed(boolean player) {
        if (player) {
            playerAction(button6, 6);
        } else {
            aiAction(button6, 6);
        }  
    }

    private void button7ActionPerformed(boolean player) {
        if (player) {
            playerAction(button7, 7);
        } else {
            aiAction(button7, 7);
        }  
    }

    private void button8ActionPerformed(boolean player) {
        if (player) {
            playerAction(button8, 8);
        } else {
            aiAction(button8, 8);
        }
    }

    private void button9ActionPerformed(boolean player) {
        if (player) {
            playerAction(button9, 9);
        } else {
            aiAction(button9, 9);
        }   
    }

    private void clearAllLabelMouseClicked() {
        gameState(true);
        ticTacToeList = new ArrayList<>(java.util.Arrays.asList(1,2,3,4,5,6,7,8,9));
        for (int i = 0; i < 9 ; i++) {
            ticTacToeMatrix[i] = 0;
        }
    }



    private void aiAction(JButton button, int value) {
        button.setText("O");
        button.setForeground(new java.awt.Color(0, 153, 153));
        button.setEnabled(false);
        button.updateUI();

        if (checkWinning(value, 2)) {
            System.out.println("A.I. won.");
            gameState(false);
        }
    }

    private void playerAction(JButton button, int value) {
        button.setText("X");
        button.setForeground(new java.awt.Color(255, 0, 0));
        button.setEnabled(false);
        button.updateUI();

        if (checkWinning(value, 1)) {
            System.out.println("You won.");
            gameState(false);
        }

        if (!stop && (ticTacToeList.size() > 1)) {
            Random random = new Random();
            int randomValue = ticTacToeList.get(random.nextInt(ticTacToeList.size()));
            aiRandomButton(randomValue);
        }
    }



    private void aiRandomButton(int value) {
        switch (value) {
            case 1:
                button1ActionPerformed(false);
                break;
            case 2:
                button2ActionPerformed(false);
                break;
            case 3:
                button3ActionPerformed(false);
                break;
            case 4:
                button4ActionPerformed(false);
                break;
            case 5:
                button5ActionPerformed(false);
                break;
            case 6:
                button6ActionPerformed(false);
                break;
            case 7:
                button7ActionPerformed(false);
                break;
            case 8:
                button8ActionPerformed(false);
                break;
            case 9:
                button9ActionPerformed(false);
                break;
        }
    }



    private boolean checkWinning(int buttonPressed, int playerValue) {
        switch (buttonPressed) {
            case 1:
                changeLists(buttonPressed, playerValue);
                return checkFirstLine(playerValue) || checkFirstCol(playerValue) || checkDiag(playerValue);

            case 2:
                changeLists(buttonPressed, playerValue);
                return checkFirstLine(playerValue) || checkSecondCol(playerValue);

            case 3:
                changeLists(buttonPressed, playerValue);
                return checkFirstLine(playerValue) || checkThirdCol(playerValue) || checkReversedDiag(playerValue);

            case 4:
                changeLists(buttonPressed, playerValue);
                return checkSecondLine(playerValue) || checkFirstCol(playerValue);

            case 5:
                changeLists(buttonPressed, playerValue);
                return checkSecondLine(playerValue) || checkSecondCol(playerValue) || checkDiag(playerValue) || checkReversedDiag(playerValue);

            case 6:
                changeLists(buttonPressed, playerValue);
                return checkSecondLine(playerValue) || checkThirdCol(playerValue);

            case 7:
                changeLists(buttonPressed, playerValue);
                return checkThirdLine(playerValue) || checkFirstCol(playerValue) || checkReversedDiag(playerValue);

            case 8:
                changeLists(buttonPressed, playerValue);
                return checkThirdLine(playerValue) || checkSecondCol(playerValue);

            case 9:
                changeLists(buttonPressed, playerValue);
                return checkThirdLine(playerValue) || checkThirdCol(playerValue) || checkDiag(playerValue);

            default:
                return false;
        }
    }



    private boolean checkFirstLine(int value) {
        return ticTacToeMatrix[0] == value && ticTacToeMatrix[1] == value && ticTacToeMatrix[2] == value;
    }

    private boolean checkSecondLine(int value) {
        return ticTacToeMatrix[3] == value && ticTacToeMatrix[4] == value && ticTacToeMatrix[5] == value;
    }

    private boolean checkThirdLine(int value) {
        return ticTacToeMatrix[6] == value && ticTacToeMatrix[7] == value && ticTacToeMatrix[8] == value;
    }

    private boolean checkFirstCol(int value) {
        return ticTacToeMatrix[0] == value && ticTacToeMatrix[3] == value && ticTacToeMatrix[6] == value;
    }

    private boolean checkSecondCol(int value) {
        return ticTacToeMatrix[1] == value && ticTacToeMatrix[4] == value && ticTacToeMatrix[5] == value;
    }

    private boolean checkThirdCol(int value) {
        return ticTacToeMatrix[2] == value && ticTacToeMatrix[5] == value && ticTacToeMatrix[8] == value;
    }

    private boolean checkDiag(int value) {
        return ticTacToeMatrix[0] == value && ticTacToeMatrix[4] == value && ticTacToeMatrix[8] == value;
    }

    private boolean checkReversedDiag(int value) {
        return ticTacToeMatrix[2] == value && ticTacToeMatrix[4] == value && ticTacToeMatrix[6] == value;
    }



    private void changeLists(int value, int player) {
        if (player == 1) {
            ticTacToeMatrix[value - 1] = 1;
        } else {
            ticTacToeMatrix[value - 1] = 2;
        }

        ticTacToeList.remove(Integer.valueOf(value));
    }



    private void gameState(boolean value) {
        //if value==false then gameOver . if value==true then gameStart
        stop = !value;
        enableButtons(value);
    }



    private void enableButtons(boolean value) {
        for (JButton button : jButtonsList) {
            button.setEnabled(value);
            if (value) {
                button.setText("");
                button.setForeground(Color.WHITE);
                button.updateUI();
            }
        }
    }



    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new TicTacToe().setVisible(true));
    }

}
