package TicTacToe;

import javax.swing.*; 

public class Main {
	
	private static String Player1;
	private static int opponent; 
	private static String Player2; 
	private static Board board; 
	private static int order;
	private static int choice;
	private static String whoFirst;
	public static String playerPick;
	public static String player2Pick;
	private static String cpuPick;
	
	public static void main(String[] args) {
		
		//Ask the user for name
	
		/* Ask user if the opponent is another player or a computer 
		 * 
		 * opponent = 0 if User pick Computer
		 * opponent = 1 if User pick Player
		 * 
		 */
		String[] opponentOption = {"Computer", "Player"}; 
		opponent = JOptionPane.showOptionDialog(null,"Who do you want to play against?", "Choose your opponent", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opponentOption, null);
		
		Player1 = JOptionPane.showInputDialog("Enter the name of Player 1: ");
		
		
		// If the opponent is another player, ask user the name of that player
		if (opponent == 1){
			Player2 = JOptionPane.showInputDialog("Enter the name of Player 2: ");
			String[]choices = {"X", "O"};
			choice = JOptionPane.showOptionDialog(null, Player1 + " ,do you want to be X or O?", "Choose", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices, null); 
			if (choice == 0) {
				JOptionPane.showMessageDialog(null, Player1 + " is X and " + Player2 + " is O");
				playerPick = "X";
				player2Pick = "O";
			}
			if (choice == 1) {
				JOptionPane.showMessageDialog(null, Player1 + " is O and " + Player2 + " is X");
				playerPick = "O";
				player2Pick = "X";
			}
			String[] orderOption = {Player1, Player2}; 
			order = JOptionPane.showOptionDialog(null,"Who do you want to have the first move?: ", "Choose who gets the first move", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, orderOption, null); 
			 if(order == 0) {
				 whoFirst = Player1;
				 JOptionPane.showMessageDialog(null, Player1 + " goes first!");
			 }
			 if(order == 1) {
				 whoFirst = Player2;
				 JOptionPane.showMessageDialog(null, Player2 + " goes first!");
			 }
		}
			
		/* If the opponent is a computer, ask user who gets to play first
		 * 
		 * order = 0 if Computer plays first 
		 * order = 1 if Player plays first
		 * 
		 */
		if (opponent == 0){
			String[] orderOption = {"Computer", "Player"}; 
			order = JOptionPane.showOptionDialog(null,"Who do you want to have the first move?: ", "Choose who gets the first move", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, orderOption, null);
			 if(order == 0) {
				 whoFirst = "Computer";
				 JOptionPane.showMessageDialog(null, "Computer goes first!");
			 }
			 if(order == 1) {
				 whoFirst = Player1;
				 JOptionPane.showMessageDialog(null, Player1 + " goes first!");
			 }
			String[]choices = {"X", "O"};
			choice = JOptionPane.showOptionDialog(null, Player1 + " ,do you want to be X or O?", "Choose", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices, null); 
			if (choice == 0) {
				JOptionPane.showMessageDialog(null, Player1 + " is X and " + "the Computer is O");
			}
			if (choice == 1) {
				JOptionPane.showMessageDialog(null, Player1 + " is O and " + "the Computer is X");
			}
		}
		
		
		
		
		// Create a TicTacToe Board
		board = new Board(); 	
	}

	// Accessor Methods
	public int getOpponent(){return opponent;}
	public String getPlayer2(){return Player2;}
	
	
}