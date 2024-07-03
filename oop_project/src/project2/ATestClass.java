package project2;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class ATestClass {
    public static void main(String[] args) {
        System.out.println("Welcome to Vehicle Hiring System !!!");
        Date date = new Date();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter menu : ENTER 1 ");
        int menu = input.nextInt();
        int id;
        Truck t;
        SmallTrucks st;
        VehicleParkClass vcp;
        Sports s;
        RegisteredUser reg;
        SUV suv;
        SW sw;
        Admin ad;

        switch (menu) {
            case 1:
                int press = input.nextInt();
                switch (press) {
                    case 1:
                        System.out.println("Display All Vehicles !!!");
                        break;
                    case 2:
                        System.out.println("Today : " + date.toString());
                        System.out.println("Choose date - (Default :)");
                        System.out.print("Enter start date : ");
                        new Date(04, 06, 2021);
                        for (int i = 0; i < vehicles.size(); i++) {
                            vehicles.get(i).bookMe();
                        }
                        break;
                    case 3:
                        System.out.println("Write your name and contact info");
                        System.out.println(reg = new RegisteredUser("Selim", 537, "Cavus mahallesi"));
                        break;
                    case 4:
                        System.out.println("Enter your ıd");
                        id = input.nextInt();
                        persons.get(id);
                        break;
                    case 5:
                        System.out.println("Welcome!");
                        int menu1 = input.nextInt();
                        int menu2 = input.nextInt();
                        if (menu1==1){
                        switch(menu2) {
                            case 0:
                                case 1:
                                    System.out.println("All Vehicles!!");
                                    for (int i = 0; i < vehicles.size(); i++) {
                                        vehicles.get(i).bookMe();
                                    }
                                    break;
                                case 2:
                                    System.out.println("Enter date :  Default !!");
                                    new Date(1, 1, 1970);
                                    for (int i = 0; i < vehicles.size(); i++) {
                                        vehicles.get(i).toString();
                                    }
                                    break;
                                case 3:
                                    System.out.println("Choose !!");
                                    t = new Truck(1, 3 ,2);
                                    t.isReservation(7);
                                    break;
                                case 4:
                                    reg = new RegisteredUser("Burak", 537, "Sile");
                                    reg.canBook();
                                    reg.cancelRent(1);
                                    reg.canRentVehicles();
                                    break;
                            }
                        }else {
                            int j= input.nextInt();
                            switch (j){
                                case 1:
                                    System.out.println("All Vehicles!!");
                                    for (int i = 0; i < vehicles.size(); i++) {
                                        vehicles.get(i).bookMe();
                                    }
                                    break;
                                case 2:
                                    System.out.println("Enter date :  Default !!");
                                    new Date(1, 1, 1970);
                                    for (int i = 0; i < vehicles.size(); i++) {
                                        vehicles.get(i).toString();
                                    }
                                    break;
                                case 3:
                                    System.out.println("Choose !!");
                                    t = new Truck(1, 3, 2);
                                    t.isReservation(7);
                                    break;
                                case 4:
                                    reg = new RegisteredUser("Burak", 537, "Sile");
                                    reg.canBook();
                                    reg.cancelRent(1);
                                    reg.canRentVehicles();
                                    break;
                                case 5:
                                    System.out.println("Reporting...");
                                    vehicles.toString();
                                    break;
                                case 6:
                                    System.out.println("Returning main menu , try run it");
                                    break;
                            }
                        }
                }
        }
    }
}

