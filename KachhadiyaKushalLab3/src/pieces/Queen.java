/*
 * Name - Kushal Kachhadiya
 * Professor - Gustavo Adami
 * Lab - Lab 3(Chess Game)
 * Due - 20 October
 */
package pieces;

public class Queen extends Piece {

  public Queen(boolean isBlack) {
    this.isBlack = isBlack;
  }

  @Override
  public void getValidMoves(int row, int col) {
    System.out.println("Invalid Move");
  }

  @Override
  public String getSymbol() {
    return !this.isBlack ? "q" : "Q";
  }

  @Override
  public String getName() {
    return this.isBlack ? "black queen" : "white queen";
  }

}
