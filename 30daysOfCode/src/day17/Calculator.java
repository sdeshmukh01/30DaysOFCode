package day17;

/**
 * Created by himu on 3/5/2018.
 */
 class Calculator {


    int power(int n, int p){
        if(n < 0 || p < 0)throw new RuntimeException("n and p should be non-negative");
        return (int)Math.pow(n, p);
    }

}
