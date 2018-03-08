package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by himu on 3/3/2018.
 */
public class MapOps {

    public static void main(String[] args) {
        Map<String, Integer> dictonary = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            dictonary.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(dictonary.get(s) != null){
                System.out.println(s+"="+dictonary.get(s));
            }
            else System.out.println("Not found");
        }
        in.close();
    }
}
