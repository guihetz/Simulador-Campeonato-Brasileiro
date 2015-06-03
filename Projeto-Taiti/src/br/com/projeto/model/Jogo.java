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
    private Time time1;
    private Time time2;
    private int golTime1, golTime2;
    private int finalizacaoTime1, finalizacaoTime2;
    private double posseDeBolaTime1, posseDeBolaTime2;

    public Jogo(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public Time getTime1() {
        return time1;
    }

    public Time getTime2() {
        return time2;
    }
}
