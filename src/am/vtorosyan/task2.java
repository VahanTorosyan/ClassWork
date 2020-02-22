package am.vtorosyan;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        int n = 6;
     //   int sum = 1;
        int i = 0;
        while (i <= n) {
            i++;
            if ( i % 2 == 0) {
                continue;
            }
            System.out.println(i);

        }

    }
}
