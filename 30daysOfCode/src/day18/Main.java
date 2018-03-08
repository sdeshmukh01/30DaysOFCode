package day18;

import java.util.Scanner;

/**
 * Created by himu on 3/5/2018.
 */
public class Main {

    Solution solution = new Solution();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        scanner.close();

        char[] s = in.toCharArray();
        Solution p = new Solution();

        for(Character c : s){
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        boolean isPalindrome = true;

        for(int i = 0; i < s.length/2; i++){
            if(p.popCharacter() != p.dequeueCharacter()){
            isPalindrome = false;
            break;
            }
        }
        System.out.println( "The word, " + in + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );

    }
}
