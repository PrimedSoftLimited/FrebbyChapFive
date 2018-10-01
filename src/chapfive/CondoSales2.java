/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapfive;

import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class CondoSales2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choos 1 for Garage or 2 for Parking sspace");
        int choice = input.nextInt();
        int garagePrice = 5000;
        if (choice == 1) {
            System.out.println("Garage price: " + garagePrice);
        } else if (choice == 2) {
            System.out.println("Hello parking space");
        } else {
            System.out.println("invalid");
        }

    }
}
