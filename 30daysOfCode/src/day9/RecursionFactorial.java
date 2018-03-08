package day9;

import java.util.Scanner;

/**
 * Created by himu on 3/3/2018.
 */
public class RecursionFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
        System.out.println(factorial(n));

    }
    public static int factorial(int n){
        if(n ==0) return 1;
        return n * factorial(n-1);
    }
}
