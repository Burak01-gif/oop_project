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
public class TransportTruck extends Truck{
    protected boolean isTransport;

    public TransportTruck(int plateNumber, int numberOfTires, double loadCap, boolean isTransport ) {
        super(plateNumber, numberOfTires, loadCap);
        this.isTransport = isTransport;
    }
    public boolean isTransport() {
        return isTransport;
    }
    public void setTransport(boolean transport) {
        isTransport = transport;
    }
    public boolean isTransporting(){
        if (isTransport = true)
            return true;
        return false;
    }
}
