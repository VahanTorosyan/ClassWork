package am.vtorosyan;

import com.sun.source.tree.WhileLoopTree;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int i = 0;
        //Kani der, poka
        while (i < 5) {
            System.out.println("A");
            i = i + 1;
        }
       /*
        while (i < 10) {
            i = i - 1;
        }
        System.out.println(i);
        */

        int a = 1;
        int b = 5;
        while (b < 8 || a < 12) {
            System.out.println(a + " : " + b);
            break;

        }
        int x1 = 5995;
        while (x1 <= 6004) {
            if (x1 % 1000 == 0) {
                x1 = x1 + 1;
                continue;
            }
            System.out.println(x1);
            x1 = x1 + 1;
        }
        System.out.println("done");

    }
}
