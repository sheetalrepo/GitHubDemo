package JavaBasics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class B6_Collections {

    public void arrayList(){
        ArrayList<String> al = new ArrayList<>();
        al.add("mango");
        al.add("grapes");
        al.add("banana");

        System.out.println(al);


        for(String s: al){
            System.out.println("I like " + s.toUpperCase());
        }

        System.out.println("=============================");
    }

    public void hashMap(){
        Map<String, String> map = new HashMap<>();
        map.put("A","Apple");
        map.put("B","Ball");
        map.put("C","Cat");

        for (String key : map.keySet()) {
            System.out.println("Key = " + key);
            System.out.println("Value = " + map.get(key));
            System.out.println("*******");
        }
    }

    public void ArrayList123(){
        ArrayList<String> al= new ArrayList<>();
        al.add("Kaavya");
        al.add("Chikki");
        al.add("Popo");

        for (String s:al)
            System.out.println( " I am" + s);

    }




    public static void main(String [] args){
        B6_Collections obj = new B6_Collections();
        obj.arrayList();
        obj.hashMap();
        obj.ArrayList123();
    }
}
