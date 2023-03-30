package program20_poolarea;

public class Rectangle {
    // value declaration
    public double width;
    public double length;

    public Rectangle(double width, double length){//constructor with params
        if((width <0 ) && (length < 0)){
            this.width = 0;
            this.length = 0;
        } else if ((width < 0) && (length > 0)) {
            this.width = 0;
            this.length = length;
        } else if ((width > 0) && (length < 0)) {
            this.width = width;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getWidth() {//method returning a value
        return width;
    }

    public void setWidth(double width) {//method setting a value
        this.width = width;
    }

    public double getLength() {//method returning a value
        return length;
    }

    public void setLength(double length) {//method setting a value
        this.length = length;
    }

    public double getArea(){//method returning a value
        return (width * length);
    }










}
