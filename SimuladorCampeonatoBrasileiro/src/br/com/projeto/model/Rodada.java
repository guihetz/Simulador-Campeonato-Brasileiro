/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Daylton
 */
public class Rodada {
    private List<Time> listaTime;
    private List<Jogo> listaJogos;
    private Stack<Time> timesDisponiveisParaJogo;
    public static int numero;
    private int numeroDaRodada;
    public static LocalDateTime data;
    private LocalDateTime dataAtual;
    public Rodada(List<Time> listaTime){
        this.dataAtual = LocalDateTime.now();
        this.listaTime = listaTime;       
        timesDisponiveisParaJogo = new Stack();
        numero++;
        if(numero==1){
            data = dataAtual;
        }else{
            data = data.plusDays(1);
        }
        this.numeroDaRodada = numero;
        for(Time t: this.listaTime){
            //Adiciona na pilha os times que participarão da rodada.
            timesDisponiveisParaJogo.push(t);            
        }
        this.listaJogos = this.getJogos();
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
                //System.out.println(j.getTime1() + " x " + j.getTime2());
            }else{
                System.out.println("Acabou!");
            }
           
       return j; 
    }
    
    private List<Jogo> getJogos(){
        //Método que obtém os jogos da rodada atual.
        List<Jogo> jogos = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Jogo j = getJogo();                   //Cria instância de um novo jogo.
            if(i<5){
                j.setDataJogo(this.getDataJogo(data));
            }else {
                if(i==5){
                    data = this.getDataJogo(data).plusDays(1);
                }
                j.setDataJogo(this.getDataJogo(data));
                
            }
            
           jogos.add(j);                          //Adiciona jogo na lista de jogos da rodada.
           Time t1 = j.getTime1();                //Referencia instância do time 1.
           Time t2 = j.getTime2();                //Referencia instância do time 2.
           t1.addJogo(j);                         //Times desse jogo guardam referência ao jogo que realizaram.
           t2.addJogo(j);
        }
        data = data.plusDays(1);
        System.out.println("\n");
        return jogos;
    }
    
    public List<Jogo> getJogosRodada(){
        return this.listaJogos;
    }
    
    @Override
    public String toString(){
        return "Rodada " + this.numeroDaRodada;
    }
    
    public static void jogoReiniciado(){
        numero = 0;
    }
    
    public LocalDateTime getDataJogo(LocalDateTime dataAtual){
        LocalDateTime dataDoJogo = dataAtual;
        int[] horas = {14, 16, 18, 22};
        int[] minutos = {0,30,45};
        if(dataAtual.getDayOfWeek().equals(DayOfWeek.MONDAY)){
                dataDoJogo = dataAtual.plusDays(2);
        }else if(dataAtual.getDayOfWeek().equals(DayOfWeek.TUESDAY)){
                dataDoJogo = dataAtual.plusDays(1);
        }else if(dataAtual.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)){
                dataDoJogo = dataAtual;
        }else if(dataAtual.getDayOfWeek().equals(DayOfWeek.THURSDAY)){
                dataDoJogo = dataAtual;
        }else if(dataAtual.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
                dataDoJogo = dataAtual.plusDays(1);
        }else if(dataAtual.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
                dataDoJogo = dataAtual;
        }else if(dataAtual.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                dataDoJogo = dataAtual;
        }
        LocalTime horaJogo = dataDoJogo.toLocalTime();
        Random sortHoraMinuto = new Random();
        
        horaJogo = horaJogo.withHour(horas[sortHoraMinuto.nextInt(4)]).withMinute(minutos[sortHoraMinuto.nextInt(3)]);
        dataDoJogo = dataDoJogo.with(horaJogo);
        return dataDoJogo;
    }
}
