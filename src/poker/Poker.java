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
        
        /* About following codes:- Output of the Shuffle method,getCards(3)method and getCard method.
        Those methods are not necessary to display...... 
        but, I had to be check those methods, that Is it working. so I code it. */   
        
        System.out.println("\n***After Shuffle***"); 
        cards=pack.Shuffle(); 
        for (Card card : cards) {
            System.out.println(card.getCardTypeName() + " " + card.getCardValueName());
        }
        
        System.out.println("\n***Get 3 Cards***"); 
        cards=pack.getCards(3); 
        for (Card card : cards) {
            System.out.println(card.getCardTypeName() + " " + card.getCardValueName());
        }
        
        System.out.println("\n***Get One Card***"); 
        Card c=new Card();
        c=pack.getCard();     
        System.out.println(c.getCardTypeName() + " " + c.getCardValueName());
    }
 }

