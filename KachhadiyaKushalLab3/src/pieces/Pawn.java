/*
 * Name - Kushal Kachhadiya
 * Professor - Gustavo Adami
 * Lab - Lab 3(Chess Game)
 * Due - 20 October
 */
package pieces;

public class Pawn extends Piece {

  public Pawn(boolean isBlack) {
    this.isBlack = isBlack;
  }

  @Override
  public void getValidMoves(int row, int col) {
    if (!this.isBlack) {
      switch (row) {
        case 1 -> System.out.println("Valid moves: " + (row + 2) + ", " + (col + 1) + " & "
                + (row + 3) + ", " + (col + 1));
        case 7 -> System.out.println("No moves possible.");
        default -> System.out.println("Valid moves: " + (row + 2) + ", " + (col + 1));
      }
    } else switch (row) {
      case 6 -> System.out.println("Valid moves are: " + (row) + ", " + (col + 1) + " & "
              + (row - 1) + ", " + (col + 1));
      case 0 -> System.out.println("No moves possible.");
      default -> System.out.println("Valid moves: " + (row) + ", " + (col + 1));
    }
  }

  @Override
  public String getSymbol() {
    return !this.isBlack ? "p" : "P";
  }

  @Override
  public String getName() {
    return this.isBlack ? "black pawn" : "white pawn";
  }

}
