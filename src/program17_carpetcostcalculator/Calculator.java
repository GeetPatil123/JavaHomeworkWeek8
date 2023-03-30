package program17_carpetcostcalculator;

public class Calculator {//class
    //variable declaration
    public Floor floor;
    public Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {//parameterised constructor
        //initializing variables
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {//method
        return floor.getArea() * carpet.getCost();
    }

}












