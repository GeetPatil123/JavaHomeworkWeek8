package program17_carpetcostcalculator;

public class Carpet {//class
    //variable declaration
    public double cost;

    public Carpet(double cost){//method
        if(cost < 0){
            this.cost = 0.0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost(){
        return this.cost;
    }

}
