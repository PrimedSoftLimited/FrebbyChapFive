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
public class Lottery {

    public static void main(String[] args) {
        int HIGHEST_DIE_VALUE = 9;
        int LOWEST_DIE_VALUE = 0;
        int random1 = ((int) (Math.random() * 100) % HIGHEST_DIE_VALUE
                + LOWEST_DIE_VALUE);
        int random2 = ((int) (Math.random() * 100) % HIGHEST_DIE_VALUE
                + LOWEST_DIE_VALUE);
        int random3 = ((int) (Math.random() * 100) % HIGHEST_DIE_VALUE
                + LOWEST_DIE_VALUE);
               
        
                    System.out.println(random1);
            System.out.println(random2);
            System.out.println(random3);

        Scanner input = new Scanner(System.in);
        
        int firstGuess = input.nextInt();
                int secondGuess = input.nextInt();
        int thirdGuess = input.nextInt();

        if(firstGuess != random1 && secondGuess != random2 &&
        thirdGuess != random3)
                           System.out.println("No matches. Award is $0");
        
        if(firstGuess == random1 && secondGuess != random2 &&
        thirdGuess != random3 || firstGuess != random1 && secondGuess == random2 &&
        thirdGuess != random3 || firstGuess != random1 && secondGuess != random2 &&
        thirdGuess == random3)
                       System.out.println("A match. Award is $10");
        
         if(firstGuess == random1 && secondGuess == random2 ||
                firstGuess == random1 && thirdGuess == random3 ||
                secondGuess == random2 && thirdGuess == random3)
                        System.out.println("Two matched. Award is $100");
                        
        if(firstGuess == random1 && secondGuess == random2 &&
                thirdGuess == random3)
            System.out.println("All matched. Award is $1000");
      
}
        
    }
