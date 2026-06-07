package JavaBasics;

public class P_PracticeNew {

    static void abc() {
       // int[ ] ia = new int[15];

        //ia[0]= 16;


        String arr[] = {"popi", "mommy", "som", "ko"};
        int max = 0;
        String maxStr = "";

        for (String x : arr) {
            int len = x.length();

            if (len > max) {
                max = len;
                maxStr = x;
            }
        }
        System.out.println(max);
        System.out.println(maxStr);

    }


    public static void main(String[] args) {
        abc();

    }

}
