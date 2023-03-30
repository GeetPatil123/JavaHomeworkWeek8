package program19_cylinder;

public class Circle {//class
    //declaring a variable
    public double radius;

    public Circle(double radius){//constructor with params
        this.radius = radius;
        if (radius < 0){
            this.radius = 0;
        }
    }

    public double getRadius(){//method returning a vlue
        return radius;
    }

    public double getArea(){//method returning a vlue
        return ((Math.pow(this.radius,2) * Math.PI));
    }
}
