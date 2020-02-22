package am.vtorosyan;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum = sum +i;
            i = i + 1;
        }
        System.out.println(sum);
        int x = 5;
        int y = 6;
        x = x + y;
        x += y;
        x *=y;

        int x1;
        int x2;

        do {
            sum = sum +i;
            i = i + 1;
        }while (i <= n);

    }
}
