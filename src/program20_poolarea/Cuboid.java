package program20_poolarea;

public class Cuboid extends Rectangle{//class

    public Cuboid(double width, double length, double height){//constructor with params
        super(width, length);
        if (height <0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double height;

    public double getHeight() {//method returning a value
        return height;
    }

    public double getVolume(){//method returning a value
        return (getArea() * height);
    }


}
