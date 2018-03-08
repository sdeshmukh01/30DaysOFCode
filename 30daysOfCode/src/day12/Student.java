package day12;

/**
 * Created by himu on 3/3/2018.
 */
public class Student extends Person {
    private int[] scores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.scores = scores;
    }

   public  char calculate(){

        int total = 0;
        for(int i =0; i< scores.length; i++){

            total +=scores[i];
        }
        int avg = total/scores.length;
    char res;
       if(avg >= 90) res = 'O';
       else if(avg >= 80) res = 'E';
       else if(avg >= 70) res = 'A';
       else if(avg >= 55) res = 'P';
       else if(avg >= 40) res = 'D';
       else res = 'T';
       return res;
    }
}
