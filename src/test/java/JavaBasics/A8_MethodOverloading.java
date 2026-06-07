package JavaBasics;

public class A8_MethodOverloading {

    public static void addMe(int x) {
        System.out.println("Single param "+x);
    }


    public static void addMe(int x, int y) {
        int sum = x + y;
        System.out.println("Double param " + sum);
    }

    public static void addMe(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Triple param " + sum);
    }

    public static void addMe(String s) {
        System.out.println("String param " + s);
    }


    public static void main(String[] args) {
        //type 1
        addMe(100);
        addMe(100, 200);
        addMe(100, 200, 300);
        addMe("kuku");
    }
}
