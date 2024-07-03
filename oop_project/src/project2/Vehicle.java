
package project2;

import java.util.Date;

public abstract class Vehicle {
    protected final int plateNumber;
    protected final int numberOfTires;
    private Date date;
   
    protected Vehicle(int plateNumber, int numberOfTires){
        this.plateNumber = plateNumber;
        this.numberOfTires = numberOfTires;
    }

    public void bookMe(){
        date = new Date(1,1,1970);
        System.out.println("day "+ "month " +"year " + date );
    }

    public int getPlateNumber(){
        return plateNumber;
    }
    public int getNumberOfTires(){
        return numberOfTires;
    }
    public int getDailyFree(int numberOfTires, int dailyFee){
        return numberOfTires * dailyFee;
    }
    public void iptalMe(int date){}

    public void rentME(){}

    public void dropMe(){}

    public void loadMe(){}
}

