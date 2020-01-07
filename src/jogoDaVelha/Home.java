package jogoDaVelha;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

/**
 * 
 * @author Tiago Barbosa, https://github.com/tiagocbarbosa
 *
 */
public class Home extends JFrame {	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {

		Player playerOne = new Player();
		Player playerTwo = new Player();
		Turn turn = new Turn(playerOne, playerTwo);

		setTitle("TIC TAC TOE");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblScore = new JLabel("Score:");
		lblScore.setBounds(10, 11, 98, 14);
		contentPane.add(lblScore);

		JLabel lblPlayerOne = new JLabel("Player 1:");
		lblPlayerOne.setBounds(20, 36, 68, 14);
		contentPane.add(lblPlayerOne);

		JLabel lblPlayerTwo = new JLabel("Player 2:");
		lblPlayerTwo.setBounds(20, 61, 68, 14);
		contentPane.add(lblPlayerTwo);

		JLabel lblPlayerOneScore = new JLabel("0 points");
		lblPlayerOneScore.setBounds(89, 36, 61, 14);
		contentPane.add(lblPlayerOneScore);

		JLabel lblPlayerTwoScore = new JLabel("0 points");
		lblPlayerTwoScore.setBounds(89, 61, 61, 14);
		contentPane.add(lblPlayerTwoScore);

		JLabel lblPlayerTurn = new JLabel("Player 1 Turn"); // here
		lblPlayerTurn.setForeground(Color.RED);
		lblPlayerTurn.setBounds(20, 86, 110, 14);
		contentPane.add(lblPlayerTurn);

