package JavaBasics;

public class A7_MethodReturn {

    public static int addMe(int x, int y) {
        int s1 = x + y;
        System.out.println(s1);
        return s1;
    }

    public static boolean isFirstPersonElder(int age1, int age2) {
        if(age1 > age2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //type 1
        int sum = addMe(100, 200);

        int doubleSum = sum * 2;
        System.out.println(doubleSum);


        //type 2
        boolean flag = isFirstPersonElder(12, 34);

        if(flag)
            System.out.println("first person is elder");
        else
            System.out.println("second person is elder");
    }
}
