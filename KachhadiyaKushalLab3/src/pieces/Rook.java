/*
 * Name - Kushal Kachhadiya
 * Professor - Gustavo Adami
 * Lab - Lab 3(Chess Game)
 * Due - 20 October
 */
package pieces;

public class Rook extends Piece {

  public Rook(boolean isBlack) {
    this.isBlack = isBlack;
  }

  @Override
  public void getValidMoves(int row, int col) {

    System.out.println("Valid moves: ");
    int i=0;
    if (i >= 8) {
    } else do {
      if (i == row) {
      } else System.out.print((i + 1) + "," + (col + 1) + " ");
      i++;
    } while (i < 8);

    System.out.print(" & ");

    int j=0;
    if (j < 8) {
      do {
        if (j != col) System.out.print((row + 1) + "," + (j + 1) + " ");
        j++;
      } while (j < 8);
    }
  }

  @Override
  public String getSymbol() {
    return !this.isBlack ? "r" : "R";
  }

  @Override
  public String getName() {
    return this.isBlack ? "black rook" : "white rook";
  }

}
