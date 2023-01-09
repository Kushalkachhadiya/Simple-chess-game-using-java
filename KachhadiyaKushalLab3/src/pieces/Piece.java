/*
 * Name - Kushal Kachhadiya
 * Professor - Gustavo Adami
 * Lab - Lab 3(Chess Game)
 * Due - 20 October
 */
package pieces;

public abstract class Piece {

  protected boolean isBlack;

  public abstract void getValidMoves(int row, int col);

  public abstract String getSymbol();

  public abstract String getName();
}
