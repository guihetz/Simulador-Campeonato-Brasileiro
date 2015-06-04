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
           if(listaTime.size() > 0){
                Collections.shuffle(timesDisponiveisParaJogo);
                Time time1, time2;
                time1 = timesDisponiveisParaJogo.pop();
                time2 = timesDisponiveisParaJogo.pop();
                List<Time> timesQue1Jogou = time1.getTimesComQuemJogou();
                if(timesQue1Jogou.size()>0){
                    if(timesQue1Jogou.contains(time2)){
                        timesDisponiveisParaJogo.push(time2);
                        for(Time t : timesDisponiveisParaJogo){
                            if(!timesQue1Jogou.contains(t)){
                                time2 = t;
                                
                            }
                        }
                        timesDisponiveisParaJogo.remove(time2);
                    }
                }
                time1.addTimeJogado(time2);
                time2.addTimeJogado(time1);
                
                
                j = new Jogo(time1, time2);
                System.out.println(j.getTime1() + " x " + j.getTime2());
                    
                
                
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
        System.out.println("\n");
        return jogos;
    }
}
