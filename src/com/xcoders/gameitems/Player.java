/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xcoders.gameitems;

/**
 *
 * @author vijani
 */
public class Player {
    
    // First, 3 cards in each player's hand
    public final static int MAX_CARD = 3;
    private Card hand[];
    private Double money;
    private Double bidAmount;
    
    public Player(){
        hand=new Card[MAX_CARD];
    }
    
    // get 3 cards from Cardpack 
    // vijani says that , this method is to take 3 cards from pack for a player :p
    public Card[] getHand(CardPack pack){
        for(int i=0;i<MAX_CARD;i++){
            hand[i]=pack.getCardFromTop();
        }
        return hand;
    }
    
}
