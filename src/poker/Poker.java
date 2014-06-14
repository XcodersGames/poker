/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import com.xcoders.gameitems.Card;
import com.xcoders.gameitems.CardPack;

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
        Card[] cards = pack.getCards();
        for (Card card : cards) {
            System.out.println(card.getCardTypeName() + " " + card.getCardValueName());
        }
    }
}
