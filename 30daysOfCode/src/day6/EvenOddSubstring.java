package day6;

import java.util.Scanner;

/**
 * Created by himu on 3/3/2018.
 */
public class EvenOddSubstring {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i =0; i < n; i++){
            StringBuilder evenBuilder = new StringBuilder();
            StringBuilder oddBuilder = new StringBuilder();
            String s = in.next();
            char[] chars = s.toCharArray();
            for(int j =0; j < chars.length; j++){
                if(j == 0 || j%2 ==0){
                    evenBuilder.append(chars[j]);
                }
                else{
                    oddBuilder.append(chars[j]);
                }
            }
            System.out.println(evenBuilder.toString()+" "+oddBuilder.toString());
        }

    }
}
