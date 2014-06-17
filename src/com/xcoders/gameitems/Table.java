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
public class Table {
    
    private Double pot;
    private Integer roundCount;
    private static Player[] players;
    private static Card[] cards;
    
    public Table(){
        
    
    players = new Player[6];
        players[0]=new Player();
        players[1]=new Player();
        players[2]=new Player();
        players[3]=new Player();
        players[4]=new Player();
        players[5]=new Player();
        
        cards=new Card[5];
        cards[0]=new Card();
        cards[1]=new Card();
        cards[2]=new Card();
        cards[3]=new Card();
        cards[4]=new Card();
    }
    
}
