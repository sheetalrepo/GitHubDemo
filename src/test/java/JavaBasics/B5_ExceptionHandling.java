package JavaBasics;


public class B5_ExceptionHandling {

    public static void main(String[] args) {

        try {
            int a = 0;
            int b = 100;
            int div = b / a;
            System.out.println("*****************************"); //never print in case of exception
            System.out.println(div);
        }catch (Exception e){
            System.out.println("Pls enter correct values");
            //System.exit(100);

        }finally {
            //cleaning purpose
            System.out.println("Finally block");
        }

    }

}
