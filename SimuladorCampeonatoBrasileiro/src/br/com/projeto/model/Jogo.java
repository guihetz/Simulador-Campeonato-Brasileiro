/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Daylton
 */
public class Jogo {   
    private final Time time1;
    private final Time time2;
    private final int[] gols;
    private final int[] finalizacoes;
    private final double[] posseDeBola;
    private LocalDateTime dataJogo;
    @SuppressWarnings("LeakingThisInConstructor")
    public Jogo(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
        this.posseDeBola = Estatistica.getPosseDeBola(time1, time2);
        this.gols = Estatistica.getGols(this);
        this.finalizacoes = Estatistica.getFinalizacoes(this);
        if(this.gols[0]>this.gols[1]){
            this.time1.addVitoria();
            this.time2.addDerrota();
        }else if(this.gols[0]<this.gols[1]){
            this.time1.addDerrota();
            this.time2.addVitoria();
        }else{
            this.time1.addEmpate();
            this.time2.addEmpate();
        }
        
        
        this.time1.addGolPro(gols[0]);
        this.time1.addGolContra(gols[1]);
        this.time2.addGolPro(gols[1]);
        this.time2.addGolContra(gols[0]);
        
        this.time1.addJogo(this);
        this.time2.addJogo(this);
    }

    public Time getTime1() {
        //Obtém uns dos dois times desse jogo.
        return time1;
    }

    public Time getTime2() {
        //Obtém uns dos dois times desse jogo.
        return time2;
    }

    public int getGolTime1() {
        //Obtém os gols marcados pelo time1.
        return gols[0];
    }
    
    public int getGolTime2() {
        //Obtém os gols marcados pelo time2.
        return gols[1];
    }

    public int getFinalizacaoTime1() {
        //Obtém o número de finalizações do time1.
        return finalizacoes[0];
    }

    public int getFinalizacaoTime2() {
        //Obtém o número de finalizações do time2.
        return finalizacoes[1];
    }

    public double getPosseDeBolaTime1() {
        //Obtém a porcentagem de posse de bola do time1.             
        return posseDeBola[0];
    }

    public double getPosseDeBolaTime2() {
        //Obtém a porcentagem de posse de bola do time2.     
         return posseDeBola[1];
    }
    
    public String getDataJogoString(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm EEEE");
        return this.dataJogo.format(formatador);
    }
    
    public void setDataJogo(LocalDateTime dataJogo){
        this.dataJogo = dataJogo;
    }
    
    @Override
    public String toString(){
        return this.time1.getNome() + " " + this.getGolTime1() + " X " + this.getGolTime2() + " " + this.time2.getNome();
    }
}
