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

import java.util.ArrayList;

public class RegisteredUser extends Person{
    private ArrayList<Vehicle> vehicles;

    public RegisteredUser(String name, int phone, String adress) {
        super(name, phone, adress);
        vehicles = new ArrayList<Vehicle>();
    }

    public void canBook(){
        for (int i=0; i<vehicles.size(); i++){
            System.out.println(vehicles.get(i));
        }
        vehicles.toArray();
    }
    public void canRentVehicles(){
        for (int i=0; i<vehicles.size(); i++){
            vehicles.get(i).bookMe();
        }
    }
    public void cancelRent(int num){
        for (int i=0; i<vehicles.size(); i++){
            if (i==num) {
                System.out.println("Do you want to cancel !!!");
                break;
            }
        }
    }
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

}
