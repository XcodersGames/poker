/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xcoders.gameitems;

import java.util.Random;

/**
 *
 * @author Ishantha
 */
public class CardPack {
    
    private Card[] cards;

    public CardPack() {
        cards = new Card[52];
        
        // creates a new card pack with the 4 types
        // cards from 2 -10 and
        // J is considered as 11
        // Q is considered as 12
        // K is considered as 13
        // A is considered as 14
        // took as as 14 instead of 1 cz it would be easy in comparison when A has the greatest value
        for (int i = 0; i < 4; i++) {
            //took this card out of the loop just to make A the 1st card
            Card cardA = new Card();
            cardA.setValue(14);
            cardA.setType(i);
            cards[i * 13] = cardA;
            
            //create the other 12 cards
            for (int j = 2; j <= 13; j++) {
                Card card = new Card();
                card.setValue(j);
                card.setType(i);
                cards[(i * 13) + (j-1)] = card;
                //0 -12
                //13 - 25
                //26- 38
                //39   - 51
            }
        }
    }
    
     public Card[] Shuffle(){
        
        int newC;
	Card c;
	Random ran = new Random();
                
	for (int i = 0; i < 52; i++) {
		
            newC = ran.nextInt(52);
            c = cards[i];
            cards[i] = cards[newC];
            cards[newC] = c;                      
        }
        return cards;   
    }
     
    public Card[] getCards(){
               
        return cards;   
    }
 }