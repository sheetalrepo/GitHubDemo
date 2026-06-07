package JavaBasics;

public class A5_Array {


    public static void sumAllNumbers() {
        int[] marks = {80, 90, 70, 60, 65, 98};
        int sum = 0;
        for (int i : marks) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void stringArray() {
        String[] alphabets = {"abc", "mno", "xyz"};

        for (String s : alphabets) {
            System.out.println(s);
        }

        for (int i = 1; i < 3; i++) {
            System.out.println(alphabets[i]);
        }
    }


    public static void reverseString() {
        String[] alphabets = {"abc", "mno", "xyz"};

        for (String s : alphabets) {
            StringBuffer sbr = new StringBuffer(s);
            sbr.reverse();
            System.out.println(sbr);
        }
    }


    public static void reverseStringUsingCharAt() {
        String str = "Kaavya";
        String revStr = "";
        int lastIndex = str.length() - 1;

        for (int i = lastIndex; i >= 0; i--) {
            char ch = str.charAt(i);
            revStr = revStr + ch;
        }
        System.out.println("Reversed word: " + revStr);


        StringBuffer sbr = new StringBuffer(str);
        System.out.println(sbr.reverse());


    }

    public static void palendromeString() {
        String str = "A";

        StringBuffer sbr = new StringBuffer(str);
        String strNew = String.valueOf(sbr.reverse());

        if (str.equalsIgnoreCase(strNew)) {
            System.out.println("This is a palendrome");
        } else {
            System.out.println("This is not a palendrome");
        }

    }


    public static void main(String[] args) {
        //sumAllNumbers();
        //stringArray();
        //reverseString();
        // reverseStringUsingCharAt();
        palendromeString();
    }

}
