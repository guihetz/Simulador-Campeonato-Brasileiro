/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Guilherme Lourenço
 */
public abstract class Estatistica {
    public static double[] getPosseDeBola(Time t1, Time t2){
        //Método que estima a posse de bola com base no coeficiente do time
        double[] posses = new double[2];
            double posse1, posse2;
            Random p = new Random();
        
        if(t1.getCoeficienteTime()==t2.getCoeficienteTime()){
            //Os coeficientes dos times são iguais.
            if(t1.getCoeficienteTime()==1){
                posse1 = p.nextInt(60) + 20; //minimo 20 maximo 80
                posse2 = 100 - posse1;
                posses[0] = posse1;
                posses[1] = posse2;
            }else if(t1.getCoeficienteTime()==2){
                posse1 = p.nextInt(40) + 30; //minimo 30 maximo 70
                posse2 = 100 - posse1;
                posses[0] = posse1;
                posses[1] = posse2;
            }else if(t1.getCoeficienteTime()==3){
                posse1 = p.nextInt(20) + 40; //minimo 40 maximo 60
                posse2 = 100 - posse1;
                posses[0] = posse1;
                posses[1] = posse2;
            }
        }else if(t1.getCoeficienteTime()>t2.getCoeficienteTime()){
            //O primeiro time tem coeficiente maior que o segundo
            if(t1.getCoeficienteTime()==2){
                //primeiro time tem coeficiente 2 e segundo time tem coeficiente 1
                posse1 = p.nextInt(40) + 40; //minimo 40 maximo 80
                posse2 = 100 - posse1;
                posses[0] = posse1;
                posses[1] = posse2;
            }else if(t1.getCoeficienteTime()==3){
                if(t2.getCoeficienteTime()==2){
                    //primeiro time tem coeficiente 3 e segundo time tem coeficiente 2
                    posse1 = p.nextInt(50) + 30; //minimo 30 maximo 80
                    posse2 = 100 - posse1;
                    posses[0] = posse1;
                    posses[1] = posse2;
                }else{
                    //primeiro time tem coeficiente 3 e segundo time tem coeficiente 1
                    posse1 = p.nextInt(50) + 20; //minimo 20 maximo 70
                    posse2 = 100 - posse1;
                    posses[0] = posse1;
                    posses[1] = posse2;
                }
            }
        }else{
            //O segundo time tem coeficiente maior que o primeiro
            if(t1.getCoeficienteTime()==2){
                //primeiro time tem coeficiente 2 e segundo time tem coeficiente 3
                posse1 = p.nextInt(40) + 20; //minimo 20 maximo 60
                posse2 = 100 - posse1;
                posses[0] = posse1;
                posses[1] = posse2;
            }else if(t1.getCoeficienteTime()==1){
                if(t2.getCoeficienteTime()==2){
                    //primeiro time tem coeficiente 1 e segundo time tem coeficiente 2
                    posse1 = p.nextInt(30) + 20; //minimo 20 maximo 50
                    posse2 = 100 - posse1;
                    posses[0] = posse1;
                    posses[1] = posse2;
                }else{
                    //primeiro time tem coeficiente 1 e segundo time tem coeficiente 3
                    posse1 = p.nextInt(30) + 50; //minimo 50 maximo 80
                    posse2 = 100 - posse1;
                    posses[0] = posse1;
                    posses[1] = posse2;
                }
            }
        }
            
        return posses;
    }
    
    
    public static int[] getGols(Jogo jogo){
        //Método que estima os gols de uma partida
        int[] gols = new int[2];
        int maxGolsTime1 = (int)(jogo.getPosseDeBolaTime1()/10);
        int maxGolsTime2 = (int)(jogo.getPosseDeBolaTime2()/10);
        Random r = new Random();
        if(new Date().getTime() % 7 == 0){
            //fator que pode determinar vitoria para um time com posse de bola menor
            gols[0] = r.nextInt((int)((maxGolsTime1 + maxGolsTime2)/2));
            gols[1] = r.nextInt((int)((maxGolsTime1 + maxGolsTime2)/2));
        }else{
            gols[0] = r.nextInt(maxGolsTime1);
            gols[1] = r.nextInt(maxGolsTime2);
        }
        return gols; 
    }
    
    public static int[] getFinalizacoes(Jogo jogo){
        //Retorna o numero de finalizações dos times de um jogo
        int[] finalizacoes = new int[2];
        int golsTime1 = jogo.getGolTime1();
        int golsTime2 = jogo.getGolTime2();
        
        Random fin = new Random();
        if(golsTime1>=golsTime2){
            finalizacoes[0] = fin.nextInt(5) + golsTime1;
            finalizacoes[1] = fin.nextInt(1) + golsTime2;
        }else{
            finalizacoes[0] = fin.nextInt(1) + golsTime1;
            finalizacoes[1] = fin.nextInt(5) + golsTime2;
        }
        return finalizacoes;
    }
}
