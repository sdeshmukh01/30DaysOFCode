package day16;

import java.util.Scanner;

/**
 * Created by himu on 3/5/2018.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        try {
            Integer i = Integer.valueOf(S);
            System.out.println(i);
        }catch (NumberFormatException nfe){
            System.out.println("Bad String");
        }
    }
}
