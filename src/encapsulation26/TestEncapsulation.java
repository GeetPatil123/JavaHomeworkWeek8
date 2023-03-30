package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj=new Encapsulate();
        //setting value of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        //displaying values of the variables
        System.out.println("Pime's name: " +obj.getName());
        System.out.println("Pime's age: " +obj.getAge());
        System.out.println("Pime's rollNo: " +obj.getRollNo());

        //direct access of rollNo is not possible due to encapsulation



    }
}
