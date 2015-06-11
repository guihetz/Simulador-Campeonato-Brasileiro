/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Daylton
 */
public class Teste {
    public static void main(String[] args) {
        
         Time t1 = new Time("Palmeiras", new ImageIcon("src/br/com/projeto/image/palmeiras_60x60.png"),12,12,12);
         Time t2 = new Time("Chapecoense", new ImageIcon("src/br/com/projeto/image/chapecoense_60x60.png"),20,30,65);
         
         Jogo jogo1 = new Jogo(t1, t2);
         
         System.out.println("Coeficiente do Time 1: " + t1.getCoeficienteTime() + "\n");
         System.out.println("Coeficiente do Time 2: " + t2.getCoeficienteTime() + "\n");
         
         System.out.println("Posse de Bola T1: " + jogo1.getPosseDeBolaTime1() + "\n");
         System.out.println("Posse de Bola T2: " + jogo1.getPosseDeBolaTime2() + "\n");
         
         System.out.println("Finalizações T1: " + jogo1.getFinalizacaoTime1() + "\n");
         System.out.println("Finalizações T2: " + jogo1.getFinalizacaoTime2() + "\n");
         
         System.out.println("Gols T1: " + jogo1.getGolTime1() + "\n");
         System.out.println("Gols T2: " + jogo1.getGolTime2() + "\n");
         
         Font f = new Font("Consolas", Font.BOLD, 32);
         
         JPanel painel = new JPanel();
         GridLayout meuLayout = new GridLayout(4, 3, 5, 5);
         JLabel escudo1 = new JLabel(jogo1.getTime1().getEscudo());
         escudo1.setFont(f);
         escudo1.setHorizontalAlignment(SwingConstants.CENTER);
         escudo1.setVerticalAlignment(SwingConstants.CENTER);
         JLabel escudo2 = new JLabel(jogo1.getTime2().getEscudo());
         escudo2.setFont(f);
         escudo2.setHorizontalAlignment(SwingConstants.CENTER);
         escudo2.setVerticalAlignment(SwingConstants.CENTER);
         JLabel gols1 = new JLabel(String.valueOf(jogo1.getGolTime1()));
         gols1.setFont(f);
         gols1.setHorizontalAlignment(SwingConstants.CENTER);
         gols1.setVerticalAlignment(SwingConstants.CENTER);
         JLabel gols2 = new JLabel(String.valueOf(jogo1.getGolTime2()));
         gols2.setFont(f);
         gols2.setHorizontalAlignment(SwingConstants.CENTER);
         gols2.setVerticalAlignment(SwingConstants.CENTER);
         JLabel finalizacoes1 = new JLabel(String.valueOf(jogo1.getFinalizacaoTime1()));
         finalizacoes1.setFont(f);
         finalizacoes1.setHorizontalAlignment(SwingConstants.CENTER);
         finalizacoes1.setVerticalAlignment(SwingConstants.CENTER);
         JLabel finalizacoes2 = new JLabel(String.valueOf(jogo1.getFinalizacaoTime2()));
         finalizacoes2.setFont(f);
         finalizacoes2.setHorizontalAlignment(SwingConstants.CENTER);
         finalizacoes2.setVerticalAlignment(SwingConstants.CENTER);
         JLabel posse1 = new JLabel((int)jogo1.getPosseDeBolaTime1() + "%");
         posse1.setFont(f);
         posse1.setHorizontalAlignment(SwingConstants.CENTER);
         posse1.setVerticalAlignment(SwingConstants.CENTER);
         JLabel posse2 = new JLabel((int)jogo1.getPosseDeBolaTime2() + "%");
         posse2.setFont(f);
         posse2.setHorizontalAlignment(SwingConstants.CENTER);
         posse2.setVerticalAlignment(SwingConstants.CENTER);
         
         JLabel textoTime = new JLabel("Time");
         textoTime.setFont(f);
         textoTime.setHorizontalAlignment(SwingConstants.CENTER);
         textoTime.setVerticalAlignment(SwingConstants.CENTER);
         JLabel textoGols = new JLabel("Gols");
         textoGols.setFont(f);
         textoGols.setHorizontalAlignment(SwingConstants.CENTER);
         textoGols.setVerticalAlignment(SwingConstants.CENTER);
         JLabel textoFinalizacoes = new JLabel("Finalizações");
         textoFinalizacoes.setFont(f);
         textoFinalizacoes.setHorizontalAlignment(SwingConstants.CENTER);
         textoFinalizacoes.setVerticalAlignment(SwingConstants.CENTER);
         JLabel textoPosse = new JLabel("Posse de Bola");
         textoPosse.setFont(f);
         textoPosse.setHorizontalAlignment(SwingConstants.CENTER);
         textoPosse.setVerticalAlignment(SwingConstants.CENTER);
         
         painel.setLayout(meuLayout);
         painel.setBackground(Color.orange);
         painel.add(textoTime);
         painel.add(escudo1);
         painel.add(escudo2);
         painel.add(textoGols);
         painel.add(gols1);
         painel.add(gols2);
         painel.add(textoFinalizacoes);
         painel.add(finalizacoes1);
         painel.add(finalizacoes2);
         painel.add(textoPosse);
         painel.add(posse1);
         painel.add(posse2);
         
         JOptionPane.showMessageDialog(null, painel, "Info Jogo", JOptionPane.PLAIN_MESSAGE);
         
         
    }
}
