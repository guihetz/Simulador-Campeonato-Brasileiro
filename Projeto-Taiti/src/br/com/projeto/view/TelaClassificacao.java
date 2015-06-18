/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.model.ComparadorDePontos;
import br.com.projeto.model.Time;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Guilherme Lourenço
 */
public class TelaClassificacao extends JFrame{
    List<Time> times;    
    JLabel lbEscudo, lbNome, lbPontos, lbVitorias, lbEmpates, lbDerrotas, lbGolsPro, lbGolsContra, lbSaldoDeGols, lbInfo;
    JLabel texto0, texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, texto10, texto11, texto12, texto13, texto14, texto15, texto16, texto17, texto18, texto19, texto20;
    JLabel primeiroEscudo,primeiroNome, primeiroPontos, primeiroVitorias, primeiroEmpates, primeiroDerrotas, primeiroGolsPro, primeiroGolsContra, primeiroSaldoDeGols;
    JButton primeiroInfo;
    JLabel segundoEscudo, segundoNome, segundoPontos, segundoVitorias, segundoEmpates, segundoDerrotas, segundoGolsPro, segundoGolsContra, segundoSaldoDeGols; 
    JButton segundoInfo;
    JLabel terceiroEscudo, terceiroNome, terceiroPontos, terceiroVitorias, terceiroEmpates, terceiroDerrotas, terceiroGolsPro, terceiroGolsContra, terceiroSaldoDeGols; 
    JButton terceiroInfo;
    JLabel quartoEscudo, quartoNome, quartoPontos, quartoVitorias, quartoEmpates, quartoDerrotas, quartoGolsPro, quartoGolsContra, quartoSaldoDeGols; 
    JButton quartoInfo;
    JLabel quintoEscudo, quintoNome, quintoPontos, quintoVitorias, quintoEmpates, quintoDerrotas, quintoGolsPro, quintoGolsContra, quintoSaldoDeGols; 
    JButton quintoInfo;
    JLabel sextoEscudo, sextoNome, sextoPontos, sextoVitorias, sextoEmpates, sextoDerrotas, sextoGolsPro, sextoGolsContra, sextoSaldoDeGols; 
    JButton sextoInfo;
    JLabel setimoEscudo, setimoNome, setimoPontos, setimoVitorias, setimoEmpates, setimoDerrotas, setimoGolsPro, setimoGolsContra, setimoSaldoDeGols; 
    JButton setimoInfo;
    JLabel oitavoEscudo, oitavoNome, oitavoPontos, oitavoVitorias, oitavoEmpates, oitavoDerrotas, oitavoGolsPro, oitavoGolsContra, oitavoSaldoDeGols; 
    JButton oitavoInfo;
    JLabel nonoEscudo, nonoNome, nonoPontos, nonoVitorias, nonoEmpates, nonoDerrotas, nonoGolsPro, nonoGolsContra, nonoSaldoDeGols; 
    JButton nonoInfo;
    JLabel decimoEscudo, decimoNome, decimoPontos, decimoVitorias, decimoEmpates, decimoDerrotas, decimoGolsPro, decimoGolsContra, decimoSaldoDeGols; 
    JButton decimoInfo;
    JLabel decimoPrimeiroEscudo, decimoPrimeiroNome, decimoPrimeiroPontos, decimoPrimeiroVitorias, decimoPrimeiroEmpates, decimoPrimeiroDerrotas, decimoPrimeiroGolsPro, decimoPrimeiroGolsContra, decimoPrimeiroSaldoDeGols; 
    JButton decimoPrimeiroInfo;
    JLabel decimoSegundoEscudo, decimoSegundoNome, decimoSegundoPontos, decimoSegundoVitorias, decimoSegundoEmpates, decimoSegundoDerrotas, decimoSegundoGolsPro, decimoSegundoGolsContra, decimoSegundoSaldoDeGols; 
    JButton decimoSegundoInfo;
    JLabel decimoTerceiroEscudo, decimoTerceiroNome, decimoTerceiroPontos, decimoTerceiroVitorias, decimoTerceiroEmpates, decimoTerceiroDerrotas, decimoTerceiroGolsPro, decimoTerceiroGolsContra, decimoTerceiroSaldoDeGols; 
    JButton decimoTerceiroInfo;
    JLabel decimoQuartoEscudo, decimoQuartoNome, decimoQuartoPontos, decimoQuartoVitorias, decimoQuartoEmpates, decimoQuartoDerrotas, decimoQuartoGolsPro, decimoQuartoGolsContra, decimoQuartoSaldoDeGols; 
    JButton decimoQuartoInfo;
    JLabel decimoQuintoEscudo, decimoQuintoNome, decimoQuintoPontos, decimoQuintoVitorias, decimoQuintoEmpates, decimoQuintoDerrotas, decimoQuintoGolsPro, decimoQuintoGolsContra, decimoQuintoSaldoDeGols; 
    JButton decimoQuintoInfo;
    JLabel decimoSextoEscudo, decimoSextoNome, decimoSextoPontos, decimoSextoVitorias, decimoSextoEmpates, decimoSextoDerrotas, decimoSextoGolsPro, decimoSextoGolsContra, decimoSextoSaldoDeGols; 
    JButton decimoSextoInfo;
    JLabel decimoSetimoEscudo, decimoSetimoNome, decimoSetimoPontos, decimoSetimoVitorias, decimoSetimoEmpates, decimoSetimoDerrotas, decimoSetimoGolsPro, decimoSetimoGolsContra, decimoSetimoSaldoDeGols; 
    JButton decimoSetimoInfo;
    JLabel decimoOitavoEscudo, decimoOitavoNome, decimoOitavoPontos, decimoOitavoVitorias, decimoOitavoEmpates, decimoOitavoDerrotas, decimoOitavoGolsPro, decimoOitavoGolsContra, decimoOitavoSaldoDeGols; 
    JButton decimoOitavoInfo;
    JLabel decimoNonoEscudo, decimoNonoNome, decimoNonoPontos, decimoNonoVitorias, decimoNonoEmpates, decimoNonoDerrotas, decimoNonoGolsPro, decimoNonoGolsContra, decimoNonoSaldoDeGols; 
    JButton decimoNonoInfo;
    JLabel vigesimoEscudo, vigesimoNome, vigesimoPontos, vigesimoVitorias, vigesimoEmpates, vigesimoDerrotas, vigesimoGolsPro, vigesimoGolsContra, vigesimoSaldoDeGols; 
    JButton vigesimoInfo;
    public TelaClassificacao(List<Time> clubes){
        super("Classificação");
        this.setSize(1024, 800);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/logo_campeonato1.png") );
        this.setIconImage(icon);
        this.times = new ArrayList<>();
        Font f = InicioProjeto.getFonte(15);
        for(Time t: clubes){
            this.times.add(t);
        }
        GridLayout layout = new GridLayout(21, 11, 1, 1);
        this.setLayout(layout);
        ComparadorDePontos comparador = new ComparadorDePontos();
        Collections.sort(times,comparador);
        
        
        //montando tabela primeira linha
        texto0 = new JLabel(" / ");
        lbEscudo = new JLabel("Escudo");
        lbNome = new JLabel("Nome");
        lbPontos = new JLabel("Pontos");
        lbVitorias = new JLabel("Vitórias");
        lbEmpates = new JLabel("Empates");
        lbDerrotas = new JLabel("Derrotas");
        lbGolsPro = new JLabel("Gols Pró");
        lbGolsContra = new JLabel("Gols Contra");
        lbSaldoDeGols = new JLabel("Saldo de Gols");
        lbInfo = new JLabel("Info Time");
        
        texto0.setHorizontalAlignment(SwingConstants.CENTER);
        lbEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        lbNome.setHorizontalAlignment(SwingConstants.CENTER);
        lbPontos.setHorizontalAlignment(SwingConstants.CENTER);
        lbVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        lbEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        lbDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        lbGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        lbGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        lbSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        lbInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto0.setVerticalAlignment(SwingConstants.CENTER);
        lbEscudo.setVerticalAlignment(SwingConstants.CENTER);
        lbNome.setVerticalAlignment(SwingConstants.CENTER);
        lbPontos.setVerticalAlignment(SwingConstants.CENTER);
        lbVitorias.setVerticalAlignment(SwingConstants.CENTER);
        lbEmpates.setVerticalAlignment(SwingConstants.CENTER);
        lbDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        lbGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        lbGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        lbSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        lbInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        
        //primeiro colocado
        texto1 = new JLabel(" 1º ");
        ImageIcon img = new ImageIcon(times.get(0).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        primeiroEscudo = new JLabel(img);
        primeiroNome = new JLabel(times.get(0).getNome());
        primeiroPontos = new JLabel(String.valueOf(times.get(0).getPontuacaoAtual()));
        primeiroVitorias = new JLabel(String.valueOf(times.get(0).getVitorias()));
        primeiroEmpates = new JLabel(String.valueOf(times.get(0).getEmpates()));
        primeiroDerrotas = new JLabel(String.valueOf(times.get(0).getDerrotas()));
        primeiroGolsPro = new JLabel(String.valueOf(times.get(0).getGolsPro()));
        primeiroGolsContra = new JLabel(String.valueOf(times.get(0).getGolsContra()));
        primeiroSaldoDeGols = new JLabel(String.valueOf(times.get(0).getSaldoGol()));
        primeiroInfo = new JButton("Info Time");
        primeiroInfo.addActionListener(new acaoInfoListener(times.get(0),1));
        
        texto1.setFont(f);
        primeiroEscudo.setFont(f); 
        primeiroNome.setFont(f); 
        primeiroPontos.setFont(f);
        primeiroVitorias.setFont(f); 
        primeiroEmpates.setFont(f); 
        primeiroDerrotas.setFont(f);
        primeiroGolsPro.setFont(f); 
        primeiroGolsContra.setFont(f);
        primeiroSaldoDeGols.setFont(f); 
        primeiroInfo.setFont(f);
        
        texto1.setOpaque(true);
        primeiroEscudo.setOpaque(true);
        primeiroNome.setOpaque(true);
        primeiroPontos.setOpaque(true);
        primeiroVitorias.setOpaque(true);
        primeiroEmpates.setOpaque(true);
        primeiroDerrotas.setOpaque(true);
        primeiroGolsPro.setOpaque(true);
        primeiroGolsContra.setOpaque(true);
        primeiroSaldoDeGols.setOpaque(true);
        primeiroInfo.setOpaque(true);
        
        texto1.setBackground(Color.BLUE);
        primeiroEscudo.setBackground(Color.BLUE);
        primeiroNome.setBackground(Color.BLUE);
        primeiroPontos.setBackground(Color.BLUE);
        primeiroVitorias.setBackground(Color.BLUE);
        primeiroEmpates.setBackground(Color.BLUE);
        primeiroDerrotas.setBackground(Color.BLUE);
        primeiroGolsPro.setBackground(Color.BLUE);
        primeiroGolsContra.setBackground(Color.BLUE);
        primeiroSaldoDeGols.setBackground(Color.BLUE);
        primeiroInfo.setBackground(Color.BLUE);
        
        texto1.setForeground(Color.WHITE);
        primeiroEscudo.setForeground(Color.WHITE);
        primeiroNome.setForeground(Color.WHITE);
        primeiroPontos.setForeground(Color.WHITE);
        primeiroVitorias.setForeground(Color.WHITE);
        primeiroEmpates.setForeground(Color.WHITE);
        primeiroDerrotas.setForeground(Color.WHITE);
        primeiroGolsPro.setForeground(Color.WHITE);
        primeiroGolsContra.setForeground(Color.WHITE);
        primeiroSaldoDeGols.setForeground(Color.WHITE);
        primeiroInfo.setForeground(Color.WHITE);
        
        texto1.setHorizontalAlignment(SwingConstants.CENTER);
        primeiroEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        primeiroNome.setHorizontalAlignment(SwingConstants.CENTER);
        primeiroPontos.setHorizontalAlignment(SwingConstants.CENTER);
        primeiroVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        primeiroEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        primeiroDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        primeiroGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        primeiroGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        primeiroSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        primeiroInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto1.setVerticalAlignment(SwingConstants.CENTER);
        primeiroEscudo.setVerticalAlignment(SwingConstants.CENTER);
        primeiroNome.setVerticalAlignment(SwingConstants.CENTER);
        primeiroPontos.setVerticalAlignment(SwingConstants.CENTER);
        primeiroVitorias.setVerticalAlignment(SwingConstants.CENTER);
        primeiroEmpates.setVerticalAlignment(SwingConstants.CENTER);
        primeiroDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        primeiroGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        primeiroGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        primeiroSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        primeiroInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //segundo colocado
        texto2 = new JLabel(" 2º ");
        img = new ImageIcon(times.get(1).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        segundoEscudo = new JLabel(img);
        segundoNome = new JLabel(times.get(1).getNome());
        segundoPontos = new JLabel(String.valueOf(times.get(1).getPontuacaoAtual()));
        segundoVitorias = new JLabel(String.valueOf(times.get(1).getVitorias()));
        segundoEmpates = new JLabel(String.valueOf(times.get(1).getEmpates()));
        segundoDerrotas = new JLabel(String.valueOf(times.get(1).getDerrotas()));
        segundoGolsPro = new JLabel(String.valueOf(times.get(1).getGolsPro()));
        segundoGolsContra = new JLabel(String.valueOf(times.get(1).getGolsContra()));
        segundoSaldoDeGols = new JLabel(String.valueOf(times.get(1).getSaldoGol()));
        segundoInfo = new JButton("Info Time");
        segundoInfo.addActionListener(new acaoInfoListener(times.get(1),2));
        
        texto2.setFont(f);
        segundoEscudo.setFont(f); 
        segundoNome.setFont(f); 
        segundoPontos.setFont(f); 
        segundoVitorias.setFont(f); 
        segundoEmpates.setFont(f);
        segundoDerrotas.setFont(f);
        segundoGolsPro.setFont(f);
        segundoGolsContra.setFont(f);
        segundoSaldoDeGols.setFont(f);
        segundoInfo.setFont(f);
        
        texto2.setOpaque(true);
        segundoEscudo.setOpaque(true); 
        segundoNome.setOpaque(true);
        segundoPontos.setOpaque(true);
        segundoVitorias.setOpaque(true); 
        segundoEmpates.setOpaque(true);
        segundoDerrotas.setOpaque(true);
        segundoGolsPro.setOpaque(true);
        segundoGolsContra.setOpaque(true);
        segundoSaldoDeGols.setOpaque(true);
        segundoInfo.setOpaque(true);
        
        texto2.setBackground(Color.BLUE);
        segundoEscudo.setBackground(Color.BLUE); 
        segundoNome.setBackground(Color.BLUE);
        segundoPontos.setBackground(Color.BLUE);
        segundoVitorias.setBackground(Color.BLUE);
        segundoEmpates.setBackground(Color.BLUE);
        segundoDerrotas.setBackground(Color.BLUE);
        segundoGolsPro.setBackground(Color.BLUE);
        segundoGolsContra.setBackground(Color.BLUE);
        segundoSaldoDeGols.setBackground(Color.BLUE);
        segundoInfo.setBackground(Color.BLUE);
        
        texto2.setForeground(Color.WHITE);
        segundoEscudo.setForeground(Color.WHITE);
        segundoNome.setForeground(Color.WHITE);
        segundoPontos.setForeground(Color.WHITE);
        segundoVitorias.setForeground(Color.WHITE);
        segundoEmpates.setForeground(Color.WHITE);
        segundoDerrotas.setForeground(Color.WHITE);
        segundoGolsPro.setForeground(Color.WHITE);
        segundoGolsContra.setForeground(Color.WHITE);
        segundoSaldoDeGols.setForeground(Color.WHITE);
        segundoInfo.setForeground(Color.WHITE);
        
        texto2.setHorizontalAlignment(SwingConstants.CENTER);
        segundoEscudo.setHorizontalAlignment(SwingConstants.CENTER); 
        segundoNome.setHorizontalAlignment(SwingConstants.CENTER); 
        segundoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        segundoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        segundoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        segundoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        segundoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        segundoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        segundoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        segundoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto2.setVerticalAlignment(SwingConstants.CENTER);
        segundoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        segundoNome.setVerticalAlignment(SwingConstants.CENTER);
        segundoPontos.setVerticalAlignment(SwingConstants.CENTER);
        segundoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        segundoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        segundoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        segundoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        segundoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        segundoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        segundoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //terceiro colocado
        texto3 = new JLabel(" 3º ");
        img = new ImageIcon(times.get(2).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        terceiroEscudo = new JLabel(img);
        terceiroNome = new JLabel(times.get(2).getNome());
        terceiroPontos = new JLabel(String.valueOf(times.get(2).getPontuacaoAtual()));
        terceiroVitorias = new JLabel(String.valueOf(times.get(2).getVitorias()));
        terceiroEmpates = new JLabel(String.valueOf(times.get(2).getEmpates()));
        terceiroDerrotas = new JLabel(String.valueOf(times.get(2).getDerrotas()));
        terceiroGolsPro = new JLabel(String.valueOf(times.get(2).getGolsPro()));
        terceiroGolsContra = new JLabel(String.valueOf(times.get(2).getGolsContra()));
        terceiroSaldoDeGols = new JLabel(String.valueOf(times.get(2).getSaldoGol()));
        terceiroInfo = new JButton("Info Time");
        terceiroInfo.addActionListener(new acaoInfoListener(times.get(2),3));
        
        texto3.setFont(f);
        terceiroEscudo.setFont(f);
        terceiroNome.setFont(f);
        terceiroPontos.setFont(f);
        terceiroVitorias.setFont(f);
        terceiroEmpates.setFont(f);
        terceiroDerrotas.setFont(f);
        terceiroGolsPro.setFont(f);
        terceiroGolsContra.setFont(f);
        terceiroSaldoDeGols.setFont(f);
        terceiroInfo.setFont(f);
        
        texto3.setOpaque(true);
        terceiroEscudo.setOpaque(true);
        terceiroNome.setOpaque(true);
        terceiroPontos.setOpaque(true);
        terceiroVitorias.setOpaque(true);
        terceiroEmpates.setOpaque(true);
        terceiroDerrotas.setOpaque(true);
        terceiroGolsPro.setOpaque(true);
        terceiroGolsContra.setOpaque(true);
        terceiroSaldoDeGols.setOpaque(true);
        terceiroInfo.setOpaque(true);
        
        texto3.setBackground(Color.BLUE);
        terceiroEscudo.setBackground(Color.BLUE);
        terceiroNome.setBackground(Color.BLUE);
        terceiroPontos.setBackground(Color.BLUE);
        terceiroVitorias.setBackground(Color.BLUE);
        terceiroEmpates.setBackground(Color.BLUE);
        terceiroDerrotas.setBackground(Color.BLUE);
        terceiroGolsPro.setBackground(Color.BLUE);
        terceiroGolsContra.setBackground(Color.BLUE);
        terceiroSaldoDeGols.setBackground(Color.BLUE);
        terceiroInfo.setBackground(Color.BLUE);
        
        texto3.setForeground(Color.WHITE);
        terceiroEscudo.setForeground(Color.WHITE);
        terceiroNome.setForeground(Color.WHITE);
        terceiroPontos.setForeground(Color.WHITE);
        terceiroVitorias.setForeground(Color.WHITE);
        terceiroEmpates.setForeground(Color.WHITE);
        terceiroDerrotas.setForeground(Color.WHITE);
        terceiroGolsPro.setForeground(Color.WHITE);
        terceiroGolsContra.setForeground(Color.WHITE);
        terceiroSaldoDeGols.setForeground(Color.WHITE);
        terceiroInfo.setForeground(Color.WHITE);
        
        texto3.setHorizontalAlignment(SwingConstants.CENTER);
        terceiroEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        terceiroNome.setHorizontalAlignment(SwingConstants.CENTER);
        terceiroPontos.setHorizontalAlignment(SwingConstants.CENTER);
        terceiroVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        terceiroEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        terceiroDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        terceiroGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        terceiroGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        terceiroSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        terceiroInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto3.setVerticalAlignment(SwingConstants.CENTER);
        terceiroEscudo.setVerticalAlignment(SwingConstants.CENTER);
        terceiroNome.setVerticalAlignment(SwingConstants.CENTER);
        terceiroPontos.setVerticalAlignment(SwingConstants.CENTER);
        terceiroVitorias.setVerticalAlignment(SwingConstants.CENTER);
        terceiroEmpates.setVerticalAlignment(SwingConstants.CENTER);
        terceiroDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        terceiroGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        terceiroGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        terceiroSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        terceiroInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //quarto colocado
        texto4 = new JLabel(" 4º ");
        img = new ImageIcon(times.get(3).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        quartoEscudo = new JLabel(img);
        quartoNome = new JLabel(times.get(3).getNome());
        quartoPontos = new JLabel(String.valueOf(times.get(3).getPontuacaoAtual()));
        quartoVitorias = new JLabel(String.valueOf(times.get(3).getVitorias()));
        quartoEmpates = new JLabel(String.valueOf(times.get(3).getEmpates()));
        quartoDerrotas = new JLabel(String.valueOf(times.get(3).getDerrotas()));
        quartoGolsPro = new JLabel(String.valueOf(times.get(3).getGolsPro()));
        quartoGolsContra = new JLabel(String.valueOf(times.get(3).getGolsContra()));
        quartoSaldoDeGols = new JLabel(String.valueOf(times.get(3).getSaldoGol()));
        quartoInfo = new JButton("Info Time");
        quartoInfo.addActionListener(new acaoInfoListener(times.get(3),4));
        
        texto4.setFont(f);
        quartoEscudo.setFont(f);
        quartoNome.setFont(f);
        quartoPontos.setFont(f);
        quartoVitorias.setFont(f);
        quartoEmpates.setFont(f);
        quartoDerrotas.setFont(f);
        quartoGolsPro.setFont(f);
        quartoGolsContra.setFont(f);
        quartoSaldoDeGols.setFont(f);
        quartoInfo.setFont(f);
        
        texto4.setOpaque(true);
        quartoEscudo.setOpaque(true);
        quartoNome.setOpaque(true);
        quartoPontos.setOpaque(true);
        quartoVitorias.setOpaque(true);
        quartoEmpates.setOpaque(true);
        quartoDerrotas.setOpaque(true);
        quartoGolsPro.setOpaque(true);
        quartoGolsContra.setOpaque(true);
        quartoSaldoDeGols.setOpaque(true);
        quartoInfo.setOpaque(true);
        
        texto4.setBackground(Color.BLUE);
        quartoEscudo.setBackground(Color.BLUE);
        quartoNome.setBackground(Color.BLUE);
        quartoPontos.setBackground(Color.BLUE);
        quartoVitorias.setBackground(Color.BLUE);
        quartoEmpates.setBackground(Color.BLUE);
        quartoDerrotas.setBackground(Color.BLUE);
        quartoGolsPro.setBackground(Color.BLUE);
        quartoGolsContra.setBackground(Color.BLUE);
        quartoSaldoDeGols.setBackground(Color.BLUE);
        quartoInfo.setBackground(Color.BLUE);
        
        texto4.setForeground(Color.WHITE);
        quartoEscudo.setForeground(Color.WHITE);
        quartoNome.setForeground(Color.WHITE);
        quartoPontos.setForeground(Color.WHITE);
        quartoVitorias.setForeground(Color.WHITE);
        quartoEmpates.setForeground(Color.WHITE);
        quartoDerrotas.setForeground(Color.WHITE);
        quartoGolsPro.setForeground(Color.WHITE);
        quartoGolsContra.setForeground(Color.WHITE);
        quartoSaldoDeGols.setForeground(Color.WHITE);
        quartoInfo.setForeground(Color.WHITE);
        
        texto4.setHorizontalAlignment(SwingConstants.CENTER);
        quartoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        quartoNome.setHorizontalAlignment(SwingConstants.CENTER);
        quartoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        quartoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        quartoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        quartoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        quartoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        quartoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        quartoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        quartoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto4.setVerticalAlignment(SwingConstants.CENTER);
        quartoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        quartoNome.setVerticalAlignment(SwingConstants.CENTER);
        quartoPontos.setVerticalAlignment(SwingConstants.CENTER);
        quartoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        quartoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        quartoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        quartoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        quartoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        quartoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        quartoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //quinto colocado
        texto5 = new JLabel(" 5º ");
        img = new ImageIcon(times.get(4).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        quintoEscudo = new JLabel(img);
        quintoNome = new JLabel(times.get(4).getNome());
        quintoPontos = new JLabel(String.valueOf(times.get(4).getPontuacaoAtual()));
        quintoVitorias = new JLabel(String.valueOf(times.get(4).getVitorias()));
        quintoEmpates = new JLabel(String.valueOf(times.get(4).getEmpates()));
        quintoDerrotas = new JLabel(String.valueOf(times.get(4).getDerrotas()));
        quintoGolsPro = new JLabel(String.valueOf(times.get(4).getGolsPro()));
        quintoGolsContra = new JLabel(String.valueOf(times.get(4).getGolsContra()));
        quintoSaldoDeGols = new JLabel(String.valueOf(times.get(4).getSaldoGol()));
        quintoInfo = new JButton("Info Time");
        quintoInfo.addActionListener(new acaoInfoListener(times.get(4),5));
        
        texto5.setFont(f);
        quintoEscudo.setFont(f);
        quintoNome.setFont(f);
        quintoPontos.setFont(f);
        quintoVitorias.setFont(f);
        quintoEmpates.setFont(f);
        quintoDerrotas.setFont(f);
        quintoGolsPro.setFont(f);
        quintoGolsContra.setFont(f);
        quintoSaldoDeGols.setFont(f);
        quintoInfo.setFont(f);
        
        texto5.setHorizontalAlignment(SwingConstants.CENTER);
        quintoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        quintoNome.setHorizontalAlignment(SwingConstants.CENTER);
        quintoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        quintoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        quintoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        quintoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        quintoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        quintoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        quintoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        quintoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto5.setVerticalAlignment(SwingConstants.CENTER);
        quintoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        quintoNome.setVerticalAlignment(SwingConstants.CENTER);
        quintoPontos.setVerticalAlignment(SwingConstants.CENTER);
        quintoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        quintoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        quintoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        quintoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        quintoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        quintoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        quintoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //sexto colocado
        texto6 = new JLabel(" 6º ");
        img = new ImageIcon(times.get(5).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        sextoEscudo = new JLabel(img);
        sextoNome = new JLabel(times.get(5).getNome());
        sextoPontos = new JLabel(String.valueOf(times.get(5).getPontuacaoAtual()));
        sextoVitorias = new JLabel(String.valueOf(times.get(5).getVitorias()));
        sextoEmpates = new JLabel(String.valueOf(times.get(5).getEmpates()));
        sextoDerrotas = new JLabel(String.valueOf(times.get(5).getDerrotas()));
        sextoGolsPro = new JLabel(String.valueOf(times.get(5).getGolsPro()));
        sextoGolsContra = new JLabel(String.valueOf(times.get(5).getGolsContra()));
        sextoSaldoDeGols = new JLabel(String.valueOf(times.get(5).getSaldoGol()));
        sextoInfo = new JButton("Info Time");
        sextoInfo.addActionListener(new acaoInfoListener(times.get(5),6));
        
        texto6.setFont(f);
        sextoEscudo.setFont(f);
        sextoNome.setFont(f);
        sextoPontos.setFont(f);
        sextoVitorias.setFont(f);
        sextoEmpates.setFont(f);
        sextoDerrotas.setFont(f);
        sextoGolsPro.setFont(f);
        sextoGolsContra.setFont(f);
        sextoSaldoDeGols.setFont(f);
        sextoInfo.setFont(f);
        
        texto6.setHorizontalAlignment(SwingConstants.CENTER);
        sextoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        sextoNome.setHorizontalAlignment(SwingConstants.CENTER);
        sextoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        sextoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        sextoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        sextoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        sextoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        sextoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        sextoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        sextoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto6.setVerticalAlignment(SwingConstants.CENTER);
        sextoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        sextoNome.setVerticalAlignment(SwingConstants.CENTER);
        sextoPontos.setVerticalAlignment(SwingConstants.CENTER);
        sextoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        sextoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        sextoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        sextoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        sextoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        sextoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        sextoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //setimo colocado
        texto7 = new JLabel(" 7º ");
        img = new ImageIcon(times.get(6).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        setimoEscudo = new JLabel(img);
        setimoNome = new JLabel(times.get(6).getNome());
        setimoPontos = new JLabel(String.valueOf(times.get(6).getPontuacaoAtual()));
        setimoVitorias = new JLabel(String.valueOf(times.get(6).getVitorias()));
        setimoEmpates = new JLabel(String.valueOf(times.get(6).getEmpates()));
        setimoDerrotas = new JLabel(String.valueOf(times.get(6).getDerrotas()));
        setimoGolsPro = new JLabel(String.valueOf(times.get(6).getGolsPro()));
        setimoGolsContra = new JLabel(String.valueOf(times.get(6).getGolsContra()));
        setimoSaldoDeGols = new JLabel(String.valueOf(times.get(6).getSaldoGol()));
        setimoInfo = new JButton("Info Time");
        setimoInfo.addActionListener(new acaoInfoListener(times.get(6),7));
        
        texto7.setFont(f);
        setimoEscudo.setFont(f);
        setimoNome.setFont(f);
        setimoPontos.setFont(f);
        setimoVitorias.setFont(f);
        setimoEmpates.setFont(f);
        setimoDerrotas.setFont(f);
        setimoGolsPro.setFont(f);
        setimoGolsContra.setFont(f);
        setimoSaldoDeGols.setFont(f);
        setimoInfo.setFont(f);
        
        texto7.setHorizontalAlignment(SwingConstants.CENTER);
        setimoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        setimoNome.setHorizontalAlignment(SwingConstants.CENTER);
        setimoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        setimoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        setimoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        setimoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        setimoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        setimoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        setimoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        setimoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto7.setVerticalAlignment(SwingConstants.CENTER);
        setimoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        setimoNome.setVerticalAlignment(SwingConstants.CENTER);
        setimoPontos.setVerticalAlignment(SwingConstants.CENTER);
        setimoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        setimoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        setimoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        setimoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        setimoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        setimoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        setimoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //oitavo colocado
        texto8 = new JLabel(" 8º ");
        img = new ImageIcon(times.get(7).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        oitavoEscudo = new JLabel(img);
        oitavoNome = new JLabel(times.get(7).getNome());
        oitavoPontos = new JLabel(String.valueOf(times.get(7).getPontuacaoAtual()));
        oitavoVitorias = new JLabel(String.valueOf(times.get(7).getVitorias()));
        oitavoEmpates = new JLabel(String.valueOf(times.get(7).getEmpates()));
        oitavoDerrotas = new JLabel(String.valueOf(times.get(7).getDerrotas()));
        oitavoGolsPro = new JLabel(String.valueOf(times.get(7).getGolsPro()));
        oitavoGolsContra = new JLabel(String.valueOf(times.get(7).getGolsContra()));
        oitavoSaldoDeGols = new JLabel(String.valueOf(times.get(7).getSaldoGol()));
        oitavoInfo = new JButton("Info Time");
        oitavoInfo.addActionListener(new acaoInfoListener(times.get(7),8));
        
        texto8.setFont(f);
        oitavoEscudo.setFont(f);
        oitavoNome.setFont(f);
        oitavoPontos.setFont(f);
        oitavoVitorias.setFont(f);
        oitavoEmpates.setFont(f);
        oitavoDerrotas.setFont(f);
        oitavoGolsPro.setFont(f);
        oitavoGolsContra.setFont(f);
        oitavoSaldoDeGols.setFont(f);
        oitavoInfo.setFont(f);
        
        texto8.setHorizontalAlignment(SwingConstants.CENTER);
        oitavoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        oitavoNome.setHorizontalAlignment(SwingConstants.CENTER);
        oitavoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        oitavoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        oitavoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        oitavoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        oitavoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        oitavoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        oitavoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        oitavoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto8.setVerticalAlignment(SwingConstants.CENTER);
        oitavoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        oitavoNome.setVerticalAlignment(SwingConstants.CENTER);
        oitavoPontos.setVerticalAlignment(SwingConstants.CENTER);
        oitavoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        oitavoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        oitavoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        oitavoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        oitavoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        oitavoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        oitavoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //nono colocado
        texto9 = new JLabel(" 9º ");
        img = new ImageIcon(times.get(8).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        nonoEscudo = new JLabel(img);
        nonoNome = new JLabel(times.get(8).getNome());
        nonoPontos = new JLabel(String.valueOf(times.get(8).getPontuacaoAtual()));
        nonoVitorias = new JLabel(String.valueOf(times.get(8).getVitorias()));
        nonoEmpates = new JLabel(String.valueOf(times.get(8).getEmpates()));
        nonoDerrotas = new JLabel(String.valueOf(times.get(8).getDerrotas()));
        nonoGolsPro = new JLabel(String.valueOf(times.get(8).getGolsPro()));
        nonoGolsContra = new JLabel(String.valueOf(times.get(8).getGolsContra()));
        nonoSaldoDeGols = new JLabel(String.valueOf(times.get(8).getSaldoGol()));
        nonoInfo = new JButton("Info Time");
        nonoInfo.addActionListener(new acaoInfoListener(times.get(8),9));
        
        texto9.setFont(f);
        nonoEscudo.setFont(f);
        nonoNome.setFont(f);
        nonoPontos.setFont(f);
        nonoVitorias.setFont(f);
        nonoEmpates.setFont(f);
        nonoDerrotas.setFont(f);
        nonoGolsPro.setFont(f);
        nonoGolsContra.setFont(f);
        nonoSaldoDeGols.setFont(f);
        nonoInfo.setFont(f);
        
        texto9.setHorizontalAlignment(SwingConstants.CENTER);
        nonoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        nonoNome.setHorizontalAlignment(SwingConstants.CENTER);
        nonoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        nonoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        nonoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        nonoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        nonoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        nonoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        nonoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        nonoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto9.setVerticalAlignment(SwingConstants.CENTER);
        nonoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        nonoNome.setVerticalAlignment(SwingConstants.CENTER);
        nonoPontos.setVerticalAlignment(SwingConstants.CENTER);
        nonoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        nonoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        nonoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        nonoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        nonoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        nonoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        nonoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //decimo colocado
        texto10 = new JLabel(" 10º ");
        img = new ImageIcon(times.get(9).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        decimoEscudo = new JLabel(img);
        decimoNome = new JLabel(times.get(9).getNome());
        decimoPontos = new JLabel(String.valueOf(times.get(9).getPontuacaoAtual()));
        decimoVitorias = new JLabel(String.valueOf(times.get(9).getVitorias()));
        decimoEmpates = new JLabel(String.valueOf(times.get(9).getEmpates()));
        decimoDerrotas = new JLabel(String.valueOf(times.get(9).getDerrotas()));
        decimoGolsPro = new JLabel(String.valueOf(times.get(9).getGolsPro()));
        decimoGolsContra = new JLabel(String.valueOf(times.get(9).getGolsContra()));
        decimoSaldoDeGols = new JLabel(String.valueOf(times.get(9).getSaldoGol()));
        decimoInfo = new JButton("Info Time");
        decimoInfo.addActionListener(new acaoInfoListener(times.get(9),10));
        
        texto10.setFont(f);
        decimoEscudo.setFont(f);
        decimoNome.setFont(f);
        decimoPontos.setFont(f);
        decimoVitorias.setFont(f);
        decimoEmpates.setFont(f);
        decimoDerrotas.setFont(f);
        decimoGolsPro.setFont(f);
        decimoGolsContra.setFont(f);
        decimoSaldoDeGols.setFont(f);
        decimoInfo.setFont(f);
        
        texto10.setHorizontalAlignment(SwingConstants.CENTER);
        decimoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNome.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        decimoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        decimoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        decimoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        decimoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        decimoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        decimoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto10.setVerticalAlignment(SwingConstants.CENTER);
        decimoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        decimoNome.setVerticalAlignment(SwingConstants.CENTER);
        decimoPontos.setVerticalAlignment(SwingConstants.CENTER);
        decimoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        decimoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        decimoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        decimoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        decimoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        decimoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        decimoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //decimo primeiro colocado
        texto11 = new JLabel(" 11º ");
        img = new ImageIcon(times.get(10).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        decimoPrimeiroEscudo = new JLabel(img);
        decimoPrimeiroNome = new JLabel(times.get(10).getNome());
        decimoPrimeiroPontos = new JLabel(String.valueOf(times.get(10).getPontuacaoAtual()));
        decimoPrimeiroVitorias = new JLabel(String.valueOf(times.get(10).getVitorias()));
        decimoPrimeiroEmpates = new JLabel(String.valueOf(times.get(10).getEmpates()));
        decimoPrimeiroDerrotas = new JLabel(String.valueOf(times.get(10).getDerrotas()));
        decimoPrimeiroGolsPro = new JLabel(String.valueOf(times.get(10).getGolsPro()));
        decimoPrimeiroGolsContra = new JLabel(String.valueOf(times.get(10).getGolsContra()));
        decimoPrimeiroSaldoDeGols = new JLabel(String.valueOf(times.get(10).getSaldoGol()));
        decimoPrimeiroInfo = new JButton("Info Time");
        decimoPrimeiroInfo.addActionListener(new acaoInfoListener(times.get(10),11));
        
        texto11.setFont(f);
        decimoPrimeiroEscudo.setFont(f);
        decimoPrimeiroNome.setFont(f);
        decimoPrimeiroPontos.setFont(f);
        decimoPrimeiroVitorias.setFont(f);
        decimoPrimeiroEmpates.setFont(f);
        decimoPrimeiroDerrotas.setFont(f);
        decimoPrimeiroGolsPro.setFont(f);
        decimoPrimeiroGolsContra.setFont(f);
        decimoPrimeiroSaldoDeGols.setFont(f);
        decimoPrimeiroInfo.setFont(f);
        
        texto11.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPrimeiroEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPrimeiroNome.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPrimeiroPontos.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPrimeiroVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPrimeiroEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPrimeiroDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPrimeiroGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPrimeiroGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPrimeiroSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        decimoPrimeiroInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto11.setVerticalAlignment(SwingConstants.CENTER);
        decimoPrimeiroEscudo.setVerticalAlignment(SwingConstants.CENTER);
        decimoPrimeiroNome.setVerticalAlignment(SwingConstants.CENTER);
        decimoPrimeiroPontos.setVerticalAlignment(SwingConstants.CENTER);
        decimoPrimeiroVitorias.setVerticalAlignment(SwingConstants.CENTER);
        decimoPrimeiroEmpates.setVerticalAlignment(SwingConstants.CENTER);
        decimoPrimeiroDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        decimoPrimeiroGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        decimoPrimeiroGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        decimoPrimeiroSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        decimoPrimeiroInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //decimo segundo colocado
        texto12 = new JLabel(" 12º ");
        img = new ImageIcon(times.get(11).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        decimoSegundoEscudo = new JLabel(img);
        decimoSegundoNome = new JLabel(times.get(11).getNome());
        decimoSegundoPontos = new JLabel(String.valueOf(times.get(11).getPontuacaoAtual()));
        decimoSegundoVitorias = new JLabel(String.valueOf(times.get(11).getVitorias()));
        decimoSegundoEmpates = new JLabel(String.valueOf(times.get(11).getEmpates()));
        decimoSegundoDerrotas = new JLabel(String.valueOf(times.get(11).getDerrotas()));
        decimoSegundoGolsPro = new JLabel(String.valueOf(times.get(11).getGolsPro()));
        decimoSegundoGolsContra = new JLabel(String.valueOf(times.get(11).getGolsContra()));
        decimoSegundoSaldoDeGols = new JLabel(String.valueOf(times.get(11).getSaldoGol()));
        decimoSegundoInfo = new JButton("Info Time");
        decimoSegundoInfo.addActionListener(new acaoInfoListener(times.get(11),12));
        
        texto12.setFont(f);
        decimoSegundoEscudo.setFont(f);
        decimoSegundoNome.setFont(f);
        decimoSegundoPontos.setFont(f);
        decimoSegundoVitorias.setFont(f);
        decimoSegundoEmpates.setFont(f);
        decimoSegundoDerrotas.setFont(f);
        decimoSegundoGolsPro.setFont(f);
        decimoSegundoGolsContra.setFont(f);
        decimoSegundoSaldoDeGols.setFont(f);
        decimoSegundoInfo.setFont(f);
        
        texto12.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSegundoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSegundoNome.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSegundoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSegundoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSegundoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSegundoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSegundoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSegundoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSegundoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSegundoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto12.setVerticalAlignment(SwingConstants.CENTER);
        decimoSegundoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        decimoSegundoNome.setVerticalAlignment(SwingConstants.CENTER);
        decimoSegundoPontos.setVerticalAlignment(SwingConstants.CENTER);
        decimoSegundoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        decimoSegundoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        decimoSegundoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        decimoSegundoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        decimoSegundoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        decimoSegundoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        decimoSegundoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //decimo terceiro colocado
        texto13 = new JLabel(" 13º ");
        img = new ImageIcon(times.get(12).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        decimoTerceiroEscudo = new JLabel(img);
        decimoTerceiroNome = new JLabel(times.get(12).getNome());
        decimoTerceiroPontos = new JLabel(String.valueOf(times.get(12).getPontuacaoAtual()));
        decimoTerceiroVitorias = new JLabel(String.valueOf(times.get(12).getVitorias()));
        decimoTerceiroEmpates = new JLabel(String.valueOf(times.get(12).getEmpates()));
        decimoTerceiroDerrotas = new JLabel(String.valueOf(times.get(12).getDerrotas()));
        decimoTerceiroGolsPro = new JLabel(String.valueOf(times.get(12).getGolsPro()));
        decimoTerceiroGolsContra = new JLabel(String.valueOf(times.get(12).getGolsContra()));
        decimoTerceiroSaldoDeGols = new JLabel(String.valueOf(times.get(12).getSaldoGol()));
        decimoTerceiroInfo = new JButton("Info Time");
        decimoTerceiroInfo.addActionListener(new acaoInfoListener(times.get(12),13));
        
        texto13.setFont(f);
        decimoTerceiroEscudo.setFont(f);
        decimoTerceiroNome.setFont(f);
        decimoTerceiroPontos.setFont(f);
        decimoTerceiroVitorias.setFont(f);
        decimoTerceiroEmpates.setFont(f);
        decimoTerceiroDerrotas.setFont(f);
        decimoTerceiroGolsPro.setFont(f);
        decimoTerceiroGolsContra.setFont(f);
        decimoTerceiroSaldoDeGols.setFont(f);
        decimoTerceiroInfo.setFont(f);
        
        texto13.setHorizontalAlignment(SwingConstants.CENTER);
        decimoTerceiroEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        decimoTerceiroNome.setHorizontalAlignment(SwingConstants.CENTER);
        decimoTerceiroPontos.setHorizontalAlignment(SwingConstants.CENTER);
        decimoTerceiroVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        decimoTerceiroEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        decimoTerceiroDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        decimoTerceiroGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        decimoTerceiroGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        decimoTerceiroSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        decimoTerceiroInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto13.setVerticalAlignment(SwingConstants.CENTER);
        decimoTerceiroEscudo.setVerticalAlignment(SwingConstants.CENTER);
        decimoTerceiroNome.setVerticalAlignment(SwingConstants.CENTER);
        decimoTerceiroPontos.setVerticalAlignment(SwingConstants.CENTER);
        decimoTerceiroVitorias.setVerticalAlignment(SwingConstants.CENTER);
        decimoTerceiroEmpates.setVerticalAlignment(SwingConstants.CENTER);
        decimoTerceiroDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        decimoTerceiroGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        decimoTerceiroGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        decimoTerceiroSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        decimoTerceiroInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //decimo quarto colocado
        texto14 = new JLabel(" 14º ");
        img = new ImageIcon(times.get(13).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        decimoQuartoEscudo = new JLabel(img);
        decimoQuartoNome = new JLabel(times.get(13).getNome());
        decimoQuartoPontos = new JLabel(String.valueOf(times.get(13).getPontuacaoAtual()));
        decimoQuartoVitorias = new JLabel(String.valueOf(times.get(13).getVitorias()));
        decimoQuartoEmpates = new JLabel(String.valueOf(times.get(13).getEmpates()));
        decimoQuartoDerrotas = new JLabel(String.valueOf(times.get(13).getDerrotas()));
        decimoQuartoGolsPro = new JLabel(String.valueOf(times.get(13).getGolsPro()));
        decimoQuartoGolsContra = new JLabel(String.valueOf(times.get(13).getGolsContra()));
        decimoQuartoSaldoDeGols = new JLabel(String.valueOf(times.get(13).getSaldoGol()));
        decimoQuartoInfo = new JButton("Info Time");
        decimoQuartoInfo.addActionListener(new acaoInfoListener(times.get(13),14));
        
        texto14.setFont(f);
        decimoQuartoEscudo.setFont(f);
        decimoQuartoNome.setFont(f);
        decimoQuartoPontos.setFont(f);
        decimoQuartoVitorias.setFont(f);
        decimoQuartoEmpates.setFont(f);
        decimoQuartoDerrotas.setFont(f);
        decimoQuartoGolsPro.setFont(f);
        decimoQuartoGolsContra.setFont(f);
        decimoQuartoSaldoDeGols.setFont(f);
        decimoQuartoInfo.setFont(f);
        
        texto14.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuartoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuartoNome.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuartoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuartoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuartoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuartoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuartoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuartoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuartoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuartoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto14.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuartoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuartoNome.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuartoPontos.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuartoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuartoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuartoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuartoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuartoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuartoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuartoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //decimo quinto colocado
        texto15 = new JLabel(" 15º ");
        img = new ImageIcon(times.get(14).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        decimoQuintoEscudo = new JLabel(img);
        decimoQuintoNome = new JLabel(times.get(14).getNome());
        decimoQuintoPontos = new JLabel(String.valueOf(times.get(14).getPontuacaoAtual()));
        decimoQuintoVitorias = new JLabel(String.valueOf(times.get(14).getVitorias()));
        decimoQuintoEmpates = new JLabel(String.valueOf(times.get(14).getEmpates()));
        decimoQuintoDerrotas = new JLabel(String.valueOf(times.get(14).getDerrotas()));
        decimoQuintoGolsPro = new JLabel(String.valueOf(times.get(14).getGolsPro()));
        decimoQuintoGolsContra = new JLabel(String.valueOf(times.get(14).getGolsContra()));
        decimoQuintoSaldoDeGols = new JLabel(String.valueOf(times.get(14).getSaldoGol()));
        decimoQuintoInfo = new JButton("Info Time");
        decimoQuintoInfo.addActionListener(new acaoInfoListener(times.get(14),15));
        
        texto15.setFont(f);
        decimoQuintoEscudo.setFont(f);
        decimoQuintoNome.setFont(f);
        decimoQuintoPontos.setFont(f);
        decimoQuintoVitorias.setFont(f);
        decimoQuintoEmpates.setFont(f);
        decimoQuintoDerrotas.setFont(f);
        decimoQuintoGolsPro.setFont(f);
        decimoQuintoGolsContra.setFont(f);
        decimoQuintoSaldoDeGols.setFont(f);
        decimoQuintoInfo.setFont(f);
        
        texto15.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuintoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuintoNome.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuintoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuintoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuintoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuintoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuintoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuintoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuintoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        decimoQuintoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto15.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuintoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuintoNome.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuintoPontos.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuintoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuintoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuintoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuintoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuintoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuintoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        decimoQuintoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //decimo sexto colocado
        texto16 = new JLabel(" 16º ");
        img = new ImageIcon(times.get(15).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        decimoSextoEscudo = new JLabel(img);
        decimoSextoNome = new JLabel(times.get(15).getNome());
        decimoSextoPontos = new JLabel(String.valueOf(times.get(15).getPontuacaoAtual()));
        decimoSextoVitorias = new JLabel(String.valueOf(times.get(15).getVitorias()));
        decimoSextoEmpates = new JLabel(String.valueOf(times.get(15).getEmpates()));
        decimoSextoDerrotas = new JLabel(String.valueOf(times.get(15).getDerrotas()));
        decimoSextoGolsPro = new JLabel(String.valueOf(times.get(15).getGolsPro()));
        decimoSextoGolsContra = new JLabel(String.valueOf(times.get(15).getGolsContra()));
        decimoSextoSaldoDeGols = new JLabel(String.valueOf(times.get(15).getSaldoGol()));
        decimoSextoInfo = new JButton("Info Time");
        decimoSextoInfo.addActionListener(new acaoInfoListener(times.get(15),16));
        
        texto16.setFont(f);
        decimoSextoEscudo.setFont(f);
        decimoSextoNome.setFont(f);
        decimoSextoPontos.setFont(f);
        decimoSextoVitorias.setFont(f);
        decimoSextoEmpates.setFont(f);
        decimoSextoDerrotas.setFont(f);
        decimoSextoGolsPro.setFont(f);
        decimoSextoGolsContra.setFont(f);
        decimoSextoSaldoDeGols.setFont(f);
        decimoSextoInfo.setFont(f);
        
        texto16.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSextoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSextoNome.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSextoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSextoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSextoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSextoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSextoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSextoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSextoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSextoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto16.setVerticalAlignment(SwingConstants.CENTER);
        decimoSextoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        decimoSextoNome.setVerticalAlignment(SwingConstants.CENTER);
        decimoSextoPontos.setVerticalAlignment(SwingConstants.CENTER);
        decimoSextoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        decimoSextoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        decimoSextoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        decimoSextoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        decimoSextoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        decimoSextoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        decimoSextoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //decimo setimo colocado
        texto17 = new JLabel(" 17º ");
        img = new ImageIcon(times.get(16).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        decimoSetimoEscudo = new JLabel(img);
        decimoSetimoNome = new JLabel(times.get(16).getNome());
        decimoSetimoPontos = new JLabel(String.valueOf(times.get(16).getPontuacaoAtual()));
        decimoSetimoVitorias = new JLabel(String.valueOf(times.get(16).getVitorias()));
        decimoSetimoEmpates = new JLabel(String.valueOf(times.get(16).getEmpates()));
        decimoSetimoDerrotas = new JLabel(String.valueOf(times.get(16).getDerrotas()));
        decimoSetimoGolsPro = new JLabel(String.valueOf(times.get(16).getGolsPro()));
        decimoSetimoGolsContra = new JLabel(String.valueOf(times.get(16).getGolsContra()));
        decimoSetimoSaldoDeGols = new JLabel(String.valueOf(times.get(16).getSaldoGol()));
        decimoSetimoInfo = new JButton("Info Time");
        decimoSetimoInfo.addActionListener(new acaoInfoListener(times.get(16),17));
        
        texto17.setFont(f);
        decimoSetimoEscudo.setFont(f);
        decimoSetimoNome.setFont(f);
        decimoSetimoPontos.setFont(f);
        decimoSetimoVitorias.setFont(f);
        decimoSetimoEmpates.setFont(f);
        decimoSetimoDerrotas.setFont(f);
        decimoSetimoGolsPro.setFont(f);
        decimoSetimoGolsContra.setFont(f);
        decimoSetimoSaldoDeGols.setFont(f);
        decimoSetimoInfo.setFont(f);
        
        texto17.setOpaque(true);
        decimoSetimoEscudo.setOpaque(true);
        decimoSetimoNome.setOpaque(true);
        decimoSetimoPontos.setOpaque(true);
        decimoSetimoVitorias.setOpaque(true);
        decimoSetimoEmpates.setOpaque(true);
        decimoSetimoDerrotas.setOpaque(true);
        decimoSetimoGolsPro.setOpaque(true);
        decimoSetimoGolsContra.setOpaque(true);
        decimoSetimoSaldoDeGols.setOpaque(true);
        decimoSetimoInfo.setOpaque(true);
        
        texto17.setBackground(Color.RED);
        decimoSetimoEscudo.setBackground(Color.RED);
        decimoSetimoNome.setBackground(Color.RED);
        decimoSetimoPontos.setBackground(Color.RED);
        decimoSetimoVitorias.setBackground(Color.RED);
        decimoSetimoEmpates.setBackground(Color.RED);
        decimoSetimoDerrotas.setBackground(Color.RED);
        decimoSetimoGolsPro.setBackground(Color.RED);
        decimoSetimoGolsContra.setBackground(Color.RED);
        decimoSetimoSaldoDeGols.setBackground(Color.RED);
        decimoSetimoInfo.setBackground(Color.RED);
        
        texto17.setForeground(Color.WHITE);
        decimoSetimoEscudo.setForeground(Color.WHITE);
        decimoSetimoNome.setForeground(Color.WHITE);
        decimoSetimoPontos.setForeground(Color.WHITE);
        decimoSetimoVitorias.setForeground(Color.WHITE);
        decimoSetimoEmpates.setForeground(Color.WHITE);
        decimoSetimoDerrotas.setForeground(Color.WHITE);
        decimoSetimoGolsPro.setForeground(Color.WHITE);
        decimoSetimoGolsContra.setForeground(Color.WHITE);
        decimoSetimoSaldoDeGols.setForeground(Color.WHITE);
        decimoSetimoInfo.setForeground(Color.WHITE);
        
        texto17.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSetimoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSetimoNome.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSetimoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSetimoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSetimoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSetimoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSetimoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSetimoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSetimoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        decimoSetimoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto17.setVerticalAlignment(SwingConstants.CENTER);
        decimoSetimoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        decimoSetimoNome.setVerticalAlignment(SwingConstants.CENTER);
        decimoSetimoPontos.setVerticalAlignment(SwingConstants.CENTER);
        decimoSetimoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        decimoSetimoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        decimoSetimoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        decimoSetimoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        decimoSetimoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        decimoSetimoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        decimoSetimoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //decimo oitavo colocado
        texto18 = new JLabel(" 18º ");
        img = new ImageIcon(times.get(17).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        decimoOitavoEscudo = new JLabel(img);
        decimoOitavoNome = new JLabel(times.get(17).getNome());
        decimoOitavoPontos = new JLabel(String.valueOf(times.get(17).getPontuacaoAtual()));
        decimoOitavoVitorias = new JLabel(String.valueOf(times.get(17).getVitorias()));
        decimoOitavoEmpates = new JLabel(String.valueOf(times.get(17).getEmpates()));
        decimoOitavoDerrotas = new JLabel(String.valueOf(times.get(17).getDerrotas()));
        decimoOitavoGolsPro = new JLabel(String.valueOf(times.get(17).getGolsPro()));
        decimoOitavoGolsContra = new JLabel(String.valueOf(times.get(17).getGolsContra()));
        decimoOitavoSaldoDeGols = new JLabel(String.valueOf(times.get(17).getSaldoGol()));
        decimoOitavoInfo = new JButton("Info Time");
        decimoOitavoInfo.addActionListener(new acaoInfoListener(times.get(17),18));
        
        texto18.setFont(f);
        decimoOitavoEscudo.setFont(f);
        decimoOitavoNome.setFont(f);
        decimoOitavoPontos.setFont(f);
        decimoOitavoVitorias.setFont(f);
        decimoOitavoEmpates.setFont(f);
        decimoOitavoDerrotas.setFont(f);
        decimoOitavoGolsPro.setFont(f);
        decimoOitavoGolsContra.setFont(f);
        decimoOitavoSaldoDeGols.setFont(f);
        decimoOitavoInfo.setFont(f);
        
        texto18.setOpaque(true);
        decimoOitavoEscudo.setOpaque(true);
        decimoOitavoNome.setOpaque(true);
        decimoOitavoPontos.setOpaque(true);
        decimoOitavoVitorias.setOpaque(true);
        decimoOitavoEmpates.setOpaque(true);
        decimoOitavoDerrotas.setOpaque(true);
        decimoOitavoGolsPro.setOpaque(true);
        decimoOitavoGolsContra.setOpaque(true);
        decimoOitavoSaldoDeGols.setOpaque(true);
        decimoOitavoInfo.setOpaque(true);
        
        texto18.setBackground(Color.RED);
        decimoOitavoEscudo.setBackground(Color.RED);
        decimoOitavoNome.setBackground(Color.RED);
        decimoOitavoPontos.setBackground(Color.RED);
        decimoOitavoVitorias.setBackground(Color.RED);
        decimoOitavoEmpates.setBackground(Color.RED);
        decimoOitavoDerrotas.setBackground(Color.RED);
        decimoOitavoGolsPro.setBackground(Color.RED);
        decimoOitavoGolsContra.setBackground(Color.RED);
        decimoOitavoSaldoDeGols.setBackground(Color.RED);
        decimoOitavoInfo.setBackground(Color.RED);
        
        texto18.setForeground(Color.WHITE);
        decimoOitavoEscudo.setForeground(Color.WHITE);
        decimoOitavoNome.setForeground(Color.WHITE);
        decimoOitavoPontos.setForeground(Color.WHITE);
        decimoOitavoVitorias.setForeground(Color.WHITE);
        decimoOitavoEmpates.setForeground(Color.WHITE);
        decimoOitavoDerrotas.setForeground(Color.WHITE);
        decimoOitavoGolsPro.setForeground(Color.WHITE);
        decimoOitavoGolsContra.setForeground(Color.WHITE);
        decimoOitavoSaldoDeGols.setForeground(Color.WHITE);
        decimoOitavoInfo.setForeground(Color.WHITE);
        
        texto18.setHorizontalAlignment(SwingConstants.CENTER);
        decimoOitavoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        decimoOitavoNome.setHorizontalAlignment(SwingConstants.CENTER);
        decimoOitavoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        decimoOitavoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        decimoOitavoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        decimoOitavoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        decimoOitavoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        decimoOitavoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        decimoOitavoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        decimoOitavoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto18.setVerticalAlignment(SwingConstants.CENTER);
        decimoOitavoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        decimoOitavoNome.setVerticalAlignment(SwingConstants.CENTER);
        decimoOitavoPontos.setVerticalAlignment(SwingConstants.CENTER);
        decimoOitavoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        decimoOitavoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        decimoOitavoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        decimoOitavoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        decimoOitavoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        decimoOitavoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        decimoOitavoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //decimo  nono colocado
        texto19 = new JLabel(" 19º ");
        img = new ImageIcon(times.get(18).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        decimoNonoEscudo = new JLabel(img);
        decimoNonoNome = new JLabel(times.get(18).getNome());
        decimoNonoPontos = new JLabel(String.valueOf(times.get(18).getPontuacaoAtual()));
        decimoNonoVitorias = new JLabel(String.valueOf(times.get(18).getVitorias()));
        decimoNonoEmpates = new JLabel(String.valueOf(times.get(18).getEmpates()));
        decimoNonoDerrotas = new JLabel(String.valueOf(times.get(18).getDerrotas()));
        decimoNonoGolsPro = new JLabel(String.valueOf(times.get(18).getGolsPro()));
        decimoNonoGolsContra = new JLabel(String.valueOf(times.get(18).getGolsContra()));
        decimoNonoSaldoDeGols = new JLabel(String.valueOf(times.get(18).getSaldoGol()));
        decimoNonoInfo = new JButton("Info Time");
        decimoNonoInfo.addActionListener(new acaoInfoListener(times.get(18),19));
        
        texto19.setFont(f);
        decimoNonoEscudo.setFont(f);
        decimoNonoNome.setFont(f);
        decimoNonoPontos.setFont(f);
        decimoNonoVitorias.setFont(f);
        decimoNonoEmpates.setFont(f);
        decimoNonoDerrotas.setFont(f);
        decimoNonoGolsPro.setFont(f);
        decimoNonoGolsContra.setFont(f);
        decimoNonoSaldoDeGols.setFont(f);
        decimoNonoInfo.setFont(f);
        
        texto19.setOpaque(true);
        decimoNonoEscudo.setOpaque(true);
        decimoNonoNome.setOpaque(true);
        decimoNonoPontos.setOpaque(true);
        decimoNonoVitorias.setOpaque(true);
        decimoNonoEmpates.setOpaque(true);
        decimoNonoDerrotas.setOpaque(true);
        decimoNonoGolsPro.setOpaque(true);
        decimoNonoGolsContra.setOpaque(true);
        decimoNonoSaldoDeGols.setOpaque(true);
        decimoNonoInfo.setOpaque(true);
        
        texto19.setBackground(Color.RED);
        decimoNonoEscudo.setBackground(Color.RED);
        decimoNonoNome.setBackground(Color.RED);
        decimoNonoPontos.setBackground(Color.RED);
        decimoNonoVitorias.setBackground(Color.RED);
        decimoNonoEmpates.setBackground(Color.RED);
        decimoNonoDerrotas.setBackground(Color.RED);
        decimoNonoGolsPro.setBackground(Color.RED);
        decimoNonoGolsContra.setBackground(Color.RED);
        decimoNonoSaldoDeGols.setBackground(Color.RED);
        decimoNonoInfo.setBackground(Color.RED);
        
        texto19.setForeground(Color.WHITE);
        decimoNonoEscudo.setForeground(Color.WHITE);
        decimoNonoNome.setForeground(Color.WHITE);
        decimoNonoPontos.setForeground(Color.WHITE);
        decimoNonoVitorias.setForeground(Color.WHITE);
        decimoNonoEmpates.setForeground(Color.WHITE);
        decimoNonoDerrotas.setForeground(Color.WHITE);
        decimoNonoGolsPro.setForeground(Color.WHITE);
        decimoNonoGolsContra.setForeground(Color.WHITE);
        decimoNonoSaldoDeGols.setForeground(Color.WHITE);
        decimoNonoInfo.setForeground(Color.WHITE);
        
        texto19.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNonoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNonoNome.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNonoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNonoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNonoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNonoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNonoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNonoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNonoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        decimoNonoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto19.setVerticalAlignment(SwingConstants.CENTER);
        decimoNonoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        decimoNonoNome.setVerticalAlignment(SwingConstants.CENTER);
        decimoNonoPontos.setVerticalAlignment(SwingConstants.CENTER);
        decimoNonoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        decimoNonoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        decimoNonoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        decimoNonoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        decimoNonoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        decimoNonoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        decimoNonoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //vigésimo colocado
        texto20 = new JLabel(" 20º ");
        img = new ImageIcon(times.get(19).getEscudo().getImage());
        img.setImage(img.getImage().getScaledInstance(30, 30, 100));
        vigesimoEscudo = new JLabel(img);
        vigesimoNome = new JLabel(times.get(19).getNome());
        vigesimoPontos = new JLabel(String.valueOf(times.get(19).getPontuacaoAtual()));
        vigesimoVitorias = new JLabel(String.valueOf(times.get(19).getVitorias()));
        vigesimoEmpates = new JLabel(String.valueOf(times.get(19).getEmpates()));
        vigesimoDerrotas = new JLabel(String.valueOf(times.get(19).getDerrotas()));
        vigesimoGolsPro = new JLabel(String.valueOf(times.get(19).getGolsPro()));
        vigesimoGolsContra = new JLabel(String.valueOf(times.get(19).getGolsContra()));
        vigesimoSaldoDeGols = new JLabel(String.valueOf(times.get(19).getSaldoGol()));
        vigesimoInfo = new JButton("Info Time");
        vigesimoInfo.addActionListener(new acaoInfoListener(times.get(19),20));
        
        texto20.setFont(f);
        vigesimoEscudo.setFont(f);
        vigesimoNome.setFont(f);
        vigesimoPontos.setFont(f);
        vigesimoVitorias.setFont(f);
        vigesimoEmpates.setFont(f);
        vigesimoDerrotas.setFont(f);
        vigesimoGolsPro.setFont(f);
        vigesimoGolsContra.setFont(f);
        vigesimoSaldoDeGols.setFont(f);
        vigesimoInfo.setFont(f);
        
        texto20.setOpaque(true);
        vigesimoEscudo.setOpaque(true);
        vigesimoNome.setOpaque(true);
        vigesimoPontos.setOpaque(true);
        vigesimoVitorias.setOpaque(true);
        vigesimoEmpates.setOpaque(true);
        vigesimoDerrotas.setOpaque(true);
        vigesimoGolsPro.setOpaque(true);
        vigesimoGolsContra.setOpaque(true);
        vigesimoSaldoDeGols.setOpaque(true);
        vigesimoInfo.setOpaque(true);
        
        texto20.setBackground(Color.RED);
        vigesimoEscudo.setBackground(Color.RED);
        vigesimoNome.setBackground(Color.RED);
        vigesimoPontos.setBackground(Color.RED);
        vigesimoVitorias.setBackground(Color.RED);
        vigesimoEmpates.setBackground(Color.RED);
        vigesimoDerrotas.setBackground(Color.RED);
        vigesimoGolsPro.setBackground(Color.RED);
        vigesimoGolsContra.setBackground(Color.RED);
        vigesimoSaldoDeGols.setBackground(Color.RED);
        vigesimoInfo.setBackground(Color.RED);
        
        texto20.setForeground(Color.WHITE);
        vigesimoEscudo.setForeground(Color.WHITE);
        vigesimoNome.setForeground(Color.WHITE);
        vigesimoPontos.setForeground(Color.WHITE);
        vigesimoVitorias.setForeground(Color.WHITE);
        vigesimoEmpates.setForeground(Color.WHITE);
        vigesimoDerrotas.setForeground(Color.WHITE);
        vigesimoGolsPro.setForeground(Color.WHITE);
        vigesimoGolsContra.setForeground(Color.WHITE);
        vigesimoSaldoDeGols.setForeground(Color.WHITE);
        vigesimoInfo.setForeground(Color.WHITE);
        
        texto20.setHorizontalAlignment(SwingConstants.CENTER);
        vigesimoEscudo.setHorizontalAlignment(SwingConstants.CENTER);
        vigesimoNome.setHorizontalAlignment(SwingConstants.CENTER);
        vigesimoPontos.setHorizontalAlignment(SwingConstants.CENTER);
        vigesimoVitorias.setHorizontalAlignment(SwingConstants.CENTER);
        vigesimoEmpates.setHorizontalAlignment(SwingConstants.CENTER);
        vigesimoDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
        vigesimoGolsPro.setHorizontalAlignment(SwingConstants.CENTER);
        vigesimoGolsContra.setHorizontalAlignment(SwingConstants.CENTER);
        vigesimoSaldoDeGols.setHorizontalAlignment(SwingConstants.CENTER);
        vigesimoInfo.setHorizontalAlignment(SwingConstants.CENTER);
        
        texto20.setVerticalAlignment(SwingConstants.CENTER);
        vigesimoEscudo.setVerticalAlignment(SwingConstants.CENTER);
        vigesimoNome.setVerticalAlignment(SwingConstants.CENTER);
        vigesimoPontos.setVerticalAlignment(SwingConstants.CENTER);
        vigesimoVitorias.setVerticalAlignment(SwingConstants.CENTER);
        vigesimoEmpates.setVerticalAlignment(SwingConstants.CENTER);
        vigesimoDerrotas.setVerticalAlignment(SwingConstants.CENTER);
        vigesimoGolsPro.setVerticalAlignment(SwingConstants.CENTER);
        vigesimoGolsContra.setVerticalAlignment(SwingConstants.CENTER);
        vigesimoSaldoDeGols.setVerticalAlignment(SwingConstants.CENTER);
        vigesimoInfo.setVerticalAlignment(SwingConstants.CENTER);
        
        //adicionando labels no layout
        this.getContentPane().add(texto0);
        this.getContentPane().add(lbEscudo);
        this.getContentPane().add(lbNome);
        this.getContentPane().add(lbPontos);
        this.getContentPane().add(lbVitorias);
        this.getContentPane().add(lbEmpates);
        this.getContentPane().add(lbDerrotas);
        this.getContentPane().add(lbGolsPro);
        this.getContentPane().add(lbGolsContra);
        this.getContentPane().add(lbSaldoDeGols);
        this.getContentPane().add(lbInfo);
        
        this.getContentPane().add(texto1);
        this.getContentPane().add(primeiroEscudo);
        this.getContentPane().add(primeiroNome);
        this.getContentPane().add(primeiroPontos);
        this.getContentPane().add(primeiroVitorias);
        this.getContentPane().add(primeiroEmpates);
        this.getContentPane().add(primeiroDerrotas);
        this.getContentPane().add(primeiroGolsPro);
        this.getContentPane().add(primeiroGolsContra);
        this.getContentPane().add(primeiroSaldoDeGols);
        this.getContentPane().add(primeiroInfo);
        
        this.getContentPane().add(texto2);
        this.getContentPane().add(segundoEscudo);
        this.getContentPane().add(segundoNome);
        this.getContentPane().add(segundoPontos);
        this.getContentPane().add(segundoVitorias);
        this.getContentPane().add(segundoEmpates);
        this.getContentPane().add(segundoDerrotas);
        this.getContentPane().add(segundoGolsPro);
        this.getContentPane().add(segundoGolsContra);
        this.getContentPane().add(segundoSaldoDeGols);
        this.getContentPane().add(segundoInfo);
        
        this.getContentPane().add(texto3);
        this.getContentPane().add(terceiroEscudo);
        this.getContentPane().add(terceiroNome);
        this.getContentPane().add(terceiroPontos);
        this.getContentPane().add(terceiroVitorias);
        this.getContentPane().add(terceiroEmpates);
        this.getContentPane().add(terceiroDerrotas);
        this.getContentPane().add(terceiroGolsPro);
        this.getContentPane().add(terceiroGolsContra);
        this.getContentPane().add(terceiroSaldoDeGols);
        this.getContentPane().add(terceiroInfo);
        
        this.getContentPane().add(texto4);
        this.getContentPane().add(quartoEscudo);
        this.getContentPane().add(quartoNome);
        this.getContentPane().add(quartoPontos);
        this.getContentPane().add(quartoVitorias);
        this.getContentPane().add(quartoEmpates);
        this.getContentPane().add(quartoDerrotas);
        this.getContentPane().add(quartoGolsPro);
        this.getContentPane().add(quartoGolsContra);
        this.getContentPane().add(quartoSaldoDeGols);
        this.getContentPane().add(quartoInfo);
        
        this.getContentPane().add(texto5);
        this.getContentPane().add(quintoEscudo);
        this.getContentPane().add(quintoNome);
        this.getContentPane().add(quintoPontos);
        this.getContentPane().add(quintoVitorias);
        this.getContentPane().add(quintoEmpates);
        this.getContentPane().add(quintoDerrotas);
        this.getContentPane().add(quintoGolsPro);
        this.getContentPane().add(quintoGolsContra);
        this.getContentPane().add(quintoSaldoDeGols);
        this.getContentPane().add(quintoInfo);
        
        this.getContentPane().add(texto6);
        this.getContentPane().add(sextoEscudo);
        this.getContentPane().add(sextoNome);
        this.getContentPane().add(sextoPontos);
        this.getContentPane().add(sextoVitorias);
        this.getContentPane().add(sextoEmpates);
        this.getContentPane().add(sextoDerrotas);
        this.getContentPane().add(sextoGolsPro);
        this.getContentPane().add(sextoGolsContra);
        this.getContentPane().add(sextoSaldoDeGols);
        this.getContentPane().add(sextoInfo);
        
        this.getContentPane().add(texto7);
        this.getContentPane().add(setimoEscudo);
        this.getContentPane().add(setimoNome);
        this.getContentPane().add(setimoPontos);
        this.getContentPane().add(setimoVitorias);
        this.getContentPane().add(setimoEmpates);
        this.getContentPane().add(setimoDerrotas);
        this.getContentPane().add(setimoGolsPro);
        this.getContentPane().add(setimoGolsContra);
        this.getContentPane().add(setimoSaldoDeGols);
        this.getContentPane().add(setimoInfo);
        
        this.getContentPane().add(texto8);
        this.getContentPane().add(oitavoEscudo);
        this.getContentPane().add(oitavoNome);
        this.getContentPane().add(oitavoPontos);
        this.getContentPane().add(oitavoVitorias);
        this.getContentPane().add(oitavoEmpates);
        this.getContentPane().add(oitavoDerrotas);
        this.getContentPane().add(oitavoGolsPro);
        this.getContentPane().add(oitavoGolsContra);
        this.getContentPane().add(oitavoSaldoDeGols);
        this.getContentPane().add(oitavoInfo);
        
        this.getContentPane().add(texto9);
        this.getContentPane().add(nonoEscudo);
        this.getContentPane().add(nonoNome);
        this.getContentPane().add(nonoPontos);
        this.getContentPane().add(nonoVitorias);
        this.getContentPane().add(nonoEmpates);
        this.getContentPane().add(nonoDerrotas);
        this.getContentPane().add(nonoGolsPro);
        this.getContentPane().add(nonoGolsContra);
        this.getContentPane().add(nonoSaldoDeGols);
        this.getContentPane().add(nonoInfo);
        
        this.getContentPane().add(texto10);
        this.getContentPane().add(decimoEscudo);
        this.getContentPane().add(decimoNome);
        this.getContentPane().add(decimoPontos);
        this.getContentPane().add(decimoVitorias);
        this.getContentPane().add(decimoEmpates);
        this.getContentPane().add(decimoDerrotas);
        this.getContentPane().add(decimoGolsPro);
        this.getContentPane().add(decimoGolsContra);
        this.getContentPane().add(decimoSaldoDeGols);
        this.getContentPane().add(decimoInfo);
        
        this.getContentPane().add(texto11);
        this.getContentPane().add(decimoPrimeiroEscudo);
        this.getContentPane().add(decimoPrimeiroNome);
        this.getContentPane().add(decimoPrimeiroPontos);
        this.getContentPane().add(decimoPrimeiroVitorias);
        this.getContentPane().add(decimoPrimeiroEmpates);
        this.getContentPane().add(decimoPrimeiroDerrotas);
        this.getContentPane().add(decimoPrimeiroGolsPro);
        this.getContentPane().add(decimoPrimeiroGolsContra);
        this.getContentPane().add(decimoPrimeiroSaldoDeGols);
        this.getContentPane().add(decimoPrimeiroInfo);
        
        this.getContentPane().add(texto12);
        this.getContentPane().add(decimoSegundoEscudo);
        this.getContentPane().add(decimoSegundoNome);
        this.getContentPane().add(decimoSegundoPontos);
        this.getContentPane().add(decimoSegundoVitorias);
        this.getContentPane().add(decimoSegundoEmpates);
        this.getContentPane().add(decimoSegundoDerrotas);
        this.getContentPane().add(decimoSegundoGolsPro);
        this.getContentPane().add(decimoSegundoGolsContra);
        this.getContentPane().add(decimoSegundoSaldoDeGols);
        this.getContentPane().add(decimoSegundoInfo);
        
        this.getContentPane().add(texto13);
        this.getContentPane().add(decimoTerceiroEscudo);
        this.getContentPane().add(decimoTerceiroNome);
        this.getContentPane().add(decimoTerceiroPontos);
        this.getContentPane().add(decimoTerceiroVitorias);
        this.getContentPane().add(decimoTerceiroEmpates);
        this.getContentPane().add(decimoTerceiroDerrotas);
        this.getContentPane().add(decimoTerceiroGolsPro);
        this.getContentPane().add(decimoTerceiroGolsContra);
        this.getContentPane().add(decimoTerceiroSaldoDeGols);
        this.getContentPane().add(decimoTerceiroInfo);
        
        this.getContentPane().add(texto14);
        this.getContentPane().add(decimoQuartoEscudo);
        this.getContentPane().add(decimoQuartoNome);
        this.getContentPane().add(decimoQuartoPontos);
        this.getContentPane().add(decimoQuartoVitorias);
        this.getContentPane().add(decimoQuartoEmpates);
        this.getContentPane().add(decimoQuartoDerrotas);
        this.getContentPane().add(decimoQuartoGolsPro);
        this.getContentPane().add(decimoQuartoGolsContra);
        this.getContentPane().add(decimoQuartoSaldoDeGols);
        this.getContentPane().add(decimoQuartoInfo);
        
        this.getContentPane().add(texto15);
        this.getContentPane().add(decimoQuintoEscudo);
        this.getContentPane().add(decimoQuintoNome);
        this.getContentPane().add(decimoQuintoPontos);
        this.getContentPane().add(decimoQuintoVitorias);
        this.getContentPane().add(decimoQuintoEmpates);
        this.getContentPane().add(decimoQuintoDerrotas);
        this.getContentPane().add(decimoQuintoGolsPro);
        this.getContentPane().add(decimoQuintoGolsContra);
        this.getContentPane().add(decimoQuintoSaldoDeGols);
        this.getContentPane().add(decimoQuintoInfo);
        
        this.getContentPane().add(texto16);
        this.getContentPane().add(decimoSextoEscudo);
        this.getContentPane().add(decimoSextoNome);
        this.getContentPane().add(decimoSextoPontos);
        this.getContentPane().add(decimoSextoVitorias);
        this.getContentPane().add(decimoSextoEmpates);
        this.getContentPane().add(decimoSextoDerrotas);
        this.getContentPane().add(decimoSextoGolsPro);
        this.getContentPane().add(decimoSextoGolsContra);
        this.getContentPane().add(decimoSextoSaldoDeGols);
        this.getContentPane().add(decimoSextoInfo);
        
        this.getContentPane().add(texto17);
        this.getContentPane().add(decimoSetimoEscudo);
        this.getContentPane().add(decimoSetimoNome);
        this.getContentPane().add(decimoSetimoPontos);
        this.getContentPane().add(decimoSetimoVitorias);
        this.getContentPane().add(decimoSetimoEmpates);
        this.getContentPane().add(decimoSetimoDerrotas);
        this.getContentPane().add(decimoSetimoGolsPro);
        this.getContentPane().add(decimoSetimoGolsContra);
        this.getContentPane().add(decimoSetimoSaldoDeGols);
        this.getContentPane().add(decimoSetimoInfo);
        
        this.getContentPane().add(texto18);
        this.getContentPane().add(decimoOitavoEscudo);
        this.getContentPane().add(decimoOitavoNome);
        this.getContentPane().add(decimoOitavoPontos);
        this.getContentPane().add(decimoOitavoVitorias);
        this.getContentPane().add(decimoOitavoEmpates);
        this.getContentPane().add(decimoOitavoDerrotas);
        this.getContentPane().add(decimoOitavoGolsPro);
        this.getContentPane().add(decimoOitavoGolsContra);
        this.getContentPane().add(decimoOitavoSaldoDeGols);
        this.getContentPane().add(decimoOitavoInfo);
        
        this.getContentPane().add(texto19);
        this.getContentPane().add(decimoNonoEscudo);
        this.getContentPane().add(decimoNonoNome);
        this.getContentPane().add(decimoNonoPontos);
        this.getContentPane().add(decimoNonoVitorias);
        this.getContentPane().add(decimoNonoEmpates);
        this.getContentPane().add(decimoNonoDerrotas);
        this.getContentPane().add(decimoNonoGolsPro);
        this.getContentPane().add(decimoNonoGolsContra);
        this.getContentPane().add(decimoNonoSaldoDeGols);
        this.getContentPane().add(decimoNonoInfo);
        
        this.getContentPane().add(texto20);
        this.getContentPane().add(vigesimoEscudo);
        this.getContentPane().add(vigesimoNome);
        this.getContentPane().add(vigesimoPontos);
        this.getContentPane().add(vigesimoVitorias);
        this.getContentPane().add(vigesimoEmpates);
        this.getContentPane().add(vigesimoDerrotas);
        this.getContentPane().add(vigesimoGolsPro);
        this.getContentPane().add(vigesimoGolsContra);
        this.getContentPane().add(vigesimoSaldoDeGols);
        this.getContentPane().add(vigesimoInfo);
        this.getContentPane().setBackground(Color.WHITE);
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //tela inicia maximizada
        this.setVisible(true);
    }
   
    
    final class JanelaInfo extends JFrame{
        Time t;
        JPanel painel;
        JLabel escudo;
        JLabel classificacao;
        JLabel pontuacao;
        JLabel mediaGols;
        int posicao;
        public JanelaInfo(Time t, int posicao){
            super("Posições durante a temporada");
            this.t = t;
            this.painel = new JPanel(new GridLayout(5, 1));
            this.posicao = posicao;
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setSize(700, 500);
            ImageIcon img = new ImageIcon(t.getEscudo().getImage());
            img.setImage(img.getImage().getScaledInstance(60, 60, 100));
            this.escudo = new JLabel(img);
            this.escudo.setHorizontalAlignment(SwingConstants.CENTER);
            this.escudo.setVerticalAlignment(SwingConstants.CENTER);
            this.classificacao = new JLabel(String.valueOf(this.posicao) + "º");
            this.classificacao.setHorizontalAlignment(SwingConstants.CENTER);
            this.classificacao.setVerticalAlignment(SwingConstants.CENTER);
            this.classificacao.setFont(InicioProjeto.getFonte(70));
            this.pontuacao = new JLabel(String.valueOf(t.getPontuacaoAtual()) + " pontos");
            this.pontuacao.setFont(InicioProjeto.getFonte(50));
            this.pontuacao.setHorizontalAlignment(SwingConstants.CENTER);
            this.pontuacao.setVerticalAlignment(SwingConstants.CENTER);
            this.mediaGols = new JLabel(String.format("%.2f",(double)t.getGolsPro()/(double)t.getTimesComQuemJogou().size()));
            JLabel textoMedia = new JLabel("media gols/partida");
            textoMedia.setFont(InicioProjeto.getFonte(24));
            textoMedia.setHorizontalAlignment(SwingConstants.CENTER);
            textoMedia.setVerticalAlignment(SwingConstants.CENTER);
            this.mediaGols.setFont(InicioProjeto.getFonte(35));
            this.mediaGols.setHorizontalAlignment(SwingConstants.CENTER);
            this.mediaGols.setVerticalAlignment(SwingConstants.CENTER);
            this.getContentPane().setLayout(new BorderLayout());
            this.criaGrafico(t.getNome(), t.getPosicoes());
            this.painel.setBackground(Color.WHITE);
            this.painel.add(this.escudo);
            this.painel.add(this.classificacao);
            this.painel.add(this.pontuacao);
            this.painel.add(this.mediaGols);
            this.painel.add(textoMedia);
            this.getContentPane().add(this.painel, BorderLayout.EAST);
            
            
            
        }
      
        private CategoryDataset createDataset(String teamName, ArrayList<String> positions){
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                int rodada = 1;
		for(String s: positions){
			dataset.addValue(Double.valueOf(s), teamName, String.valueOf(rodada));
                        rodada++;
		}
                
		return dataset;
	}
        
        public void criaGrafico(String nomeTime, ArrayList<String> posicoes){
		CategoryDataset cds = createDataset(nomeTime, posicoes);
		String titulo = "Evolução na temporada";
		String eixoX = "Rodada";
		String eixoY = "Posição";
		String txt_legenda = "Legenda";
		boolean legenda = true;
		boolean tooltips = true;
		boolean urls = true;
		JFreeChart graf = ChartFactory.createLineChart(titulo, eixoX, eixoY, cds);
                CategoryPlot plot = graf.getCategoryPlot();
                plot.getRenderer().setSeriesPaint(0, Color.BLACK);
                plot.setBackgroundPaint(Color.WHITE);
                //plot.setBackgroundImage(new ImageIcon("src/br/com/projeto/image/loagin.jpg").getImage());
                ValueAxis eixo = plot.getRangeAxis();
                //CategoryItemRenderer renderer = plot.getRenderer();
                //renderer.setSeriesPaint(1, Color.BLACK);
                eixo.setInverted(true);
                eixo.setLowerBound(0);
                eixo.setUpperBound(20);
                
		ChartPanel myChartPanel = new ChartPanel(graf, true);
		myChartPanel.setSize(this.getWidth(), this.getHeight());
		myChartPanel.setVisible(true);
		this.getContentPane().removeAll();
		this.getContentPane().add(myChartPanel, BorderLayout.CENTER);
		this.getContentPane().revalidate();
		this.getContentPane().repaint();
	}
    }
    
    class acaoInfoListener implements ActionListener{

        Time t;
        int classificacao;
        public acaoInfoListener(Time t, int posicao) {
            this.t = t;
            this.classificacao = posicao;
        }

        
        @Override
        public void actionPerformed(ActionEvent e) {
            JanelaInfo janela = new JanelaInfo(t, classificacao);
            janela.setLocationRelativeTo(null);
            janela.setVisible(true);
            
        }
        
    }
}
