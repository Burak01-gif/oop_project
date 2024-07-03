/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

public class SUV extends Car{

    protected double suv;

    public SUV(int plateNumber,int numbOfDoors, int numberOfTires, String color, int seatingCap, double suv){
        super(plateNumber,numberOfTires,numbOfDoors,color,seatingCap);
    }
    public double getSuv(){
        return suv;
    }
    public void setSuv(double suv){
        this.suv=suv;
    }

}