/*
 * Name - Kushal Kachhadiya
 * Professor - Gustavo Adami
 * Lab - Lab 3(Chess Game)
 * Due - 20 October
 */
import pieces.Bishop; // importing that all our Packages & classes
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {

	private final static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
	}

	final static Piece[][] chessBoard;

	static {
		chessBoard = new Piece[8][8];
	}

	public static void main(String[] args) {

		initialiseChessBoard();
		String option;
		option = "";
		label:
		do {
			switch (option) {
				case "Q":
				case "q":
					break label;
			}

			for (String s : Arrays.asList("\n1. Move a piece.", "2. Check a piece for valid moves.", "3. Redraw the board.", "Q. Quit")) {
				System.out.println(s);
			}

			option = scanner.next();
			if ("1".equals(option)) {
				movePiece();
			} else if (!"2".equals(option)) {
				if ("3".equals(option)) {
					redrawBoard();
				} else {
					if (!"Q".equals(option)) {
						System.out.println("Valid options are 1, 2, 3 or Q.");
					}
				}
			} else {
				checkValidMoves();
			}
		} while (true);
	}

	private static void initialiseChessBoard() {
		chessBoard[0][0] = new Rook(false);
		chessBoard[0][1] = new Knight(false);
		chessBoard[0][2] = new Bishop(false);
		chessBoard[0][3] = new King(false);
		chessBoard[0][4] = new Queen(false);
		chessBoard[0][5] = new Bishop(false);
		chessBoard[0][6] = new Knight(false);
		chessBoard[0][7] = new Rook(false);
		chessBoard[1][0] = new Pawn(false);
		chessBoard[1][1] = new Pawn(false);
		chessBoard[1][2] = new Pawn(false);
		chessBoard[1][3] = new Pawn(false);
		chessBoard[1][4] = new Pawn(false);
		chessBoard[1][5] = new Pawn(false);
		chessBoard[1][6] = new Pawn(false);
		chessBoard[1][7] = new Pawn(false);
		chessBoard[6][0] = new Pawn(true);
		chessBoard[6][1] = new Pawn(true);
		chessBoard[6][2] = new Pawn(true);
		chessBoard[6][3] = new Pawn(true);
		chessBoard[6][4] = new Pawn(true);
		chessBoard[6][5] = new Pawn(true);
		chessBoard[6][6] = new Pawn(true);
		chessBoard[6][7] = new Pawn(true);
		chessBoard[7][0] = new Rook(true);
		chessBoard[7][1] = new Knight(true);
		chessBoard[7][2] = new Bishop(true);
		chessBoard[7][3] = new King(true);
		chessBoard[7][4] = new Queen(true);
		chessBoard[7][5] = new Bishop(true);
		chessBoard[7][6] = new Knight(true);
		chessBoard[7][7] = new Rook(true);

		redrawBoard();

	}

	private static void redrawBoard() {
		int i = 0;
		while (true) {
			if (i < 8) {
				System.out.print("  | ");

				int j = 0;
				while (true) {
					if (j < 8) {
						if (chessBoard[i][j] == null) {
							System.out.print("   | ");

						} else System.out.print(chessBoard[i][j].getSymbol() + "  | ");
						j++;
					} else {
						break;
					}
				}

				if (i == 7) {
				} else {
					System.out.println();
				}
				i++;
			} else {
				break;
			}
		}

	}

	private static void movePiece() {
		System.out.println("What piece do you want to move ?");
		int curRow;
		curRow = getRowNumber();
		int curCol;
		curCol = getColumnNumber();
		System.out.println("\nWhere do you wish to move this piece ?");
		int newRow;
		newRow = getRowNumber();
		int newCol;
		newCol = getColumnNumber();
		chessBoard[newRow][newCol] = chessBoard[curRow][curCol];
		chessBoard[curRow][curCol] = null;
	}

	private static void checkValidMoves() {
		int curRow;
		curRow = getRowNumber();
		int curCol;
		curCol = getColumnNumber();
		if (chessBoard[curRow][curCol] != null) {
			System.out.println("The piece at that location is a " + chessBoard[curRow][curCol].getName());
			System.out.println("Valid moves are: ");
			chessBoard[curRow][curCol].getValidMoves(curRow, curCol);
		} else {
			System.out.println("No piece is at the location provided.");
		}
	}

	private static int getRowNumber() {
		int rowNum;
		System.out.println("Valid row numbers are from 1 to 8");
		System.out.print("Enter row number: ");
		rowNum = scanner.nextInt();
		while (true) {
			if (rowNum < 1 || rowNum > 8) {
				System.out.println("Valid row numbers are from 1 to 8");
				System.out.print("Enter row number: ");
				rowNum = scanner.nextInt();
			} else {
				break;
			}
		}

		return rowNum - 1;
	}

	private static int getColumnNumber() {
		int colNum;
		System.out.println("Valid column numbers are from 1 to 8");
		System.out.print("\nEnter column number: ");
		colNum = scanner.nextInt();
		while (true) {
			if (colNum >= 1 && colNum <= 8) {
				break;
			}
			System.out.println("Valid column numbers are from 1 to 8");
			System.out.print("\nEnter column number: ");
			colNum = scanner.nextInt();
		}

		return colNum - 1;
	}

}
