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
public class Card {
    char spades = 's';
    char hearts = 'h';
    char diamonds = 'd';
    char clubs = 'c';
    int value = 4;

    public char getSpades() {
        return spades;
    }

    public char getDiamonds() {
        return diamonds;
    }

    public char getClubs() {
        return clubs;
    }

    public int getValue() {
        return value;
    }

    public void setSpades(char spades) {
        this.spades = spades;
    }

    public void setHearts(char hearts) {
        this.hearts = hearts;
    }

    public void setDiamonds(char diamonds) {
        this.diamonds = diamonds;
    }

    public void setClubs(char clubs) {
        this.clubs = clubs;
    }

    public void setValue(int value) {
        if(value < 1){
            this.value = 1;
        }
        else if(value > 13){
            this.value = 1;
        }
        else
        this.value = value;
    }
    
}
