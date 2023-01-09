/*
 * Name - Kushal Kachhadiya
 * Professor - Gustavo Adami
 * Lab - Lab 3(Chess Game)
 * Due - 20 October
 */
package pieces;

public class King extends Piece {

  public King(boolean isBlack) {
    this.isBlack = isBlack;
  }

  @Override
  public void getValidMoves(int row, int col) {
    System.out.println("Invalid Move");
  }

  @Override
  public String getSymbol() {
    return !this.isBlack ? "k" : "K";
  }

  @Override
  public String getName() {
    return this.isBlack ? "black king" : "white king";
  }

}
