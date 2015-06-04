/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import java.util.ArrayList;
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
    private Stack<Time> timesDisponiveisParaJogo;
    
    public Rodada(List<Time> listaTime){
        this.listaTime = listaTime;       
        timesDisponiveisParaJogo = new Stack();
        
        for(Time t: this.listaTime){
            //Adiciona na pilha os times que participarão da rodada.
            timesDisponiveisParaJogo.push(t);            
        }
    }    
    
    private Jogo getJogo(){
        //Método que sorteia um jogo para a rodada. 
        //Todos os dez jogos da rodada devem ser diferentes e o sorteio 
        //deve considerar que na próxima rodada não poderá ter um jogo que já aconteceu
        //sendo que o campeonato só terá um turno.
        Jogo j = null;
           if(timesDisponiveisParaJogo.size() > 0){
                Collections.shuffle(timesDisponiveisParaJogo);
                
                Time time1 = timesDisponiveisParaJogo.pop();
                List<Time> timesComQuemTime1Jogou = time1.getTimesComQuemJogou();
                Time time2 = null; //Ainda não é determinado o time2.
                for(Time t1: timesDisponiveisParaJogo){
                    if(!timesComQuemTime1Jogou.contains(t1)){ //Se t1 não estiver na lista de times com quem time1 jogou.
                        time2 = t1;
                        int indexT1 = timesDisponiveisParaJogo.indexOf(t1);
                        timesDisponiveisParaJogo.remove(indexT1);
                    }
                }
                
                j = new Jogo(time1, time2);
                
            }else{
                System.out.println("Acabou!");
            }
           
       return j; 
    }
    
    public List<Jogo> getJogosRodada(){
        //Método que obtém os jogos da rodada atual.
        List<Jogo> jogos = new ArrayList<>();
        for(int i = 0; i < 10; i++){
           jogos.add(getJogo());
        }
        return jogos;
    }
}
