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
    public boolean isGood(int r, int c) {
      return  r >= 0 && c >= 0 && r < board.length && c < board.length && board[r][c] == 0;
    }
    public int count() {
      board[0][0] = 1;
      return helpcount(0,0,0,1);
    }
    public int helpcount(int row, int col, int count, int counter){
      int addrow = 0;
      int addcol = 0;
      if (counter == board.length * board[0].length) {
        return 1;
      }
      for (int i = 0; i < 8; i += 1) {
        if (i == 0) {
          addrow = -1;
          addcol = -2;
        }
        if (i == 1) {
          addrow = -2;
          addcol = -1;
        }
        if (i == 2) {
          addrow = -2;
          addcol = 1;
        }
        if (i == 3) {
          addrow = -1;
          addcol = 2;
        }
        if (i == 4) {
          addrow = 1;
          addcol = 2;
        }
        if (i == 5) {
          addrow = 2;
          addcol = 1;
        }
        if (i == 6) {
          addrow = 2;
          addcol = -1;
        }
        if (i == 7) {
          addrow = 1;
          addcol = -2;
        }
        if (isGood(row + addrow, col + addcol)) {
          board[row + addrow][col + addcol] = counter + 1;
          count += helpcount(row + addrow, col + addcol, 0, counter + 1);
          board[row + addrow][col + addcol] = 0;
        }
        }
        return count;
      }


    }
