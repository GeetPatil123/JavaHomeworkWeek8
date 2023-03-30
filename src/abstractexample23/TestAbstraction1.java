package abstractexample23;

public class TestAbstraction1 {

    /* 4. Create the fourth class name abstractexample23.TestAbstraction1 and inside create the
    main method as below.*/
    public static void main(String[] args) {
        Shape s = new Circle1();//In a real scenario, object is provided through
        // method, e.g., getShape() method
        s.draw();
    }
}
