package JavaBasics;

import java.util.Scanner;

public class A4_Loops {

    public static void testIfElse() {
        if (10 == 10) {
            System.out.println("jan");
        } else {
            System.out.println("feb");
        }
    }

    public static void testElseIf() {
        String day = "Wednesday";
        if (day.equalsIgnoreCase("monday")) {
            System.out.println("mon");
        } else if (day.equalsIgnoreCase("tuesday")) {
            System.out.println("tue");
        } else if (day.equalsIgnoreCase("wednesday")) {
            System.out.println("wed");
        } else {
            System.out.println("weekend");
        }
    }

    public static void testSwitch() {
        System.out.println("Enter the month");
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();

        //String month = "mar";

        switch (month) {
            case "jan":System.out.println("Its Jan"); break;
            case "feb": System.out.println("Its feb");break;
            case "mar":
                System.out.println("Its mar");
                break;
            case "apr":
                System.out.println("Its apr");
                break;
            case "may":
                System.out.println("Its may");
                break;
            case "jun":
                System.out.println("Its Jun");
                break;
            case "jul":
                System.out.println("Its Jul");
                break;
            case "aug":
                System.out.println("Its aug");
                break;
            case "sep":
                System.out.println("Its sep");
                break;
            default:
                System.out.println("pls enter correct month");
        }
    }


    public static void testSwitchInt() {
        int month = 1;

        switch (month) {
            case 1:
                System.out.println("Its Jan");
                break;
            case 2:
                System.out.println("Its feb");
                break;
            case 3:
                System.out.println("Its mar");
                break;
            default:
                System.out.println("pls enter correct month");
        }
    }

    public static void testWhileLoop() {
        int i = 10;
        while (i <= 15) {
            System.out.println("i is still smaller than 15: " + i);
            i++;
        }
        System.out.println("out of loop");
    }

    public static void testDoWhileLoop() {
        int i = 10;
        do {
            System.out.println("i is equal to :" + i);
            i--;
        } while (i > 6);
        System.out.println("out of loop");
    }

    public static void testForLoop() {
        int age = 10;

        for (int i = 5; i <= age; i++) {
            System.out.println("inside loop" + i);
        }
        System.out.println("out of for loop");

    }

    public static void testForEach() {
        int arr[] = {12, 13, 14, 44, 66};

        for (int x : arr) {
            System.out.println(" " + x);
        }

        for (int i=0; i < arr.length; i++){
            System.out.println(" " + arr[i]);
        }
        System.out.println(" end");

    }


    //4  not100        leap year e.g 2012
    //4  100  400      leap yr   2000
    //4  100  not400   not a leap year  1900
    public static void leapyear() {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("this is a leap year");
        } else {
            System.out.println("this is not a leap year");

        }
    }

    public static void typeofWebsite() {

        String str = ".com";

        if (str == ".com") {
            System.out.println("This is Commercial Website");
        } else if (str == ".org") {
            System.out.println("This is Organizational Website");
        } else if (str == ".in") {
            System.out.println("This is Indian Website");
        }
    }

    public static void rockPaperScissor() {

        System.out.println("Enter your option: rock, paper, scissor");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if ((a.equals("rock") && b.equals("paper")) || (a.equals("paper") && b.equals("rock"))) {
            System.out.println("the rock is winner");
        } else if ((a.equals("scissor") && b.equals("paper")) || (a.equals("paper") && b.equals("scissor"))) {
            System.out.println("the scissor is winner");
        } else if ((a.equals("scissor") && b.equals("rock")) || (a.equals("rock") && b.equals("scissor"))) {
            System.out.println("the rock is winner");
        } else if (a.equals(b)) {
            System.out.println("its a tie");
        } else {
            System.out.println("pls enter correct options");
        }

    }


    public static void main(String[] args) {
        //testIfElse();
        //testElseIf();
        testSwitch();
        //testSwitchInt();
        //testWhileLoop();
        //testDoWhileLoop();
        //testForLoop();
        //testForEach();
        // leapyear();
        //typeofWebsite();
        //rockPaperScissor();

    }

}
