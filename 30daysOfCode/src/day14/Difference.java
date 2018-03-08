package day14;

import java.util.Arrays;

/**
 * Created by himu on 3/3/2018.
 */
public class Difference {

    private int [] elements;

    private int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference(){
        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1] - elements[0];
    }
}
