package JavaBasics;

// Format Code = Cntrl Alt Shift L
import java.util.Scanner;

public class A1_Basics {

    private static float b;

    public static void testSum() {
        int age1 = 34;
        int age2 = 45;

        int sum = age1 + age2;
        System.out.println("the sum of all ages = " + sum);

        System.out.printf("the sum of %d and %d is %d", age1, age2, sum);
        System.out.println("");
        System.out.println("the sum of "+ age1 + " and " + age2 + " is "+ sum);
    }

    public static void testConcat() {
        //Set1
        String str = "10" + 10 + 20 + 30;
        System.out.println(str);

        //Set2
        int a = 10;
        int b = 20;
        int c = 30;
        int sum = a + b+ c;

        String str1 = "10" + sum;
        System.out.println("Sum is = " + sum);


        //Set3
        String str2 = "20";
        String newSum = str2 + 100;
        System.out.println(newSum);

        
        //Set4
        String s10 = "  50  ";
        int i10 = 100;
        int sum10 = Integer.parseInt(s10.trim()) + i10;
        System.out.println(sum10);
    }

    public static void testFloat() {
        float a = 60;
        float b = 7;

        float diff = a / b;
        System.out.println("the diff of two numbers = " + diff);
    }


    public static void testModuloOperator() {
        int a = 100;
        int b = 12;

        int remainder = a % b;
        System.out.println("the remainder  = " + remainder);
    }

    public static void testOddEven() {

        System.out.println("enter no to check odd and even");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int a = 101;
        int b = 2;

        int remainder = a % b;
        System.out.println("the remainder  = " + remainder);// && and || OR ! Not

        if (remainder == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
    }


    // a--  means  a = a - 1
    // --a  means  a = a - 1
    public static void testOperator1() {
        int a1 = 100;
        int a2 = a1--;
        System.out.println(a1); //99
        System.out.println(a2); //100

        int b1 = 100;
        int b2 = --b1;
        System.out.println(b1); //99
        System.out.println(b2); //99


        int x1 = 100;
        int x2 = x1++;
        System.out.println(x1); //101
        System.out.println(x2); //100

        int y1 = 100;
        int y2 = ++y1;
        System.out.println(y1); //101
        System.out.println(y2); //101


        int y = 7;
        int x= ++y * 8;  //64
        System.out.println(x);
    }


    public static void logicalOperators() {
        boolean flag1 = 55>50 && 45>40;
        System.out.println(flag1); //AND

        boolean flag2 = 45>50 && 45>40;
        System.out.println(flag2); //AND

        boolean flag3 = 55>60 || 45>40;
        System.out.println(flag3); //OR

        boolean flag4 = 45>50 || 45>48;
        System.out.println(flag4); //OR



    }

    public static void testOperator2() {
        if (10 >= 20) {
            System.out.println("jan");
        } else {
            System.out.println("feb");
        }
    }


    public static void main(String[] args) {
        //testSum();
        //testConcat();
        //testFloat();
        //testModuloOperator();
        testOddEven();
        testOperator1();
         //testOperator2();
        //logicalOperators();
        additionOfNumbers();

    }

    private static void additionOfNumbers() {
        //add two numbers
        int age1 = 345;
        int age2 = 450;

        int sum = age1 + age2;
        System.out.println("the sum of all ages = " + sum);

    }

}
