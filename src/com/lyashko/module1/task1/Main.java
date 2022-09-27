package com.lyashko.module1.task1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main ( String[] args ) {
        int[] arr = new int[10];
        fillArray ( arr );
        System.out.println ( Arrays.toString ( arr ) );
        System.out.println ( foundUniqueElement ( arr ) );
    }

    public static void fillArray(int[] arr) {
        Random random = new Random ( );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt ( 5 );
        }
    }

    public static int foundUniqueElement (int[] arr) {
        int count = 0;
        search:
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (temp == arr[j])
                    continue search;
            }
            count++;
        }
        return count;
    }
}
