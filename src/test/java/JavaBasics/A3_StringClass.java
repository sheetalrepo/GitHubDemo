package JavaBasics;

    public class A3_StringClass {


        public static void main(String[] args) {
            String name = "   Seema   ";
            System.out.println( "my name is = " + name);

            int length = name.length();
            System.out.println( "length of the string is " +  length);

            String name1 = name.toLowerCase();
            System.out.println(name1);

            String name2 = name.toUpperCase();
            System.out.println(name2);

            String name3 = name.trim();
            System.out.println(name3);

            String nameNew = "Mango";
            char ch1 = nameNew.charAt(3); // to print the index value, index value start from 0,1,2,....
            System.out.println(ch1);


            String text = "i am hungry";
            text = text.replace( " ","_");    //replace spaces in string with underscore
            System.out.println(text);

            String letter = " Dear <|name|>,Thanks a lot";
            letter = letter.replace("<|name|>","Seema");
            System.out.println(letter);

            String myString = "Orange";
            System.out.println(myString.indexOf("g"));
            System.out.println("<<<<<<<" + myString.indexOf("g"));

            String letter2 = "Dear Harry, \n\t this java course is good. \n\t thanks"; //Escape sequence characters
            System.out.println(letter2);

            String letter3 = "Dear Harry, \\n";
            System.out.println(letter3);

            String myname = "My name is \"Seema\"";
            System.out.println(myname);

            String tutorial = "Tutorials-Point";
            System.out.println(tutorial.substring(1,9));
            //System.out.println(tutorial.substring(-1,3));  //Runtime exception
            

        }


    }

