/**
 * Integer Counting program
 * @author Sean Wunderlich
 * ITSE 1302-011
 * Exercise 18
 */

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class IntegerCounter {
    /**
     *
     * @param args
     */
    public static void main (String[] args) {
        //Establish scanner and int called intInteger which can be between 0 and 50
        Scanner scan = new Scanner (System.in);
        int[] intInteger = new int[51];

        System.out.println("Enter integers >= 0 and <= 50 [enter -1 to quit]: ");
        int intNumber = scan.nextInt();

        //While the entry is not -1, >= 0 and <= 50 add to the count
        while (intNumber != -1 && intNumber >= 0 && intNumber <= 50) {
            intInteger[intNumber]++;
            intNumber = scan.nextInt();
        }
        //When the index is 0 and <= 50 add to the count
        for (int index = 0 ; index<=50 ; index++) {
            if (intInteger[index] > 0) {
                System.out.println(index+ " : " + intInteger[index]);
            }
        }
    }
}
