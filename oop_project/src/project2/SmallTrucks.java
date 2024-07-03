/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Lenovo
 */
public class SmallTrucks extends Truck{
    protected int smallTruck;

    public SmallTrucks(int plateNumber, int numberOfTires, double loadCap, int smallTruck){
        super(plateNumber,numberOfTires, loadCap);
        this.smallTruck = smallTruck;
    }
    public double getSmallTruck(){
        return smallTruck;
    }
    public void setSmallTruck(int smallTruck){
        this.smallTruck = smallTruck;
    }

}
