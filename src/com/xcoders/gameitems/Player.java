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
    private Card cards[];
    private Double money;
    private Double bidAmount;
    
    public Player(){
        cards=new Card[MAX_CARD];
    }
    public Card[] getCards(){
        return cards;
    }
    
}
