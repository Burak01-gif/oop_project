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

public class Person {

    private String name;
    private double phone;
    private String adress;
    private ArrayList<Vehicle> cars;
    private int[] count ;
    public static int c = 0;

    public Person(String name, int phone, String adress){
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }
    public void display(){
        for (int i = 0; i< cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
    public void displayAvailable(int num){
        for (int i = 0; i< cars.size(); i++){
            if (i==num)
                System.out.println("Already RENTED !!! ");
            else
                System.out.println(cars.get(i));
        }
    }
    public void register(){
        Scanner input = new Scanner(System.in);
        System.out.print("Name : ");
        name = input.next();
        System.out.print("Phone Number");
        phone = input.nextDouble();
        System.out.print("Adress");
        adress = input.next();
        System.out.println("Preparing...");
        c++;
        for (int i=0; i<count.length; i++){
            count[c-1] = i;
        }
    }
    public String getName(){return name;}
    public void setName(){this.name=name;}
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public double getPhone() {return phone;}
    public void setPhone(int phone) {
        this.phone = phone;
    }
}
