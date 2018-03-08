package day20;

import java.util.Scanner;

/**
 * Created by himu on 3/5/2018.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int swapped = 0;
       for(int i =0; i < a.length; i++){

            for(int j = 0; j < a.length-1; j++){

                if(a[j+1] < a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    swapped++;
                }

            }
            if(swapped ==0)break;
       }

        System.out.println("Array is sorted in "+swapped+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }
}
