/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import java.util.Random;

/**
 *
 * @author Guilherme Lourenço
 */
public abstract class Estatistica {
    public static double[] getPosseDeBola(Time t1, Time t2){
        double[] posses = new double[2];
        
        if(t1.getCoeficienteTime() == 1 && t2.getCoeficienteTime() == 1){
            double posseT1, posseT2;
            
            Random posse = new Random();
            posseT1 = posse.nextInt(60) + 20;
            posseT2 = 100 - posseT1;
            
            posses[0] = posseT1;
            posses[1] = posseT2;
            
        }else if(t1.getCoeficienteTime() == 2 && t2.getCoeficienteTime() == 2){
            double posseT1, posseT2;
            
            Random posse = new Random();
            posseT1 = posse.nextInt(70) + 30;
            posseT2 = 100 - posseT1;
            
            posses[0] = posseT1;
            posses[1] = posseT2;
            
        }else if(t1.getCoeficienteTime() == 3 && t2.getCoeficienteTime() == 3){
            double posseT1, posseT2;
            
            Random posse = new Random();
            posseT1 = posse.nextInt(60) + 40;
            posseT2 = 100 - posseT1;
            
            posses[0] = posseT1;
            posses[1] = posseT2;
        }
        
        return posses;
    }
}
