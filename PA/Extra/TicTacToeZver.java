// Author: Ziky Zhang
// Last Modification: Mar.14th
// Course: CS111B
// File Name: TicTacToeZver.java

import java.util.*;

public class TicTacToeZver{
    static Scanner scanner = new Scanner(System.in);

    public static char[][] initboard() {
        System.out.print("Board size: ");
        int size = scanner.nextInt();
        char[][] board = new char[size][size];
        return board;
    }

    public static void display(char[][] board){
        for (int row = 0; row < board.length; row++){
            System.out.println("---------");
            for (int column = 0; column < board[0].length; column++){
                System.out.print(" " + board[row][column]);
            }
        }
        System.out.println("---------");
        System.out.println();
    }

    public static boolean winByRow(char currentPlayer, char[][] board){
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[0].length; column++){
                if (board[row][column] != currentPlayer){
                    break;
                } else if (board[row][board[0].length] == currentPlayer){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean winByColumn(char currentPlayer, char[][] board){
        for(int column = 0; column < board[0].length; column++){
            for(int row = 0; row < board.length; row++){
                if (board[row][column] != currentPlayer){
                    break;
                } else if (board[board.length][column] == currentPlayer){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean winByDiagonal(char currentPlayer, char[][] board){
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[0].length; column++){
                if (board[row][column] != currentPlayer){
                    break;
                } else if (board[board.length][board[0].length] == currentPlayer){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean winByAntiDiagonal(char currentPlayer, char[][] board){
        for(int row = (board.length - 1); row < board.length; row--){
            for(int column = 0; column < board[0].length; column++){
                if (board[row][column] != currentPlayer){
                    break;
                } else if (board[0][board[0].length] == currentPlayer){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWinning(char currentPlayer, char[][] board){
        if (winByRow(currentPlayer, board) ||
            winByColumn(currentPlayer, board) ||
            winByDiagonal(currentPlayer, board) ||
            winByAntiDiagonal(currentPlayer, board)){
            return true;
        }
        return false;
    }

    public static boolean haveDash(char[][] board) {
        for (int row = 0; row < board.length; row++){
            for (int column = 0; column < board[0].length; column++){
                if (board[row][column] == '-'){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isTie(char currentPlayer, char[][] board){
        if (!haveDash(board) ||
            !isWinning(currentPlayer, board) ||
            !isWinning(currentPlayer, board)){
            return true;
        }
        return false;
    }

    public static boolean takeTurn(char currentPlayer, char[][] board){
        int row = 0;
        int column = 0;
        boolean isGameOver = false;

        do { // check validity of the coordinate player choose
            System.out.println(currentPlayer + ", this is your turn. Enter row col (0 0 is top left)");
            System.out.println("Seeing this message again means you have chosen a invalid coordinate.");
            row = scanner.nextInt();
            column = scanner.nextInt();
        } while (board[row][column] != '-');

        board[row][column] = currentPlayer;

        if (isWinning(currentPlayer, board)){ // check game status
            System.out.println("You have won! Congrats!");
            isGameOver = true;
        } else if (isTie(currentPlayer, board)){
            System.out.println("You have reach a tie situation, the game is over");
            isGameOver = true;
        }
        return isGameOver;
    }

    public static void main(String[] args) {
        char mainCurrentPlayer = 'X';
        char[][] mainBoard = initboard();
        boolean mainGameOver = false;

        // display board
        System.out.println("Time to play some Tic Tac Toe!");
        while (!mainGameOver){
            mainGameOver = takeTurn(mainCurrentPlayer, mainBoard);
            display(mainBoard);

            // switch player
            if (mainCurrentPlayer == 'X'){
                mainCurrentPlayer = 'O';
            } else {
                mainCurrentPlayer = 'X';
            }
        }
    }
}
