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
public class AscendingAndDescending {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();
        int thirdInt = input.nextInt();
        if ((firstInt < secondInt) && (firstInt < thirdInt)) {

            System.out.print("The numbers in ascending order are:" + firstInt);

            if (secondInt < thirdInt) {
                System.out.println(" " + secondInt + " " + thirdInt);
            } else {
                System.out.println(" " + thirdInt + " " + secondInt);
            }
        } else if ((secondInt < firstInt) && (secondInt < thirdInt)) {

            System.out.print("The numbers in ascending order are:"
                    + secondInt);

            if (firstInt < thirdInt) {
                System.out.println(" " + firstInt + " " + thirdInt);
            } else {
                System.out.println(" " + thirdInt + " " + firstInt);
            }

        } else if ((thirdInt < firstInt) && (thirdInt < secondInt)) {

            System.out.print("The numbers in ascending order are:" + thirdInt);

            if (firstInt < secondInt) {
                System.out.println(" " + firstInt + " " + secondInt);
            } else {
                System.out.println(" " + secondInt + " " + firstInt);
            }

        }

    }
}
