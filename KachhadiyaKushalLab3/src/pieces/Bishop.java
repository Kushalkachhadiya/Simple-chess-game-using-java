/*
 * Name - Kushal Kachhadiya
 * Professor - Gustavo Adami
 * Lab - Lab 3(Chess Game)
 * Due - 20 October
 */
package pieces; 

import static java.lang.System.*;

public class Bishop extends Piece {

  public Bishop(boolean isBlack) {
    this.isBlack = isBlack;
  }

  @Override
  public void getValidMoves(int row, int col) {
    out.println("Invalid Move");
  }

  @Override
  public String getSymbol() {
    return !this.isBlack ? "b" : "B";
  }

  @Override
  public String getName() {
    return this.isBlack ? "black bishop" : "white bishop";
  }
}
