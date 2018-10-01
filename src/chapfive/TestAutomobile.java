/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapfive;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class TestAutomobile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("ID number: ");
        int idNum = input.nextInt();
        
                
        System.out.println("Make: ");
        String make = input.next();
        
        System.out.println("Model: ");
        String model = input.next();
        
        System.out.println("Color: ");
        String color = input.next();
        
        System.out.println("Year:");
        int year = input.nextInt();
        
        System.out.println("Month: ");
        int mon = input.nextInt();
        
        System.out.println("Day: ");
        int day = input.nextInt();
        LocalDate date = LocalDate.of(year, mon, day);

        System.out.println("Miles per gallon: ");
        double milesPerGal = input.nextDouble();

        
        Automobile automob = new Automobile(idNum, make, model, color, 
                date, milesPerGal);
        
        automob.setIdNum(idNum);
         System.out.println(automob.getIdNum());

        automob.setMake(make);
                 System.out.println(automob.getMake());

        automob.setModel(model);
                 System.out.println(automob.getModel());

        automob.setColor(color);
                 System.out.println(automob.getColor());

        automob.setYear(date);
                 System.out.println(automob.getYear());

        automob.setMilesPerGal(milesPerGal);
                 System.out.println(automob.getMilesPerGal());

        
        

    }
}
