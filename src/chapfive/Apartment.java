/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapfive;

/**
 *
 * @author Frebby
 */
public class Apartment {
    private int apartmentNum;
    private int bedroomsNum;
    private int bathsNum;
    private double rentAmnt;

    public Apartment(int apartmentNum, int bedroomsNum, int bathsNum, double rentAmnt) {
        this.apartmentNum = apartmentNum;
        this.bedroomsNum = bedroomsNum;
        this.bathsNum = bathsNum;
        this.rentAmnt = rentAmnt;
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public int getBedroomsNum() {
        return bedroomsNum;
    }

    public int getBathsNum() {
        return bathsNum;
    }

    public double getRentAmnt() {
        return rentAmnt;
    }
    
    
}
