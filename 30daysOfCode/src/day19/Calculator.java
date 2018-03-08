package day19;

/**
 * Created by himu on 3/5/2018.
 */
 class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for(int i =1; i<= n/2; i++){

            if(n %i ==0) sum+=i;

        }
        return sum+n;
    }
}
