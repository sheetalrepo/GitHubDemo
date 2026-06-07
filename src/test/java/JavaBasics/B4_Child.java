package JavaBasics;

public class B4_Child extends B4_Parent {

    public void abc(){
        tyre();
    }

    @Override  //Polymorphism - Override
    public void runCar(){
        System.out.println("Petrol Diesel Electric");
    }

    //Polymorphism - Overloading
    public int sum(int a, int b){
        return a+b;
    }

    public String sum(String s1, String s2){
        return s1+s2;
    }



    public static void main(String [] args){
        B4_Child obj = new B4_Child();
        obj.abc();
        obj.runCar();
    }

}
