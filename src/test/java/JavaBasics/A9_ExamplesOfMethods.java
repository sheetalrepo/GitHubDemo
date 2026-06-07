package JavaBasics;

import java.util.Scanner;

public class A9_ExamplesOfMethods {

    public static void tableOfNumbers() {
        System.out.println("Enter your Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

    public static void printPattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    public static void printPattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j>= i ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //tableOfNumbers();
       // printPattern1();
        printPattern2();
    }
}
