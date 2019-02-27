public class KnightBoard {
    public int[][] board;
    public int[][] optimizer;
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
          if (board[i][j] < 10) {
            output += " ";
          }
          output += board[i][j] + " ";
        }
      }
        output += "\n";
      }
      return output;
    }
    public String printchart() {
      String output = "";
      if (optimizer.length == 0) {
        return output;
      }
      for (int i = 0; i < optimizer.length; i++) {
        for ( int j = 0; j < optimizer[0].length; j++) {
          if (optimizer[i][j] == 0) {
            output += "_ ";
          }
          else {
          output += optimizer[i][j] + " ";
        }
      }
        output += "\n";
      }
      return output;
    }
    public void makechart() {
      for (int i = 0; i < optimizer.length;i++) {
        if (i == 0 || i == optimizer.length - 1) {
      for (int j= 0; j < optimizer[0].length;j++) {
        if (j == 0 || j == optimizer[0].length - 1) {
          optimizer[i][j] = 2;
        }
        else if (j == 1 || j == optimizer[0].length - 2) {
          optimizer[i][j] = 3;
        }
        else {optimizer[i][j] = 4;}
      }
      }
      else if (i == 1 || i == optimizer.length - 2) {
        for (int j = 0; j < optimizer[0].length;j++) {
          if (j == 0 || j == optimizer[0].length - 1) {
            optimizer[i][j] = 3;
          }
          else if (j == 1 || j == optimizer[0].length - 2) {
            optimizer[i][j] = 4;
          }
          else {optimizer[i][j] = 6;}
        }
      }
      else{
      for (int j = 0; j < optimizer[0].length;j++) {
        if (j == 0 || j == optimizer[0].length - 1) {
          optimizer[i][j] = 4;
        }
        else if (j == 1 || j == optimizer[0].length - 2) {
          optimizer[i][j] = 6;
        }
        else {optimizer[i][j] = 8;}
        }
        }
      }
    }
    public KnightBoard(int startingRows,int startingCols) {
      board = new int[startingRows][startingCols];
      optimizer = new int[startingRows][startingCols];
      makechart();
    }
    public boolean isGood(int r, int c) {
      return  r >= 0 && c >= 0 && r < board.length && c < board[0].length && board[r][c] == 0;
    }
    public int countSolutions(int row, int col) {
      board[row][col] = 1;
      return helpcount(row,col,0,1);
    }
    public int helpcount(int row, int col, int count, int counter){
      int addrow = 0;
      int addcol = 0;
        if (counter == board.length * board[0].length) {
          return 1;
        }
      for (int i = 0; i < 8;  i+= 1) {
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
      public boolean solve(int row, int col) {
        board[row][col] = 1;
        if (help(row,col,0,1)) {
          return true;
        }
        board[row][col] = 0;
        return false;
      }
      public boolean help(int row, int col, int count, int counter){
        if (count > 0) {
          return true;
        }
        if (counter == board.length * board[0].length) {
          return true;
        }
        int addrow = 0;
        int addcol = 0;
        int[] movescount = new int[8];
        int[] lowest = new int[8];
        for (int i = 0; i < 8; i++) {
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
            optimizer[row + addrow][col + addcol] -= 1;
            movescount[i] = optimizer[row + addrow][col + addcol];
          }
          else {
            movescount[i] = 0;
          }
        }
        int smallest = movescount[0];
        int index = 0;
        for (int i = 0; i < 8; i++) {
          smallest = movescount[0];
          index = 0;
          for (int j = 0; j < 8; j++) {
          if (movescount[j] < smallest) {
            index = j;
            smallest = movescount[j];
          }
        }
        lowest[i] = index;
        movescount[index] = 99;
         }

        for (int j = 0; j < 8; j += 1) {
          int i = lowest[j];
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
            if (help(row + addrow, col + addcol, count, counter + 1)) {
              count += 1;
              return help(row, col, count, counter);
            }
            board[row + addrow][col + addcol] = 0;
          }
        }
          for (int i = 0; i < 8; i++) {
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
              optimizer[row + addrow][col + addcol] += 1;
            }
          }
          return false;
        }


    }
