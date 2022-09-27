package com.lyashko.module1.task2;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        int row = 8;
        int column = 8;
        String[][] chessBoard = new String[row][column];
        createBoard ( chessBoard );
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter start position: " );
        String startPos = scanner.nextLine ( );
        System.out.println ( "Enter final position: " );
        String finalPos = scanner.nextLine ( );
        findPossibleMove ( chessBoard, startPos, finalPos );
    }

    public static String chessBoardCoord ( int row , int column ) {
        String letters = "ABCDEFGH";
        String numbers = "87654321";
        return ( Character.toString ( letters.charAt ( row ) ) + numbers.charAt ( column ) );
    }

    public static void createBoard ( String[][] chessBoard ) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if (( i + j ) % 2 == 0) chessBoard[i][j] = chessBoardCoord ( j , i );
                else chessBoard[i][j] = chessBoardCoord ( j , i );
            }
        }
        for (String[] strings : chessBoard) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print ( " " + strings[j] + " " );
            }
            System.out.println ( );
        }
    }

    public static void findPossibleMove ( String[][] chessBoard , String startPos , String finalPos ) {
        int startRow = 0;
        int startColumn = 0;
        int finalRow = 0;
        int finalColumn = 0;

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if (startPos.equals ( chessBoard[i][j] )) {
                    startRow = i;
                    startColumn = j;
                } else if (finalPos.equals ( chessBoard[i][j] )) {
                    finalRow = i;
                    finalColumn = j;
                }
            }
        }
        int resX = Math.abs ( startRow - finalRow );
        int resY = Math.abs ( startColumn - finalColumn );
        if (resX == 1 && resY == 2 || resX == 2 && resY == 1) {
            System.out.println ( "move is possible" );
        } else {
            System.out.println ( "impossible move" );
        }
    }
}