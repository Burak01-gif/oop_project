
package project2;

import java.util.Scanner;

public class Car extends Vehicle{
    protected String color;
    protected int seatingCap;
    protected int numbOfDoors;

    public Car(int plateNumber,int numbOfDoors, int numberOfTires, String color, int seatingCap) {
        super(plateNumber,numberOfTires);
        this.color = color;
        this.numbOfDoors = numbOfDoors;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getSeatingCap(){
        return seatingCap;
    }
    public void setSeatingCap(int seatingCap){
        this.seatingCap =seatingCap;
    }
    public int getNumOfDoors(){
        return numbOfDoors;
    }
    public void setNumOfDoors(int numbOfDoors){
        this.numbOfDoors = numbOfDoors;
    }
}

