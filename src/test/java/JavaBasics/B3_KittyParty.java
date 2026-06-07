package JavaBasics;

import java.util.Arrays;

public class B3_KittyParty {
    String name;
    String [] fooditems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFooditems() {
        return fooditems;
    }

    public void setFooditems(String[] fooditems) {
        this.fooditems = fooditems;
    }

    @Override
    public String toString() {
        return "B3_KittyParty{" +
                "name='" + name + '\'' +
                ", fooditems=" + Arrays.toString(fooditems) +
                '}';
    }

    public static void main(String [] args){


        B3_KittyParty obj1 =  new B3_KittyParty();
        B3_KittyParty obj2 = new B3_KittyParty();
        B3_KittyParty obj3 = new B3_KittyParty();

        obj1.setName("Seema");
        String [] f1= {"Choley", "Aloo tikki"};
        obj1.setFooditems(f1);


        obj2.setName("Kaavi");
        String [] f2 = {"tindey","paneer" };
        obj2.setFooditems(f2);

        obj3.setName("Poppy");
        String [] f3 = {"kheer", "rasgulle"};
        obj3.setFooditems(f3);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());

    }
}
