/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapfive;

/**
 *
 * @author Frebby
 */
public class TwoDice2 {
    public static void main(String[] args){
        int HIGHEST_DIE_VALUE = 6;
        int LOWEST_DIE_VALUE = 1;
        int random1 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
LOWEST_DIE_VALUE);
        int random2 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
LOWEST_DIE_VALUE);
        int randVal1 = random1;
        int randVal2 = random2;
    Die diceOne = new Die(randVal1);
    Die diceTwo = new Die(randVal2);
        
    
    System.out.println(diceOne.getFromOneToSix());
    System.out.println(diceTwo.getFromOneToSix());
    
    
    if(diceOne.getFromOneToSix() == diceTwo.getFromOneToSix()){
        System.out.println("The same");
    }
    if(diceOne.getFromOneToSix() > diceTwo.getFromOneToSix()){
        System.out.println("First higher than second");
    }
    else if(diceTwo.getFromOneToSix() > diceOne.getFromOneToSix()){
                System.out.println("second higher than first");

    }
    
    
    }
}
