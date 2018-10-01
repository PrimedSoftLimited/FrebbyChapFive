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
public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Any number of choice ");
        int num = input.nextInt();
        if(num % 2 == 0)
            System.out.println("is an even number: ");
        else
            System.out.println("is an odd number");
    }
}
