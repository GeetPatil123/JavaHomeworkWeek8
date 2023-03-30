package program19_cylinder;

public class Cylinder extends Circle{//class
    //declared a variable
    public double height;

    public Cylinder(double radius, double height){//constructor with params
        super(radius);
        this.height = height;
        if (height <0){
            this.height = 0;
        }
    }

    public double getHeight() {//method returning a value
        return height;
    }

    public double getVolume(){//method returning a value
        return (super.getArea() * getHeight() );
    }
}
