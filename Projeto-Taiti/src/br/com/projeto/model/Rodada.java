/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Daylton
 */
public class Rodada {
    private List<Time> listaTime;
    private List<Jogos> listaJogos;
    private Stack timesDisponiveisParaJogo;
    
    public Rodada(List<Time> listaTime){
        this.listaTime = listaTime;       
        timesDisponiveisParaJogo = new Stack();
        
        for(Time t: this.listaTime){
            timesDisponiveisParaJogo.push(t);            
        }
        System.out.println(timesDisponiveisParaJogo);
    }    
    
    public Jogo getJogo(){
        Jogo j = null;
           if(timesDisponiveisParaJogo.size() > 0){
               
                Collections.shuffle(timesDisponiveisParaJogo);
                
//                Time time1 = (Time) timesDisponiveisParaJogo.pop();
//                Time time2 = (Time) timesDisponiveisParaJogo.pop();

                j = new Jogo((Time) timesDisponiveisParaJogo.pop(), (Time) timesDisponiveisParaJogo.pop());
                
            }else{
                System.out.println("Acabou!");
            }
           
       return j; 
    }
}
