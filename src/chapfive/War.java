/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapfive;

import java.util.Random;

/**
 *
 * @author Frebby
 */
public class War {
    public static void main(String[] args){
         final int CARDS_IN_SUIT = 13;
         
        int comRand = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        int playRand = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        int clubs = 1;
        int diamonds = 2;
        int hearts = 3;
        int spades = 4;
        
        
        Card card1 = new Card();
        Card card2 = new Card();
        
    }
}
