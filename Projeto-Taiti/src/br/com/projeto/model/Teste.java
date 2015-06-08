/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import javax.swing.ImageIcon;

/**
 *
 * @author Daylton
 */
public class Teste {
    public static void main(String[] args) {
        
         Time t1 = new Time("Palmeiras", new ImageIcon("src/br/com/projeto/image/palmeiras_60x60.png"),11,10,2);
         Time t2 = new Time("Chapecoense", new ImageIcon("src/br/com/projeto/image/chapecoense_60x60.png"),11,10,11);
         
         Jogo jogo1 = new Jogo(t1, t2);
         
         System.out.println("Coeficiente do Time 1: " + t1.getCoeficienteTime() + "\n");
         System.out.println("Coeficiente do Time 2: " + t2.getCoeficienteTime() + "\n");
         
         System.out.println("Posse de Bola T1: " + jogo1.getPosseDeBolaTime1() + "\n");
         System.out.println("Posse de Bola T2: " + jogo1.getPosseDeBolaTime2() + "\n");
         
    }
}
