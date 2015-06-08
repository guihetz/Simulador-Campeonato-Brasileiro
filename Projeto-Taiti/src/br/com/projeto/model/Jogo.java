/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

/**
 *
 * @author Daylton
 */
public class Jogo {   
    private final Time time1;
    private final Time time2;
    private int golTime1, golTime2;
    private int finalizacaoTime1, finalizacaoTime2;
    private double[] posseDeBola;

    public Jogo(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
        this.posseDeBola = new double[2];
        this.posseDeBola = Estatistica.getPosseDeBola(time1, time2);
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
        return golTime1;
    }

    public void setGolTime1(int golTime1) {
        //Configura os gols marcados pelo time1.
        this.golTime1 = golTime1;
    }

    public int getGolTime2() {
        //Obtém os gols marcados pelo time2.
        return golTime2;
    }

    public void setGolTime2(int golTime2) {
        //Configura os gols marcados pelo time2.
        this.golTime2 = golTime2;
    }

    public int getFinalizacaoTime1() {
        //Obtém o número de finalizações do time1.
        return finalizacaoTime1;
    }

    public void setFinalizacaoTime1(int finalizacaoTime1) {
        //Configura o número de finalizações do time1.
        this.finalizacaoTime1 = finalizacaoTime1;
    }

    public int getFinalizacaoTime2() {
        //Obtém o número de finalizações do time2.
        return finalizacaoTime2;
    }

    public void setFinalizacaoTime2(int finalizacaoTime2) {
        //Configura o número de finalizações do time2.
        this.finalizacaoTime2 = finalizacaoTime2;
    }

    public double getPosseDeBolaTime1() {
        //Obtém a porcentagem de posse de bola do time1.             
        return posseDeBola[0];
    }

    public void setPosseDeBolaTime1(double posseDeBolaTime1) {
        //Configura a porcentagem de posse de bola do time1.
        this.posseDeBola = posseDeBola;
    }

    public double getPosseDeBolaTime2() {
        //Obtém a porcentagem de posse de bola do time2.     
         return posseDeBola[1];
    }

    public void setPosseDeBolaTime2(double posseDeBolaTime2) {
        //Configura a porcentagem de bola do time2.
        this.posseDeBola = posseDeBola;
    }
    
    
}
