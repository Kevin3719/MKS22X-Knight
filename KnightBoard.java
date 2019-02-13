public class KnightBoard {
    public int[][] board;
    public String toString() {
      String output = "";
      if (board.length == 0) {
        return output;
      }
      for (int i = 0; i < board.length; i++) {
        for ( int j = 0; j < board[0].length; j++) {
          output += board[i][j] + " ";
        }
        output += "\n";
      }
      return outpuhgt;
    }
    public KnightBoard(int startingRows,int startingCols) {
      board = new int[startingRows][startingCols];
    }
    public boolean addKnight(int r, int c, int count, int position) {
      if (postion == 0) {
        if (c - 2 > -1 && r - 1 > -1 && board[r][c] == 0) {
          board[r][c] = count;
          return true;
        }
        else {
          return false;
        }
      if (postion == 1) {
        if (c - 2 > -1 && r - 1 > -1 && board[r][c] == 0) {
          board[r][c] = count;
          return true;
        }
        else {
          return false;
        }
      if (postion == 2) {
        if (c - 1 > -1 && r - 2 > -1 && board[r][c] == 0) {
          board[r][c] = count;
          return true;
        }
          else {
            return false;
          }
      if (postion == 3) {
        if (c + 1 > board.length && r - 2 > -1 && board[r][c] == 0) {
          board[r][c] = count;
          return true;
        }
          else {
            return false;
          }
      if (postion == 4) {
        if (c - 2 > -1 && r - 1 > -1 && board[r][c] == 0) {
          board[r][c] = count;
          return true;
        }
          else {
          return false;
        }
      if (postion == 5) {
        if (c - 2 > -1 && r - 1 > -1 && board[r][c] == 0) {
          board[r][c] = count;
          return true;
        }
          else {
            return false;
        }
      }
      if (postion == 6) {
        if (c - 2 > -1 && r - 1 > -1 && board[r][c] == 0) {
          board[r][c] = count;
          return true;
        }
          else {
            return false;
        }
      }
      if (postion == 7) {
        if (c - 2 > -1 && r - 1 > -1 && board[r][c] == 0) {
          board[r][c] = count;
          return true;
        }
          else {
            return false;
        }
      }
    }
  }
}
}}}}
