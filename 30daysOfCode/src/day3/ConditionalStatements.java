package day3;

import java.util.Scanner;

/**
 * Created by himu on 3/3/2018.
 */
public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";
        if(n%2==1){
            ans = "Weird";
        }
        else if(n >= 2 && n <5) ans = "Not Weird";

        else if(n>=6 && n<=20) ans = "Weird";
        else if(n > 20) ans = "Not Weird";
        System.out.println(ans);
    }


}
