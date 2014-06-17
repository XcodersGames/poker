/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xcoders.gameitems;

import java.util.Random;

/**
 *
 * @author ravindu
 */
public class CardPack {
    
    private Card[] cards;
    private final int TOTAL_CARDS = 52;
    private Random randNo;
    //private Card[] cardStack;
    //private Card[] cardQueue;
    
    public CardPack() {
        cards = new Card[TOTAL_CARDS];
        //cardStack = new Card[TOTAL_CARDS];
        //cardQueue = new Card[TOTAL_CARDS];
        randNo=new Random();
        
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
    
    
    public void shuffleCards(){
        for(int i=0;i<cards.length;i++){
            int j=randNo.nextInt(TOTAL_CARDS);
            Card card1=cards[i];
            cards[i]=cards[j];
            cards[j]=card1;
        }
    }
    int i=0;
    int j=TOTAL_CARDS-1;
    public Card getCardFromTop(){
        Card card;
        card = cards[i];
        i++;
        return card;
    }
    
    public Card getCardFromBottom(){
        Card card;
        card = cards[j];
        j--;
        return card;
    }
    
    
    public Card[] getCardsFromTop(){
        return cards;
    }
    
    
    public Card[] getCardsFromBottom(){
        Card[] cards1=new Card[TOTAL_CARDS];
        for(int m=0,n=TOTAL_CARDS-1; m<TOTAL_CARDS;m++,n--){
            cards1[m]=cards[n];
        }
        return cards1;
    }
    
   
    
}
