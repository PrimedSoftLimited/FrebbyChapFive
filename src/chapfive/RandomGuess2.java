
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Frebby
 */
public class RandomGuess2 {

    public static void main(String[] args) {
        int HIGHEST_DIE_VALUE = 10;
        int LOWEST_DIE_VALUE = 1;
        int random = ((int) (Math.random() * 100) % HIGHEST_DIE_VALUE
                + LOWEST_DIE_VALUE);
        System.out.print("Make a gues of s number from 1 to 10 >>> ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        if (guess == random) {
            System.out.println("Awesome!!! You guessed " + guess + "and the"
                    + " random number is " + random);
        } else {
            System.out.println("Better luck next time. Random number is " + 
                    random);
        }

    }
}
