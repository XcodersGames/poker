/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import com.xcoders.gameitems.Card;
import com.xcoders.gameitems.CardPack;
import com.xcoders.gameitems.Player;

/**
 *
 * @author ravindu
 */
public class Poker {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardPack pack = new CardPack();
        System.out.println();
        System.out.println("Cards before shuffling");
        Card[] cards = pack.getCardsFromTop();
        for (Card card : cards) {
            System.out.println(card.getCardTypeName() + " " + card.getCardValueName());
        }
        
        // shuffle th pack
        pack.shuffleCards();
        
        System.out.println();
        System.out.println("Cards after shuffling");   
        Card[] cardsShuffled = pack.getCardsFromTop();
        for (Card card : cardsShuffled) {
            System.out.println(card.getCardTypeName() + " " + card.getCardValueName());
        }
        //object array
        
       
        System.out.println();
        System.out.println("Cards from Bottom to top");
        Card[] cards1 = pack.getCardsFromBottom();
        for (Card card1 : cards1) {
            System.out.println(card1.getCardTypeName() + " " + card1.getCardValueName());
        }
        
        // can call these 2 methods to take cards one by one, when needed
        
        System.out.println();
        System.out.println("    one Card from top");
        Card cardTop=pack.getCardFromTop();
        System.out.println(cardTop.getCardTypeName() + " " + cardTop.getCardValueName());
        
        System.out.println();
        System.out.println("    one Card from bottom");
        Card cardBottom=pack.getCardFromBottom();
        System.out.println(cardBottom.getCardTypeName() + " " + cardBottom.getCardValueName());
        
        
    }
}
