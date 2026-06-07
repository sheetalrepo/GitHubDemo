package JavaBasics;

import java.util.Scanner;

public class A2_Scanner {


    public static void testScanner1() {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these number is = " + sum);
    }

//    public static void practiceScanner(){
//        System.out.println("take inputs from user");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number 1");
//        int a = sc.nextInt();
//        System.out.println("enter number 2");
//        int b= sc.nextInt();
//        int sum= a+b;
//        System.out.println("the sum of these numbers is =" + sum);
//
//    }
//





    public static void testScanner2() {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str);
    }

    public static void classPercentage() {
        System.out.println("counting percentage ");
        Scanner sc = new Scanner(System.in);
        float math = sc.nextFloat();
        float eng = sc.nextFloat();
        float sci = sc.nextFloat();
        float hindi = sc.nextFloat();
        float history = sc.nextFloat();

        float sum = math + eng + sci + hindi + history;
        System.out.println("The sum of these numbers are = " + sum);
        System.out.println(" Your percentage is = " + sum / 500 * 100);

    }

    public static void passFail() {

        System.out.println("Enter your marks in math");
        Scanner sc = new Scanner(System.in);
        float math = sc.nextFloat();

        System.out.println("Enter your marks in sci");
        float sci = sc.nextFloat();

        System.out.println("Enter your marks in eng");
        float eng = sc.nextFloat();

        float Avg = (math + sci + eng) / 3;
        System.out.println("Avg of your marks : " + Avg);

        if (math >= 33 && sci >= 33 && eng >= 33 && Avg >= 40) {
            System.out.println("Congratulations, you are pass");
        } else {
            System.out.println("Oops,Sorry you are fail. Try again");
        }
    }


    public static void main(String[] args) {

        testScanner1();
        //testScanner2();
        // classPercentage();
        //passFail();
        //practiceScanner();


    }


}
