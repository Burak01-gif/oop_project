/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

public class Sports extends Car{
    protected double HP;
    public Sports(int plateNumber,int numbOfDoors, int numberOfTires, String color, int seating, double HP){
        super(plateNumber,numberOfTires,numbOfDoors,color,seating);
    }
    public double getHP(){
        return HP;
    }
    public void setHP(double HP){
        this.HP = HP;
    }
}
