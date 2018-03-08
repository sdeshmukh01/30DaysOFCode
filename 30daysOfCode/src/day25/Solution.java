package day25;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            int nbr = scanner.nextInt();
            String message = null;
            if (nbr == 1 || nbr % 2 == 0) {
                System.out.println("Not prime");
                continue;
            }

            for (int j = 3; j < nbr / 2; j += 2) {

                if (nbr == 1 || nbr % j == 0) {
                    message = "Not prime";
                    break;
                }

            }
            if (message == null) {
                message = "Prime";
            }
            System.out.println(message);


        }

    }
}
