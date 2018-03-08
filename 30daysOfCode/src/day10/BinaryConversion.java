package day10;

import java.util.Scanner;

/**
 * Created by himu on 3/3/2018.
 */
public class BinaryConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        boolean consecutive = false;
        int count = 0, maxCount = 0;
        for(int i =0; i < chars.length; i++){
            if( count > maxCount) maxCount = count;
            if(chars[i] == '1'){
                if(!consecutive)consecutive = true;
                count++;
            }
            else if(chars[i] == '0'){
                if (consecutive) consecutive = false;
                if(count > 0) count =0;
            }

        }
        if( count > maxCount) maxCount = count;
        System.out.println(maxCount);
    }


}
