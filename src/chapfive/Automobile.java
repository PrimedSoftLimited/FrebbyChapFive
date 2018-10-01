/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapfive;

import java.time.LocalDate;
import java.time.Month;



/**
 *
 * @author Frebby
 */
public class Automobile {
    private int idNum;
    private String make;
    private String model;
    private String color;
    private LocalDate year;
    private double milesPerGal;

    public int getIdNum() {
        return idNum;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getYear() {
        return year;
    }

    public double getMilesPerGal() {
        return milesPerGal;
    }

    
    
    public void setIdNum(int idNum) {
        if(idNum > 9999 || idNum < 0)
            this.idNum = 0;
        else
            this.idNum = idNum;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(LocalDate year) {
        LocalDate earlier = LocalDate.ofYearDay(2000, 0);
        LocalDate later = LocalDate.ofYearDay(2017, 0);
        LocalDate defSetter = LocalDate.of(0, 0, 0);
        
        
        if(year.isBefore(earlier) || year.isAfter(later))
            this.year = year;
        else
        this.year = defSetter;
    }

    public void setMilesPerGal(double milesPerGal) {
        if(milesPerGal < 10 || milesPerGal > 60)
            this.milesPerGal = 0;
        else
        this.milesPerGal = milesPerGal;
    }

    public Automobile(int idNum, String make, String model, String color, LocalDate year, double milesPerGal) {
        this.idNum = idNum;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.milesPerGal = milesPerGal;
    }
    
}
