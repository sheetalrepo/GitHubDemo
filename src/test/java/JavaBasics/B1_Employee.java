package JavaBasics;

public class B1_Employee {
    int id;
    String name;
    String address;
    String position;


    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {

        if(id>=10){
            this.id = id;
        }else{
            throw new Exception("ERRRRRRRRo");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static void main(String[] args) throws Exception {
        B1_Employee obj1= new B1_Employee();
        B1_Employee obj2= new B1_Employee();

        obj1.setId(15);
        obj1.name = "Laura";
        obj1.address = "Malaga";
        obj1.position = "mathematician";

        obj2.setId(6543);
        obj2.setName("Erik");
        obj2.setAddress("Malaga");
        obj2.setPosition("Manager");

        System.out.println(obj1.getId());
        System.out.println(obj2.getName());


    }
}
