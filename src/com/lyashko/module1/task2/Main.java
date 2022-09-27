package com.lyashko.module1.task2;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        int startRow;
        int startColumn;
        int finalRow;
        int finalColumn;

        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter start row: " );
        startRow = scanner.nextInt ( );
        System.out.println ( "Enter start column: " );
        startColumn = scanner.nextInt ( );
        System.out.println ( "Enter final row: " );
        finalRow = scanner.nextInt ( );
        System.out.println ( "Enter final column: " );
        finalColumn = scanner.nextInt ( );

        findPossibleMove ( startRow, startColumn, finalRow, finalColumn );
    }

    public static void findPossibleMove ( int startRow , int startColumn ,
                                          int finalRow , int finalColunm ) {
        int resX = Math.abs ( startRow - finalRow );
        int resY = Math.abs ( startColumn - finalColunm );
        if (resX == 1 && resY == 2 || resX == 2 && resY == 1 ) {
            System.out.println ("yes" );
        } else {
            System.out.println ("no" );
        }
    }
}