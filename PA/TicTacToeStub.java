/*
ALGORITHM:
I. initialize ALGORITHM:
II.  Display board
III. While no win or tie
     A. player takes a turn
     B. change player
*/


// Author(s): Constance Conner, Ziky Zhang, Shawn Luna, Azeal Riday
// Date of Last Modification: 03/19/2024
// Course: CS111B
// Instructor: C. Conner
// File Name: TicTacToeStub.java
// This program will plays a simplified version of Tic Tac Toe using 2-D array


import java.util.Scanner;

public class TicTacToeStub{
    // board initialization state
    public static char[][] initBoard(int size)
    {
        char[][] board = new char[size][size];
        for (int row = 0; row < board.length; row++){
            for (int column = 0; column < board[0].length; column++){
                board[row][column] = '-';
            }
        }
        return board;
    }

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

    // check for win
    public static boolean isWinning (char currentPlayer, char[][] board) {
        boolean winByRow, winByColumn, winByDiagonal, winByAntiDiagonal;
        int counter;

        // check row
        for (int row = 0; row < board.length; row++){
            winByRow = true;
            for (int column = 0; column < board[0].length; column++){
                if (board[row][column] != currentPlayer){
                    winByRow = false;
                }
            }
            if (winByRow){
                System.out.println("Win by row");
                return winByRow;
            }
        }

        // check column
        for (int column = 0; column < board[0].length; column++){
            winByColumn = true;
            for (int row = 0; row < board.length; row++){
                if (board[row][column] != currentPlayer){
                    winByColumn = false;
                }
            }
            if (winByColumn){
                System.out.println("Win by column");
                return winByColumn;
            }
        }

        // check diagonal
        winByDiagonal = true;
        for(int i = 0; i < board.length; i++){
            if (board[i][i] != currentPlayer){
                winByDiagonal = false;
            }
        }
        if (winByDiagonal){
            return true;
        }

        // check anti-diagonal
        winByAntiDiagonal = true;
        for(int i = 0; i < board.length; i++){
            if (board[i][board[0].length - 1 - i] != currentPlayer){
                winByAntiDiagonal = false;
            }
        }
        if (winByAntiDiagonal){
            return true;
        }

        return false;
    }

    // check for tie
    public static boolean isTie(char currentPlayer, char[][] board){
        // check for unmodified element
        for (int row = 0; row < board.length; row++){
            for (int column = 0; column < board[0].length; column++){
                if (board[row][column] == '-'){
                    System.out.println("Tie - dash found");
                    return false;
                }
            }
        }
        // check for other conditions
        if (isWinning(currentPlayer, board)){
            System.out.println("Tie - win found");
            return false;
        }
        return true;
    }

    ///////  takeTurn  ////////
    // Allow the curPlayer to take a turn.
    // Ask user for row col to play
    // Read user's input and verify that it is a
    // valid move (array element has not been chosen).
    // When a valid move is entered,
    // put it on the board.
    //
    // STEP 5: Check if game is over (YOU WILL WRITE THIS NESTED if/else) below

    public static boolean takeTurn(char thePlayer, char[][] board)
    {
        int row = 0;
        int col = 0;

        boolean isGameOver = false; //do we have a win or a tie

        Scanner scan = new Scanner(System.in);


        System.out.println(thePlayer +  " your turn. Enter row col (0 0 is top left): ");
        // System.out.print("Example 0 0 is top left: ");
        row = scan.nextInt();
        col = scan.nextInt();


        //if array element is not a dash (-) user must choose again
        //as that move is invalid
        while (board[row][col] != '-')
        {
            System.out.println("Invalid entry: Row " + row + " at Column " + col
                            + " already contains: " + board[row][col]);
            System.out.println("Please try again.");
            row = scan.nextInt();
            col = scan.nextInt();
        }

        // Now that input validation loop is finished, put the move on the board:
        board[row][col] = thePlayer;


        /// STEP 5: Check if game is over (YOU WILL WRITE THIS NESTED if/else/if)
        // I. if isWinner
        //    A.  display "You Won!!"
        //   B.  set isGameOver to true
        // else
        //    A'. if isTie
        //          1. display "It's a Tie!"
        //          2. set isGameOver to true
        //         else
        //           1'. set isGameOver to false
        if (isWinning(thePlayer, board)){ // check game status
            System.out.println("You Won!!");
            isGameOver = true;
        } else if (isTie(thePlayer, board)){
            System.out.println("It's a Tie!");
            isGameOver = true;
        }
        return isGameOver;
    }

   ///////  play the game ////////
   //  while game not over
   //  user takes a turn
   //      checks for win or tie
   //  alternate play between player X and O
    public static void main(String [] args)
    {
        char curPlayer = 'X'; //first player is X
        char[][] board;       //tic tac toe board as 2-D array
        boolean gameOver = false;


        board = initBoard(3);
        System.out.println("***LET'S PLAY TIC TAC TOE***");

        /////// beginning of  display board ////////
        // STEP 2: PUT CODE TO DISPLAY INTO A METHOD named display SEE STEP 2 ABOVE
        display(board);
        ///////  end of display board ////////
        ///CALL display METHOD HERE passing board as argument

        //game continues while there is no winner or tie
        while( !gameOver )
        {

        //player makes a move and we check if win or tie
        gameOver = takeTurn(curPlayer, board);

        /////// beginning of  display board ////////
        // STEP 2: REPLACE THIS CODE WIth A CALL TO display METHOD
        //passing board as argument
        display(board);
        ///////  end of display board ///////
        //CALL THE display METHOD HERE



        if(curPlayer == 'X') //change player
            curPlayer = 'O';
            else
            curPlayer = 'X';

        }

    } //end main

}  //end class

