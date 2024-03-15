// Author: Ziky Zhang
// Last Modification: Mar.14th
// Course: CS111B
// File Name: ticTacToe_zver.java

import java.util.*;

public class TicTacToeZver{
    static Scanner scanner = new Scanner(System.in);

    public static char[][] initboard(int size) {
        System.out.print("Board size: ");
        size = scanner.nextInt();
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

    public static boolean winByRow(char move, char[][] board){
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[0].length; column++){
                if (board[row][column] != move){
                    break;
                } else if (board[row][board[0].length] == move){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean winByColumn(char move, char[][] board){
        for(int column = 0; column < board[0].length; column++){
            for(int row = 0; row < board.length; row++){
                if (board[row][column] != move){
                    break;
                } else if (board[board.length][column] == move){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean winByDiagonal(char move, char[][] board){
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[0].length; column++){
                if (board[row][column] != move){
                    break;
                } else if (board[board.length][board[0].length] == move){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean winByAntiDiagonal(char move, char[][] board){
        for(int row = (board.length - 1); row < board.length; row--){
            for(int column = 0; column < board[0].length; column++){
                if (board[row][column] != move){
                    break;
                } else if (board[0][board[0].length] == move){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWinning(char move, char[][] board){
        if (winByRow(move, board) ||
            winByColumn(move, board) ||
            winByDiagonal(move, board) ||
            winByAntiDiagonal(move, board)){
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

    public static boolean isTie(char move, char[][] board){
        if (!haveDash(board) ||
            !isWinning(move, board) ||
            !isWinning(move, board)){
            return true;
        }
        return false;
    }






    public static void main(String[] args) {
        System.out.println("Hello, world");
    }
}