		JButton btn00 = new JButton("X");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!turn.isGameFinished()) {
					if(!turn.isButtonPressed(0, 0)) {
						turn.buttonPressed(0, 0);
						if(turn.getPlayerTurn().equals(playerOne)) {
							btn00.setText("X");
						} else {
							btn00.setText("O");
						}

						if (turn.isGameFinished()) {
							String winnerMessage = "Congratulations " + turn.getPlayerTurnStringShort() + "! You won the game.";
							JOptionPane.showMessageDialog(null, winnerMessage, null, JOptionPane.INFORMATION_MESSAGE);
							Player playerScored = turn.getPlayerTurn();
							playerScored.scored();
						} else {
							turn.nextTurn();
							lblPlayerTurn.setText(turn.getPlayerTurnString());
						}
					}
				}

			}
		});
		btn00.setForeground(Color.GRAY);
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 78));
		btn00.setBounds(42, 160, 112, 100);
		contentPane.add(btn00);

		JButton btn01 = new JButton("X");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!turn.isGameFinished()) {
					if(!turn.isButtonPressed(0, 1)) {
						turn.buttonPressed(0, 1);
						if(turn.getPlayerTurn().equals(playerOne)) {
							btn01.setText("X");
						} else {
							btn01.setText("O");
						}

						if (turn.isGameFinished()) {
							String winnerMessage = "Congratulations " + turn.getPlayerTurnStringShort() + "! You won the game.";
							JOptionPane.showMessageDialog(null, winnerMessage, null, JOptionPane.INFORMATION_MESSAGE);
							Player playerScored = turn.getPlayerTurn();
							playerScored.scored();
						} else {
							turn.nextTurn();
							lblPlayerTurn.setText(turn.getPlayerTurnString());
						}
					}
				}

			}
		});
		btn01.setForeground(Color.GRAY);
		btn01.setFont(new Font("Tahoma", Font.PLAIN, 78));
		btn01.setBounds(164, 160, 112, 100);
		contentPane.add(btn01);

		JButton btn02 = new JButton("X");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!turn.isGameFinished()) {
					if(!turn.isButtonPressed(0, 2)) {
						turn.buttonPressed(0, 2);
						if(turn.getPlayerTurn().equals(playerOne)) {
							btn02.setText("X");
						} else {
							btn02.setText("O");
						}

						if (turn.isGameFinished()) {
							String winnerMessage = "Congratulations " + turn.getPlayerTurnStringShort() + "! You won the game.";
							JOptionPane.showMessageDialog(null, winnerMessage, null, JOptionPane.INFORMATION_MESSAGE);
							Player playerScored = turn.getPlayerTurn();
							playerScored.scored();
						} else {
							turn.nextTurn();
							lblPlayerTurn.setText(turn.getPlayerTurnString());
						}
					}
				}

			}
		});
		btn02.setFont(new Font("Tahoma", Font.PLAIN, 78));
		btn02.setForeground(Color.GRAY);
		btn02.setBounds(286, 160, 112, 100);
		contentPane.add(btn02);

		JButton btn10 = new JButton("X");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!turn.isGameFinished()) {
					if(!turn.isButtonPressed(1, 0)) {
						turn.buttonPressed(1, 0);
						if(turn.getPlayerTurn().equals(playerOne)) {
							btn10.setText("X");
						} else {
							btn10.setText("O");
						}

						if (turn.isGameFinished()) {
							String winnerMessage = "Congratulations " + turn.getPlayerTurnStringShort() + "! You won the game.";
							JOptionPane.showMessageDialog(null, winnerMessage, null, JOptionPane.INFORMATION_MESSAGE);
							Player playerScored = turn.getPlayerTurn();
							playerScored.scored();
						} else {
							turn.nextTurn();
							lblPlayerTurn.setText(turn.getPlayerTurnString());
						}
					}
				}

			}
		});
		btn10.setForeground(Color.GRAY);
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 78));
		btn10.setBounds(42, 271, 112, 100);
		contentPane.add(btn10);

		JButton btn11 = new JButton("X");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!turn.isGameFinished()) {
					if(!turn.isButtonPressed(1, 1)) {
						turn.buttonPressed(1, 1);
						if(turn.getPlayerTurn().equals(playerOne)) {
							btn11.setText("X");
						} else {
							btn11.setText("O");
						}

						if (turn.isGameFinished()) {
							String winnerMessage = "Congratulations " + turn.getPlayerTurnStringShort() + "! You won the game.";
							JOptionPane.showMessageDialog(null, winnerMessage, null, JOptionPane.INFORMATION_MESSAGE);
							Player playerScored = turn.getPlayerTurn();
							playerScored.scored();
						} else {
							turn.nextTurn();
							lblPlayerTurn.setText(turn.getPlayerTurnString());
						}
					}
				}

			}
		});
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 78));
		btn11.setForeground(Color.GRAY);
		btn11.setBounds(164, 271, 112, 100);
		contentPane.add(btn11);

		JButton btn12 = new JButton("X");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!turn.isGameFinished()) {
					if(!turn.isButtonPressed(1, 2)) {
						turn.buttonPressed(1, 2);
						if(turn.getPlayerTurn().equals(playerOne)) {
							btn12.setText("X");
						} else {
							btn12.setText("O");
						}

						if (turn.isGameFinished()) {
							String winnerMessage = "Congratulations " + turn.getPlayerTurnStringShort() + "! You won the game.";
							JOptionPane.showMessageDialog(null, winnerMessage, null, JOptionPane.INFORMATION_MESSAGE);
							Player playerScored = turn.getPlayerTurn();
							playerScored.scored();
						} else {
							turn.nextTurn();
							lblPlayerTurn.setText(turn.getPlayerTurnString());
						}
					}
				}

			}
		});
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 78));
		btn12.setForeground(Color.GRAY);
		btn12.setBounds(286, 271, 112, 100);
		contentPane.add(btn12);

		JButton btn20 = new JButton("X");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!turn.isGameFinished()) {
					if(!turn.isButtonPressed(2, 0)) {
						turn.buttonPressed(2, 0);
						if(turn.getPlayerTurn().equals(playerOne)) {
							btn20.setText("X");
						} else {
							btn20.setText("O");
						}

						if (turn.isGameFinished()) {
							String winnerMessage = "Congratulations " + turn.getPlayerTurnStringShort() + "! You won the game";
							JOptionPane.showMessageDialog(null, winnerMessage, null, JOptionPane.INFORMATION_MESSAGE);
							Player playerScored = turn.getPlayerTurn();
							playerScored.scored();
						} else {
							turn.nextTurn();
							lblPlayerTurn.setText(turn.getPlayerTurnString());
						}
					}
				}

			}
		});
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 80));
		btn20.setForeground(Color.GRAY);
		btn20.setBounds(42, 382, 112, 100);
		contentPane.add(btn20);

		JButton btn21 = new JButton("X");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!turn.isGameFinished()) {
					if(!turn.isButtonPressed(2, 1)) {
						turn.buttonPressed(2, 1);
						if(turn.getPlayerTurn().equals(playerOne)) {
							btn21.setText("X");
						} else {
							btn21.setText("O");
						}

						if (turn.isGameFinished()) {
							String winnerMessage = "Congratulations " + turn.getPlayerTurnStringShort() + "! You won the game.";
							JOptionPane.showMessageDialog(null, winnerMessage, null, JOptionPane.INFORMATION_MESSAGE);
							Player playerScored = turn.getPlayerTurn();
							playerScored.scored();
						} else {
							turn.nextTurn();
							lblPlayerTurn.setText(turn.getPlayerTurnString());
						}
					}
				}

			}
		});
		btn21.setForeground(Color.GRAY);
		btn21.setFont(new Font("Tahoma", Font.PLAIN, 78));
		btn21.setBounds(164, 382, 112, 100);
		contentPane.add(btn21);

		JButton btn22 = new JButton("X");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!turn.isGameFinished()) {
					if(!turn.isButtonPressed(2, 2)) {
						turn.buttonPressed(2, 2);
						if(turn.getPlayerTurn().equals(playerOne)) {
							btn22.setText("X");
						} else {
							btn22.setText("O");
						}

						if (turn.isGameFinished()) {
							String winnerMessage = "Congratulations " + turn.getPlayerTurnStringShort() + "! You won the game.";
							JOptionPane.showMessageDialog(null, winnerMessage, null, JOptionPane.INFORMATION_MESSAGE);
							Player playerScored = turn.getPlayerTurn();
							playerScored.scored();
						} else {
							turn.nextTurn();
							lblPlayerTurn.setText(turn.getPlayerTurnString());
						}
					}
				}

			}
		});
		btn22.setFont(new Font("Tahoma", Font.PLAIN, 78));
		btn22.setForeground(Color.GRAY);
		btn22.setBounds(286, 382, 112, 100);
		contentPane.add(btn22);

		// Setting buttons text to null
		btn00.setText(null);
		btn01.setText(null);
		btn02.setText(null);
		btn10.setText(null);
		btn11.setText(null);
		btn12.setText(null);
		btn20.setText(null);
		btn21.setText(null);
		btn22.setText(null);

		JButton btnInfo = new JButton("Info");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Game created by Tiago Barbosa, https://github.com/tiagocbarbosa.", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnInfo.setBounds(300, 11, 129, 23);
		contentPane.add(btnInfo);

		JButton btnCleanGame = new JButton("Clean Game");
		btnCleanGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Cleaning everything
				turn.restartGame();
				lblPlayerOneScore.setText(String.valueOf(playerOne.getScore()) + " points");
				lblPlayerTwoScore.setText(String.valueOf(playerTwo.getScore()) + " points");
				lblPlayerTurn.setText("Player 1 Turn");
				btn00.setText(null);
				btn01.setText(null);
				btn02.setText(null);
				btn10.setText(null);
				btn11.setText(null);
				btn12.setText(null);
				btn20.setText(null);
				btn21.setText(null);
				btn22.setText(null);

			}
		});
		btnCleanGame.setBounds(300, 82, 129, 23);
		contentPane.add(btnCleanGame);

		JButton btnSair = new JButton("Exit");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Goodbye
				System.exit(0);
			}
		});
		btnSair.setBounds(300, 116, 129, 23);
		contentPane.add(btnSair);
		
		JButton btnNextMatch = new JButton("Next Match");
		btnNextMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				turn.nextGame();
				lblPlayerOneScore.setText(String.valueOf(playerOne.getScore()) + " points");
				lblPlayerTwoScore.setText(String.valueOf(playerTwo.getScore()) + " points");
				lblPlayerTurn.setText("Player 1 Turn");
				btn00.setText(null);
				btn01.setText(null);
				btn02.setText(null);
				btn10.setText(null);
				btn11.setText(null);
				btn12.setText(null);
				btn20.setText(null);
				btn21.setText(null);
				btn22.setText(null);
				
			}
		});
		btnNextMatch.setBounds(300, 45, 129, 23);
		contentPane.add(btnNextMatch);
	}
	
}
