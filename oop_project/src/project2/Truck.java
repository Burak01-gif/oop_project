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
public class Truck extends Vehicle{
    private double loadCap;

    public Truck(int plateNumber, int numberOfTires, double loadCap){
        super(plateNumber,numberOfTires);
        this.loadCap = loadCap;
    }
    public double getLoadCap() {
        return loadCap;
    }

    public void setLoadCap(double loadCap) {
        this.loadCap = loadCap;
    }
    public void isReservation(int day){
        if (day>=7)
            System.out.println("Is Available");
        else
            System.out.println("Is not available");
    }
}
