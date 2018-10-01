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
public class TestApartments {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int apartmentNum = input.nextInt();
        int bedroomsNum = input.nextInt();
        int bathsNum = input.nextInt();
        double rentAmnt = input.nextDouble();

        Apartment apartment1 = new Apartment(apartmentNum, bedroomsNum,
                bathsNum, rentAmnt);

        if (bedroomsNum == 1 && bathsNum == 1 && rentAmnt <= 10000) {
            System.out.println("With your given input, whats available for"
                   + "you now is the suite .... For more info, call 089392822");
        } 
        else if(bedroomsNum == 2 && bathsNum == 2 && rentAmnt >= 10000) {
            System.out.println("With your given input, whats available for"
                    + " you now is the suite ....");
        } else {
            System.out.println("For now nothing matches your request."
                    + "Go through you inputs again. Make sue it isnt above the "
                    + "requirements the stated. For more info,"
                    + " call 9494949494949");
        }
    }
}
