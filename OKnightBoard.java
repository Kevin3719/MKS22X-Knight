public class KnightBoard{
  public int[][] board;
  public KnightBoard(int row, int col) {
    board = new int[row][col];
    crow = 0;
    ccol = 0;
  }
  public boolean addKnight(int position, int count) {
    if (position == 0) {
      if (crow - 2 > -1 && c - 1 > -1 && board[r][c] == 0) {
        board[r][c] = count;
        return true;
      }
      }
    if (position == 1) {
      if (r - 2 > -1 && c + 1 < board[0].length && board[r][c] == 0) {
        board[r][c] = count;
        return true;
      }
    }
    if (position == 2) {
      if (r - 1 > -1 && c + 2 < board[0].length && board[r][c] == 0) {
        board[r][c] = count;
        return true;
      }
    }
    if (position == 3) {
      if (r + 1 < board.length && c + 2 < board[0].length && board[r][c] == 0) {
        board[r][c] = count;
        return true;
      }
        }
    if (position == 4) {
      if (r + 2 < board.length && c + 1 < board[0].length && board[r][c] == 0) {
        board[r][c] = count;
        return true;
          }
          }
    if (position == 5) {
      if (r + 2 < board.length && c - 1 > -1 && board[r][c] == 0) {
        board[r][c] = count;
        return true;
          }
            }
    if (position == 6) {
      if (r + 1 < board.length && c - 2 > -1 && board[r][c] == 0) {
        board[r][c] = count;
        return true;
        }
      }
      if (position == 7) {
          if (r -1  > -1 && c - 2 > -1 && board[r][c] == 0) {
            board[r][c] = count;
            return true;
        }
      }
          return false;
      }






}
