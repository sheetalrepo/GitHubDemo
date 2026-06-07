package JavaBasics;

import java.util.Arrays;

public class B2_Hogarsol {

    int rollNo;
    String name;
    int age;
    int [] marksMaths;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int[] getMarksMaths() {
        return marksMaths;
    }

    public void setMarksMaths(int[] marksMaths) {
        this.marksMaths = marksMaths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "B2_Hogarsol{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marksMaths=" + Arrays.toString(marksMaths) +
                '}';
    }

    public static void main(String[] args) {
        B2_Hogarsol obj1 = new B2_Hogarsol();
        B2_Hogarsol obj2 = new B2_Hogarsol();
        B2_Hogarsol obj3 = new B2_Hogarsol();

        obj1.setAge(9);
        obj1.setName("Kaavya");
        obj1.setRollNo(12);
        int[] m1= {9,10,9};
        obj1.setMarksMaths(m1);

        obj2.setAge(9);
        obj2.setName("Nicco");
        obj2.setRollNo(10);
        int [] m2 = {9,9,8};
        obj2.setMarksMaths(m2);

        obj3.setAge(10);
        obj3.setName("Hugo");
        obj3.setRollNo(2);
        int [] m3 = {10,9,9};
        obj3.setMarksMaths(m3);


        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());


    }
}

