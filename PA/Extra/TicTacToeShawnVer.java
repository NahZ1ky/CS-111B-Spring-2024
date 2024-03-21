import java.util.Scanner;

public class TicTacToeShawnVer
{
  ///////  STEP 1: initialize board ////////
  // board will be size x size array
  // use a nested for-loop to initialize/assign
  // each element to a dash '-'


    public static char[][] initBoard(int size) {
        char[][] board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
        return board;
    }

  ///////  STEP 2: display board ////////
  // Display the current status of the board on the
  // screen using nested for-loop to display each element
  // and using underscores (_) to separate rows
  //PUT YOUR CODE FOR display Here

    public static void display(char[][] board) {
        System.out.println("\n_______");
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                System.out.print(board[row][column] + "  ");
            }
            System.out.println();
            System.out.println("_______");
        }
        System.out.println();
    }

  ///////  STEP 3: check for win ////////
  // check 3 rows, 3 columns, 2 diagonals
  // return true if we have a winner


    public static boolean winByRow(char currentPlayer, char[][] board){
        for(int row = 0; row < board.length; row++){
            boolean win = true;
            for(int column = 0; column < board[0].length; column++){
                if (board[row][column] != currentPlayer){
                    win = false;
                }
            }
            if (win){
                return win;
            }
        }
        return false;
    }

    public static boolean winByColumn(char currentPlayer, char[][] board){
        for(int column = 0; column < board[0].length; column++){
            boolean win = true;
            for(int row = 0; row < board.length; row++){
                if (board[row][column] != currentPlayer){
                    win = false;
                }
            }
            if (win){
                return win;
            }
        }
        return false;
    }

    public static boolean winByDiagonal(char currentPlayer, char[][] board){
        for(int i = 0; i < board.length; i++){
            if (board[i][i] != currentPlayer){
                return false;
            }
        }
        return true;
    }

    public static boolean winByOppDiagonal(char currentPlayer, char[][] board){
        for(int i = 0; i < board.length; i++){
            if (board[i][board.length - 1 -i] != currentPlayer){
                return false;
            }
        }
        return true;
    }

 ///////  STEP 4: check for tie ////////
 // check each element in board
 // if any element is not a dash (-) tie is false

    public static boolean isTie(char[][] playerTie) {
        for (int i = 0; i < playerTie.length; i++) {
            for (int j = 0; j < playerTie[i].length; j++) {
                if (playerTie[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isWinner(char move, char [][] board)
    {
        boolean win = false;
        if (!win){ // for row
            for (int i = 0; i < board.length; i++){
                char initial = board[i][0];
                for (int j = 1; j < board.length; j++){
                    if (initial != board[i][j]){
                    } else if ((initial == board[i][2]) && (initial == move)){
                        win = true;
                        return true;
                    }
                }
            }
        } if (!win){ // for column
            for (int j = 0; j < board.length; j++){
                char initial = board[0][j];
                for (int i = 1; i < board.length; i++){
                    if (initial != board[i][j]){
                    } else if ((initial == board[2][j]) && (initial == move)){
                        win = true;
                        return true;
                    }
                }
            }
        } if (!win){ // diagonal going \
            for (int i = 0; i < 3; i++){
                char initial = board[0][0];
                if (initial != board[1][1]){
                } else if ((initial == board[2][2]) && (initial == move)){
                    win = true;
                    return true;
                }
            }
        } if (!win){ // diagonal going /
            if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) && board[0][2] == move){
                win = true;
                return true;
            }
        }
        return false;
    }

  ///////  takeTurn  ////////
  // Allow the curPlayer to take a turn.
  // Ask user for row col to play
  // Read user's input and verify that it is a
  // valid move (array element has not been chosen).
  // When a valid move is entered,
  // put it on the board.
  //

    public static boolean takeTurn(char thePlayer, char[][] board) {
        int row = 0;
        int column = 0;
        boolean isGameOver = false;

        Scanner scan = new Scanner(System.in);

        System.out.println(thePlayer + ", this is your turn. Enter row col (0 0 is top left)");
        row = scan.nextInt();
        column = scan.nextInt();

        while (row < 0 || row >= board.length || column < 0 || column >= board[row].length || board[row][column] != '-') {
            System.out.println("Invalid entry: Row " + row + " at Column " + column +  " already contains: " + board[row][column]);
            row = scan.nextInt();
            column = scan.nextInt();
        }

        board[row][column] = thePlayer;

        if (isWinner(thePlayer, board)) {
            System.out.println(thePlayer + " You won!");
            isGameOver = true;
        } else if (isTie(board)) {
            System.out.println("It's a tie!!");
            isGameOver = true;
        }
        scan.close();
        return isGameOver;
}


   ///////  play the game ////////
   //  while game not over
   //  user takes a turn
   //      checks for win or tie
   //  alternate play between player X and O

    public static void main(String[] args) {
        char curPlayer = 'X';
        char[][] board;
        boolean gameOver = false;

        board = initBoard(3);
        System.out.println("*** LET'S PLAY TIC TAC TOE ***");

        display(board);

        while (!gameOver) {
            gameOver = takeTurn(curPlayer, board);
            display(board);
            curPlayer = (curPlayer == 'X') ? 'O' : 'X';
        }
    }


}  //end class
