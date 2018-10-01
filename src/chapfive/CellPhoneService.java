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
public class CellPhoneService {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String choice = input.next();
        int monthlyTalkMinutes = input.nextInt();
        int textMessagesSent = input.nextInt();
        int usedGigabytes = input.nextInt();
        
        boolean planA = monthlyTalkMinutes < 500 && textMessagesSent == 0 && 
                usedGigabytes == 0;
        boolean planB = monthlyTalkMinutes < 500 && textMessagesSent > 0 && 
                usedGigabytes == 0;
        boolean planC = monthlyTalkMinutes > 500 && textMessagesSent <= 100 && 
                usedGigabytes == 0;
        boolean planD = monthlyTalkMinutes == 0 && textMessagesSent >= 100 &&
                usedGigabytes == 0;
        boolean planE = monthlyTalkMinutes == 0 && textMessagesSent == 0 &&
                usedGigabytes <= 2;
        boolean planF = monthlyTalkMinutes == 0 && textMessagesSent == 0 &&
                usedGigabytes >= 0;

        int planAPrice = 49;
        int planBPrice = 55;
        int planCPrice = 61;
        int planDPrice = 70;
        int planEPrice = 79;
        int planFPrice = 87;

        switch (choice) {
            case "a":
                System.out.println("From your input, this is the best service"
                        + " for you at " + planAPrice);
                break;
            case "b":
                System.out.println("From your input, this is the best service"
                        + " for you.at " + planBPrice);
                break;

            case "c":
                System.out.println("From your input, this is the best service"
                        + " for you at " + planCPrice);
                break;

            case "d":
                System.out.println("From your input, this is the best service"
                        + " for you at " + planDPrice);
                break;

            case "e":
                System.out.println("From your input, this is the best service"
                        + " for you at " + planEPrice);
                break;

            case "f":
                System.out.println("From your input, this is the best service"
                        + " for you at " + planFPrice);
                break;

        }
    }
}
