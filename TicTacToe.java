// A simple program to demonstrate (edited by Shuha Sheikh, February 23rd, 2022)
// Tic-Tac-Toe Game.
import java.util.*;

public class TicTacToe {

	static String[] board;
	static String turn;
	public static final String TEXT_RESET = "\u001B[0m";
	public static final String TEXT_PURPLE = "\u001B[1;35m";
	public static final String TEXT_CYAN = "\u001B[1;36m";


	// CheckWinner method will
	// decide the combination
	// of three box given below.
	static String checkWinner()
	{
		for (int a = 0; a < 8; a++) {
			String line = null;

			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
			line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			//For X winner
			if (line.equals(TEXT_PURPLE + "X" + TEXT_RESET + TEXT_PURPLE + "X" + TEXT_RESET + TEXT_PURPLE + "X" + TEXT_RESET)) {
				return "X";
			}

			// For O winner
			else if (line.equals(TEXT_CYAN + "O" + TEXT_RESET + TEXT_CYAN + "O" + TEXT_RESET + TEXT_CYAN + "O" + TEXT_RESET)) {
				return "O";
			}
		}
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(
					String.valueOf(a + 1))) {
				break;
			}
			else if (a == 8) {
				return "draw";
			}
		}
	// To enter the X Or O at the exact place on board.
		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}//end checkWinner
	// To print out the board.
		/* -------------
		   | 1 | 2 | 3 |
	       |-----------|
	       | 4 | 5 | 6 |
	       |-----------|
	       | 7 | 8 | 9 |
       	   -------------*/
	static void printBoard()
	{
		System.out.println("-------------");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("-------------");
	}//end printBoard

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

board = new String[9];
		turn = TEXT_PURPLE + "X" + TEXT_RESET;
		String winner = null;

		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}

		System.out.println("Welcome to 3x3 Tic Tac Toe.");
		printBoard();

		System.out.printf("\u001B[1;35m%s \u001B[0m%s \u001B[1;35m%s \u001B[0m%s", "X", " will play first. Enter a slot number to place", " X ", "in:");
		System.out.printf("%n","");

		while (winner == null) {
			int numInput;

		// Exception handling.
		// numInput will take input from user like from 1 to 9.
		// If it is not in range from 1 to 9.
		// then it will show you an error "Invalid input."
			try {
				numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {

				System.out.printf("\u001B[1;31m%s","Invalid input; re-enter slot number:");
				System.out.printf("\u001B[0m%n","");

					continue;
				}
			}
			catch (InputMismatchException e) {
				System.out.printf("\u001B[1;31m%s","Invalid input; re-enter slot number:");
				System.out.printf("\u001B[0m%n","");
				continue;
			}

			// This game has two player x and O.
			// Here is the logic to decide the turn.
			if (board[numInput - 1].equals(
					String.valueOf(numInput))) {
				board[numInput - 1] = turn;

				if (turn.equals(TEXT_PURPLE + "X" + TEXT_RESET)) {
					turn = TEXT_CYAN + "O" + TEXT_RESET;
				}
				else {
					turn = TEXT_PURPLE + "X" + TEXT_RESET;
				}

				printBoard();

				winner = checkWinner();
			}
			else {
				System.out.printf("\u001B[1;31m%s", "Slot already taken; re-enter slot number:");
				System.out.printf("\u001B[0m%n", "");
			}
		}//end while

		// If no one win or lose from both player x and O.
		// then here is the logic to print "draw".
		if (winner.equalsIgnoreCase("draw")) {
			System.out.printf("\u001B[1;33m%s", "It's a draw! Thanks for playing.");
			System.out.printf("\u001B[0m%n", "");
		}

		// For winner -to display Congratulations! message.
		else {
			System.out.printf("\033[1;34m%s \u001B[1;32m%s \033[1;34m%s", "Congratulations! ", winner, "'s have won! Thanks for playing.");
			System.out.printf("\u001B[0m%n", "");
		}
	}//end main
}//end class
