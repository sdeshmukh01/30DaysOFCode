package day21;

/**
 * Created by himu on 3/5/2018.
 */
public class Printer {

    public <T> void printArray(T[] arr){

        for(T t : arr){
            System.out.println(t);
        }

    }
}
