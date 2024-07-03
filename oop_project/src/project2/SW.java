/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

public class SW extends Car{
    protected int loadingCap;

    public SW(int plateNumber,int numbOfDoors, int numberOfTires, String color, int seating, int loadingCap){
        super(plateNumber,numberOfTires,numbOfDoors,color,seating);
        this.loadingCap = loadingCap;
    }
    public int getLoadingCap(){
        return loadingCap;
    }
    public void setLoadingCap(int loadingCap){
        this.loadingCap = loadingCap;
    }

}
