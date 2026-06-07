package JavaBasics;

public class A6_Methods {

    public static void abc(int x, int y) {
        if (x > y) {
            System.out.println("I am " + x);
        } else {
            System.out.println("I am " + y);
        }
    }

    public static void countLength(String str) {
        System.out.println("Length of string is: "+ str.length());
    }

    public static void main(String[] args) {
        //type 1
        int a = 10;
        int b = 20;
        abc(a, b);

        //type 2
        abc(100, 200);

        countLength("Seema");
        countLength("Kaavya");
    }
}
