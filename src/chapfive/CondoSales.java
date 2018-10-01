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
public class CondoSales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choiceOne = input.nextInt();
        int parkViewPrice = 150000;
        int golfViewPrice = 170000;
        int lakeViewPrice = 210000;
        int defaultPrice = 0;
        switch (choiceOne) {
            case 1:
                System.out.println("Park View = " + parkViewPrice);
                break;
            case 2:
                System.out.println("Golf View View = " + golfViewPrice);
                break;
            case 3:
                System.out.println("Lake View = " + lakeViewPrice);
                break;
            default:
                System.out.println("No view = " + defaultPrice);
        }
    }
}
