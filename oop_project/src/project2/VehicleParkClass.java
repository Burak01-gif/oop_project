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
import java.util.Scanner;

public class VehicleParkClass {
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Person> persons;
    private int[] listOfVehicle;
    Scanner input;

    public void setListOfVehicle(){
        for (int i=0; i<=listOfVehicle.length; i++){
            vehicles.get(i).getPlateNumber();
        }
    }

    public void displayVehicles(){
        for (int i=0; i<=listOfVehicle.length; i++){
            System.out.println(listOfVehicle[i]);
        }
    }
    public boolean IsDisplayAvailableVehicles(){
        input = new Scanner(System.in);
        int p1 = input.nextInt();
        for (int i=p1; i<=p1; i++){
            listOfVehicle.equals(p1);
            return true;
        }
        return false;
    }

    public void addVehicle(){
        for (int i=0; i<vehicles.size(); i++){
            vehicles.get(i);
        }
    }

    public void remove(){
        for (int j=10 ; j>=vehicles.size(); j++){
            vehicles.get(j);
        }
    }
    public void dailyReport(){
        System.out.println("Reporting ....");
        System.out.println(vehicles.size());
    }

}
