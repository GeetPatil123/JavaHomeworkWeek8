package program17_carpetcostcalculator;

public class Floor {//class
    //declaring variables
    public double width;
    public double length;

    public Floor(double width, double length) {//parameterized constructor
        if (width > 0 && length < 0) {
            this.width = width;
            this.length = length;
        } else if (width < 0 && length > 0) {
            this.width = 0.0;
            this.length = length;
        } else if (width < 0 && length < 0) {
            this.width = width = 0.0;
            this.length = length;
        } else {
            this.width = width;
            this.length = length;
        }

    }

    public double getArea() {
        return this.width * this.length;
    }
}











