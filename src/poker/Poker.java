/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import com.xcoders.gameitems.Card;
import com.xcoders.gameitems.CardPack;

/**
 *
 * @author Ishantha
 */
public class Poker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardPack pack = new CardPack();
        Card[] cards = pack.getCards();
        for (Card card : cards) {
            System.out.println(card.getCardTypeName() + " " + card.getCardValueName());
        }
        
        /* About following code:- Output of the Shuffle method. It is not necessary to display, 
        but, I had to be check the Shuffle method, that Is it working. so I code it. */   
        
        System.out.println("\n***After Shuffle***"); 
        cards=pack.Shuffle(); 
        for (Card card : cards) {
            System.out.println(card.getCardTypeName() + " " + card.getCardValueName());
        }
    }
}
