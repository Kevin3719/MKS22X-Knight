public class KnightBoard {
    public int[][] board;
    public String toString() {
      String output = "";
      if (board.length == 0) {
        return output;
      }
      for (int i = 0; i < board.length; i++) {
        for ( int j = 0; j < board[0].length; j++) {
          if (board[i][j] == 0) {
            output += "_ ";
          }
          else {
          output += board[i][j] + " ";
        }
      }
        output += "\n";
      }
      return output;
    }
    public KnightBoard(int startingRows,int startingCols) {
      board = new int[startingRows][startingCols];
    }
    public boolean addKnight(int r, int c, int count, int position) {
      if (position == 0) {
        if (r - 2 > -1 && c - 1 > -1 && board[r][c] == 0) {
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
      public boolean remvoeKnight(int r, int c, int count, int position) {
        if (position == 0) {
          if (r - 2 > -1 && c - 1 > -1 && board[r][c] != 0) {
            board[r][c] = 0;
            return true;
          }
          }
        if (position == 1) {
          if (r - 2 > -1 && c + 1 < board[0].length && board[r][c] != 0) {
            board[r][c] = 0;
            return true;
          }
        }
        if (position == 2) {
          if (r - 1 > -1 && c + 2 < board[0].length && board[r][c] != 0) {
            board[r][c] = 0;
            return true;
          }
        }
        if (position == 3) {
          if (r + 1 < board.length && c + 2 < board[0].length && board[r][c] != 0) {
            board[r][c] = 0;
            return true;
          }
            }
        if (position == 4) {
          if (r + 2 < board.length && c + 1 < board[0].length && board[r][c] != 0) {
            board[r][c] = 0;
            return true;
              }
              }
        if (position == 5) {
          if (r + 2 < board.length && c - 1 > -1 && board[r][c] != 0) {
            board[r][c] = 0;
            return true;
              }
                }
        if (position == 6) {
          if (r + 1 < board.length && c - 2 > -1 && board[r][c] != 0) {
            board[r][c] = 0;
            return true;
            }
          }
          if (position == 7) {
              if (r -1  > -1 && c - 2 > -1 && board[r][c] != 0) {
                board[r][c] = 0;
                return true;
            }
          }
              return false;
          }



































      }
