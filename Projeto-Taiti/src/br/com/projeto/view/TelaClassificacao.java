/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.model.ComparadorDePontos;
import br.com.projeto.model.Rodada;
import br.com.projeto.model.Time;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Guilherme Lourenço
 */
public class TelaClassificacao extends JFrame{
    List<Time> times;
    JLabel lbEscudo, lbNome, lbPontos, lbVitorias, lbEmpates, lbDerrotas, lbGolsPro, lbGolsContra, lbSaldoDeGols, lbInfo;
    JLabel texto0, texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, texto10, texto11, texto12, texto13, texto14, texto15, texto16, texto17, texto18, texto19, texto20;
    JLabel primeiroEscudo,primeiroNome, primeiroPontos, primeiroVitorias, primeiroEmpates, primeiroDerrotas, primeiroGolsPro, primeiroGolsContra, primeiroSaldoDeGols, primeiroInfo;
    JLabel segundoEscudo, segundoNome, segundoPontos, segundoVitorias, segundoEmpates, segundoDerrotas, segundoGolsPro, segundoGolsContra, segundoSaldoDeGols, segundoInfo;
    JLabel terceiroEscudo, terceiroNome, terceiroPontos, terceiroVitorias, terceiroEmpates, terceiroDerrotas, terceiroGolsPro, terceiroGolsContra, terceiroSaldoDeGols, terceiroInfo;
    JLabel quartoEscudo, quartoNome, quartoPontos, quartoVitorias, quartoEmpates, quartoDerrotas, quartoGolsPro, quartoGolsContra, quartoSaldoDeGols, quartoInfo;
    JLabel quintoEscudo, quintoNome, quintoPontos, quintoVitorias, quintoEmpates, quintoDerrotas, quintoGolsPro, quintoGolsContra, quintoSaldoDeGols, quintoInfo;
    JLabel sextoEscudo, sextoNome, sextoPontos, sextoVitorias, sextoEmpates, sextoDerrotas, sextoGolsPro, sextoGolsContra, sextoSaldoDeGols, sextoInfo;
    JLabel setimoEscudo, setimoNome, setimoPontos, setimoVitorias, setimoEmpates, setimoDerrotas, setimoGolsPro, setimoGolsContra, setimoSaldoDeGols, setimoInfo;
    JLabel oitavoEscudo, oitavoNome, oitavoPontos, oitavoVitorias, oitavoEmpates, oitavoDerrotas, oitavoGolsPro, oitavoGolsContra, oitavoSaldoDeGols, oitavoInfo;
    JLabel nonoEscudo, nonoNome, nonoPontos, nonoVitorias, nonoEmpates, nonoDerrotas, nonoGolsPro, nonoGolsContra, nonoSaldoDeGols, nonoInfo;
    JLabel decimoEscudo, decimoNome, decimoPontos, decimoVitorias, decimoEmpates, decimoDerrotas, decimoGolsPro, decimoGolsContra, decimoSaldoDeGols, decimoInfo;
    JLabel decimoPrimeiroEscudo, decimoPrimeiroNome, decimoPrimeiroPontos, decimoPrimeiroVitorias, decimoPrimeiroEmpates, decimoPrimeiroDerrotas, decimoPrimeiroGolsPro, decimoPrimeiroGolsContra, decimoPrimeiroSaldoDeGols, decimoPrimeiroInfo;
    JLabel decimoSegundoEscudo, decimoSegundoNome, decimoSegundoPontos, decimoSegundoVitorias, decimoSegundoEmpates, decimoSegundoDerrotas, decimoSegundoGolsPro, decimoSegundoGolsContra, decimoSegundoSaldoDeGols, decimoSegundoInfo;
    JLabel decimoTerceiroEscudo, decimoTerceiroNome, decimoTerceiroPontos, decimoTerceiroVitorias, decimoTerceiroEmpates, decimoTerceiroDerrotas, decimoTerceiroGolsPro, decimoTerceiroGolsContra, decimoTerceiroSaldoDeGols, decimoTerceiroInfo;
    JLabel decimoQuartoEscudo, decimoQuartoNome, decimoQuartoPontos, decimoQuartoVitorias, decimoQuartoEmpates, decimoQuartoDerrotas, decimoQuartoGolsPro, decimoQuartoGolsContra, decimoQuartoSaldoDeGols, decimoQuartoInfo;
    JLabel decimoQuintoEscudo, decimoQuintoNome, decimoQuintoPontos, decimoQuintoVitorias, decimoQuintoEmpates, decimoQuintoDerrotas, decimoQuintoGolsPro, decimoQuintoGolsContra, decimoQuintoSaldoDeGols, decimoQuintoInfo;
    JLabel decimoSextoEscudo, decimoSextoNome, decimoSextoPontos, decimoSextoVitorias, decimoSextoEmpates, decimoSextoDerrotas, decimoSextoGolsPro, decimoSextoGolsContra, decimoSextoSaldoDeGols, decimoSextoInfo;
    JLabel decimoSetimoEscudo, decimoSetimoNome, decimoSetimoPontos, decimoSetimoVitorias, decimoSetimoEmpates, decimoSetimoDerrotas, decimoSetimoGolsPro, decimoSetimoGolsContra, decimoSetimoSaldoDeGols, decimoSetimoInfo;
    JLabel decimoOitavoEscudo, decimoOitavoNome, decimoOitavoPontos, decimoOitavoVitorias, decimoOitavoEmpates, decimoOitavoDerrotas, decimoOitavoGolsPro, decimoOitavoGolsContra, decimoOitavoSaldoDeGols, decimoOitavoInfo;
    JLabel decimoNonoEscudo, decimoNonoNome, decimoNonoPontos, decimoNonoVitorias, decimoNonoEmpates, decimoNonoDerrotas, decimoNonoGolsPro, decimoNonoGolsContra, decimoNonoSaldoDeGols, decimoNonoInfo;
    JLabel vigesimoEscudo, vigesimoNome, vigesimoPontos, vigesimoVitorias, vigesimoEmpates, vigesimoDerrotas, vigesimoGolsPro, vigesimoGolsContra, vigesimoSaldoDeGols, vigesimoInfo;
    public TelaClassificacao(List<Time> clubes){
        super("Classificação");
        this.setSize(1024, 800);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.times = new ArrayList<>();
        for(Time t: clubes){
            this.times.add(t);
        }
        GridLayout layout = new GridLayout(21, 11, 5, 5);
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
        
        //primeiro colocado
        texto1 = new JLabel(" 1º ");
        primeiroEscudo = new JLabel(times.get(0).getEscudo());
        primeiroNome = new JLabel(times.get(0).getNome());
        primeiroPontos = new JLabel(String.valueOf(times.get(0).getPontuacaoAtual()));
        primeiroVitorias = new JLabel(String.valueOf(times.get(0).getVitorias()));
        primeiroEmpates = new JLabel(String.valueOf(times.get(0).getEmpates()));
        primeiroDerrotas = new JLabel(String.valueOf(times.get(0).getDerrotas()));
        primeiroGolsPro = new JLabel(String.valueOf(times.get(0).getGolsPro()));
        primeiroGolsContra = new JLabel(String.valueOf(times.get(0).getGolsContra()));
        primeiroSaldoDeGols = new JLabel(String.valueOf(times.get(0).getSaldoGol()));
        primeiroInfo = new JLabel("Info Time");
        
        //segundo colocado
        texto2 = new JLabel(" 2º ");
        segundoEscudo = new JLabel(times.get(1).getEscudo());
        segundoNome = new JLabel(times.get(1).getNome());
        segundoPontos = new JLabel(String.valueOf(times.get(1).getPontuacaoAtual()));
        segundoVitorias = new JLabel(String.valueOf(times.get(1).getVitorias()));
        segundoEmpates = new JLabel(String.valueOf(times.get(1).getEmpates()));
        segundoDerrotas = new JLabel(String.valueOf(times.get(1).getDerrotas()));
        segundoGolsPro = new JLabel(String.valueOf(times.get(1).getGolsPro()));
        segundoGolsContra = new JLabel(String.valueOf(times.get(1).getGolsContra()));
        segundoSaldoDeGols = new JLabel(String.valueOf(times.get(1).getSaldoGol()));
        segundoInfo = new JLabel("Info Time");
        
        //terceiro colocado
        texto3 = new JLabel(" 3º ");
        terceiroEscudo = new JLabel(times.get(2).getEscudo());
        terceiroNome = new JLabel(times.get(2).getNome());
        terceiroPontos = new JLabel(String.valueOf(times.get(2).getPontuacaoAtual()));
        terceiroVitorias = new JLabel(String.valueOf(times.get(2).getVitorias()));
        terceiroEmpates = new JLabel(String.valueOf(times.get(2).getEmpates()));
        terceiroDerrotas = new JLabel(String.valueOf(times.get(2).getDerrotas()));
        terceiroGolsPro = new JLabel(String.valueOf(times.get(2).getGolsPro()));
        terceiroGolsContra = new JLabel(String.valueOf(times.get(2).getGolsContra()));
        terceiroSaldoDeGols = new JLabel(String.valueOf(times.get(2).getSaldoGol()));
        terceiroInfo = new JLabel("Info Time");
        
        //quarto colocado
        texto4 = new JLabel(" 4º ");
        quartoEscudo = new JLabel(times.get(3).getEscudo());
        quartoNome = new JLabel(times.get(3).getNome());
        quartoPontos = new JLabel(String.valueOf(times.get(3).getPontuacaoAtual()));
        quartoVitorias = new JLabel(String.valueOf(times.get(3).getVitorias()));
        quartoEmpates = new JLabel(String.valueOf(times.get(3).getEmpates()));
        quartoDerrotas = new JLabel(String.valueOf(times.get(3).getDerrotas()));
        quartoGolsPro = new JLabel(String.valueOf(times.get(3).getGolsPro()));
        quartoGolsContra = new JLabel(String.valueOf(times.get(3).getGolsContra()));
        quartoSaldoDeGols = new JLabel(String.valueOf(times.get(3).getSaldoGol()));
        quartoInfo = new JLabel("Info Time");
        
        //quinto colocado
        texto5 = new JLabel(" 5º ");
        quintoEscudo = new JLabel(times.get(4).getEscudo());
        quintoNome = new JLabel(times.get(4).getNome());
        quintoPontos = new JLabel(String.valueOf(times.get(4).getPontuacaoAtual()));
        quintoVitorias = new JLabel(String.valueOf(times.get(4).getVitorias()));
        quintoEmpates = new JLabel(String.valueOf(times.get(4).getEmpates()));
        quintoDerrotas = new JLabel(String.valueOf(times.get(4).getDerrotas()));
        quintoGolsPro = new JLabel(String.valueOf(times.get(4).getGolsPro()));
        quintoGolsContra = new JLabel(String.valueOf(times.get(4).getGolsContra()));
        quintoSaldoDeGols = new JLabel(String.valueOf(times.get(4).getSaldoGol()));
        quintoInfo = new JLabel("Info Time");
        
        //sexto colocado
        texto6 = new JLabel(" 6º ");
        sextoEscudo = new JLabel(times.get(5).getEscudo());
        sextoNome = new JLabel(times.get(5).getNome());
        sextoPontos = new JLabel(String.valueOf(times.get(5).getPontuacaoAtual()));
        sextoVitorias = new JLabel(String.valueOf(times.get(5).getVitorias()));
        sextoEmpates = new JLabel(String.valueOf(times.get(5).getEmpates()));
        sextoDerrotas = new JLabel(String.valueOf(times.get(5).getDerrotas()));
        sextoGolsPro = new JLabel(String.valueOf(times.get(5).getGolsPro()));
        sextoGolsContra = new JLabel(String.valueOf(times.get(5).getGolsContra()));
        sextoSaldoDeGols = new JLabel(String.valueOf(times.get(5).getSaldoGol()));
        sextoInfo = new JLabel("Info Time");
        
        //setimo colocado
        texto7 = new JLabel(" 7º ");
        setimoEscudo = new JLabel(times.get(6).getEscudo());
        setimoNome = new JLabel(times.get(6).getNome());
        setimoPontos = new JLabel(String.valueOf(times.get(6).getPontuacaoAtual()));
        setimoVitorias = new JLabel(String.valueOf(times.get(6).getVitorias()));
        setimoEmpates = new JLabel(String.valueOf(times.get(6).getEmpates()));
        setimoDerrotas = new JLabel(String.valueOf(times.get(6).getDerrotas()));
        setimoGolsPro = new JLabel(String.valueOf(times.get(6).getGolsPro()));
        setimoGolsContra = new JLabel(String.valueOf(times.get(6).getGolsContra()));
        setimoSaldoDeGols = new JLabel(String.valueOf(times.get(6).getSaldoGol()));
        setimoInfo = new JLabel("Info Time");
        
        //oitavo colocado
        texto8 = new JLabel(" 8º ");
        oitavoEscudo = new JLabel(times.get(7).getEscudo());
        oitavoNome = new JLabel(times.get(7).getNome());
        oitavoPontos = new JLabel(String.valueOf(times.get(7).getPontuacaoAtual()));
        oitavoVitorias = new JLabel(String.valueOf(times.get(7).getVitorias()));
        oitavoEmpates = new JLabel(String.valueOf(times.get(7).getEmpates()));
        oitavoDerrotas = new JLabel(String.valueOf(times.get(7).getDerrotas()));
        oitavoGolsPro = new JLabel(String.valueOf(times.get(7).getGolsPro()));
        oitavoGolsContra = new JLabel(String.valueOf(times.get(7).getGolsContra()));
        oitavoSaldoDeGols = new JLabel(String.valueOf(times.get(7).getSaldoGol()));
        oitavoInfo = new JLabel("Info Time");
        
        //nono colocado
        texto9 = new JLabel(" 9º ");
        nonoEscudo = new JLabel(times.get(8).getEscudo());
        nonoNome = new JLabel(times.get(8).getNome());
        nonoPontos = new JLabel(String.valueOf(times.get(8).getPontuacaoAtual()));
        nonoVitorias = new JLabel(String.valueOf(times.get(8).getVitorias()));
        nonoEmpates = new JLabel(String.valueOf(times.get(8).getEmpates()));
        nonoDerrotas = new JLabel(String.valueOf(times.get(8).getDerrotas()));
        nonoGolsPro = new JLabel(String.valueOf(times.get(8).getGolsPro()));
        nonoGolsContra = new JLabel(String.valueOf(times.get(8).getGolsContra()));
        nonoSaldoDeGols = new JLabel(String.valueOf(times.get(8).getSaldoGol()));
        nonoInfo = new JLabel("Info Time");
        
        //decimo colocado
        texto10 = new JLabel(" 10º ");
        decimoEscudo = new JLabel(times.get(9).getEscudo());
        decimoNome = new JLabel(times.get(9).getNome());
        decimoPontos = new JLabel(String.valueOf(times.get(9).getPontuacaoAtual()));
        decimoVitorias = new JLabel(String.valueOf(times.get(9).getVitorias()));
        decimoEmpates = new JLabel(String.valueOf(times.get(9).getEmpates()));
        decimoDerrotas = new JLabel(String.valueOf(times.get(9).getDerrotas()));
        decimoGolsPro = new JLabel(String.valueOf(times.get(9).getGolsPro()));
        decimoGolsContra = new JLabel(String.valueOf(times.get(9).getGolsContra()));
        decimoSaldoDeGols = new JLabel(String.valueOf(times.get(9).getSaldoGol()));
        decimoInfo = new JLabel("Info Time");
        
        //decimo primeiro colocado
        texto11 = new JLabel(" 11º ");
        decimoPrimeiroEscudo = new JLabel(times.get(10).getEscudo());
        decimoPrimeiroNome = new JLabel(times.get(10).getNome());
        decimoPrimeiroPontos = new JLabel(String.valueOf(times.get(10).getPontuacaoAtual()));
        decimoPrimeiroVitorias = new JLabel(String.valueOf(times.get(10).getVitorias()));
        decimoPrimeiroEmpates = new JLabel(String.valueOf(times.get(10).getEmpates()));
        decimoPrimeiroDerrotas = new JLabel(String.valueOf(times.get(10).getDerrotas()));
        decimoPrimeiroGolsPro = new JLabel(String.valueOf(times.get(10).getGolsPro()));
        decimoPrimeiroGolsContra = new JLabel(String.valueOf(times.get(10).getGolsContra()));
        decimoPrimeiroSaldoDeGols = new JLabel(String.valueOf(times.get(10).getSaldoGol()));
        decimoPrimeiroInfo = new JLabel("Info Time");
        
        //decimo segundo colocado
        texto12 = new JLabel(" 12º ");
        decimoSegundoEscudo = new JLabel(times.get(11).getEscudo());
        decimoSegundoNome = new JLabel(times.get(11).getNome());
        decimoSegundoPontos = new JLabel(String.valueOf(times.get(11).getPontuacaoAtual()));
        decimoSegundoVitorias = new JLabel(String.valueOf(times.get(11).getVitorias()));
        decimoSegundoEmpates = new JLabel(String.valueOf(times.get(11).getEmpates()));
        decimoSegundoDerrotas = new JLabel(String.valueOf(times.get(11).getDerrotas()));
        decimoSegundoGolsPro = new JLabel(String.valueOf(times.get(11).getGolsPro()));
        decimoSegundoGolsContra = new JLabel(String.valueOf(times.get(11).getGolsContra()));
        decimoSegundoSaldoDeGols = new JLabel(String.valueOf(times.get(11).getSaldoGol()));
        decimoSegundoInfo = new JLabel("Info Time");
        
        //decimo terceiro colocado
        texto13 = new JLabel(" 13º ");
        decimoTerceiroEscudo = new JLabel(times.get(12).getEscudo());
        decimoTerceiroNome = new JLabel(times.get(12).getNome());
        decimoTerceiroPontos = new JLabel(String.valueOf(times.get(12).getPontuacaoAtual()));
        decimoTerceiroVitorias = new JLabel(String.valueOf(times.get(12).getVitorias()));
        decimoTerceiroEmpates = new JLabel(String.valueOf(times.get(12).getEmpates()));
        decimoTerceiroDerrotas = new JLabel(String.valueOf(times.get(12).getDerrotas()));
        decimoTerceiroGolsPro = new JLabel(String.valueOf(times.get(12).getGolsPro()));
        decimoTerceiroGolsContra = new JLabel(String.valueOf(times.get(12).getGolsContra()));
        decimoTerceiroSaldoDeGols = new JLabel(String.valueOf(times.get(12).getSaldoGol()));
        decimoTerceiroInfo = new JLabel("Info Time");
        
        //decimo quarto colocado
        texto14 = new JLabel(" 14º ");
        decimoQuartoEscudo = new JLabel(times.get(13).getEscudo());
        decimoQuartoNome = new JLabel(times.get(13).getNome());
        decimoQuartoPontos = new JLabel(String.valueOf(times.get(13).getPontuacaoAtual()));
        decimoQuartoVitorias = new JLabel(String.valueOf(times.get(13).getVitorias()));
        decimoQuartoEmpates = new JLabel(String.valueOf(times.get(13).getEmpates()));
        decimoQuartoDerrotas = new JLabel(String.valueOf(times.get(13).getDerrotas()));
        decimoQuartoGolsPro = new JLabel(String.valueOf(times.get(13).getGolsPro()));
        decimoQuartoGolsContra = new JLabel(String.valueOf(times.get(13).getGolsContra()));
        decimoQuartoSaldoDeGols = new JLabel(String.valueOf(times.get(13).getSaldoGol()));
        decimoQuartoInfo = new JLabel("Info Time");
        
        //decimo quinto colocado
        texto15 = new JLabel(" 15º ");
        decimoQuintoEscudo = new JLabel(times.get(14).getEscudo());
        decimoQuintoNome = new JLabel(times.get(14).getNome());
        decimoQuintoPontos = new JLabel(String.valueOf(times.get(14).getPontuacaoAtual()));
        decimoQuintoVitorias = new JLabel(String.valueOf(times.get(14).getVitorias()));
        decimoQuintoEmpates = new JLabel(String.valueOf(times.get(14).getEmpates()));
        decimoQuintoDerrotas = new JLabel(String.valueOf(times.get(14).getDerrotas()));
        decimoQuintoGolsPro = new JLabel(String.valueOf(times.get(14).getGolsPro()));
        decimoQuintoGolsContra = new JLabel(String.valueOf(times.get(14).getGolsContra()));
        decimoQuintoSaldoDeGols = new JLabel(String.valueOf(times.get(14).getSaldoGol()));
        decimoQuintoInfo = new JLabel("Info Time");
        
        //decimo sexto colocado
        texto16 = new JLabel(" 16º ");
        decimoSextoEscudo = new JLabel(times.get(15).getEscudo());
        decimoSextoNome = new JLabel(times.get(15).getNome());
        decimoSextoPontos = new JLabel(String.valueOf(times.get(15).getPontuacaoAtual()));
        decimoSextoVitorias = new JLabel(String.valueOf(times.get(15).getVitorias()));
        decimoSextoEmpates = new JLabel(String.valueOf(times.get(15).getEmpates()));
        decimoSextoDerrotas = new JLabel(String.valueOf(times.get(15).getDerrotas()));
        decimoSextoGolsPro = new JLabel(String.valueOf(times.get(15).getGolsPro()));
        decimoSextoGolsContra = new JLabel(String.valueOf(times.get(15).getGolsContra()));
        decimoSextoSaldoDeGols = new JLabel(String.valueOf(times.get(15).getSaldoGol()));
        decimoSextoInfo = new JLabel("Info Time");
        
        //decimo setimo colocado
        texto17 = new JLabel(" 17º ");
        decimoSetimoEscudo = new JLabel(times.get(16).getEscudo());
        decimoSetimoNome = new JLabel(times.get(16).getNome());
        decimoSetimoPontos = new JLabel(String.valueOf(times.get(16).getPontuacaoAtual()));
        decimoSetimoVitorias = new JLabel(String.valueOf(times.get(16).getVitorias()));
        decimoSetimoEmpates = new JLabel(String.valueOf(times.get(16).getEmpates()));
        decimoSetimoDerrotas = new JLabel(String.valueOf(times.get(16).getDerrotas()));
        decimoSetimoGolsPro = new JLabel(String.valueOf(times.get(16).getGolsPro()));
        decimoSetimoGolsContra = new JLabel(String.valueOf(times.get(16).getGolsContra()));
        decimoSetimoSaldoDeGols = new JLabel(String.valueOf(times.get(16).getSaldoGol()));
        decimoSetimoInfo = new JLabel("Info Time");
        
        //decimo oitavo colocado
        texto18 = new JLabel(" 18º ");
        decimoOitavoEscudo = new JLabel(times.get(17).getEscudo());
        decimoOitavoNome = new JLabel(times.get(17).getNome());
        decimoOitavoPontos = new JLabel(String.valueOf(times.get(17).getPontuacaoAtual()));
        decimoOitavoVitorias = new JLabel(String.valueOf(times.get(17).getVitorias()));
        decimoOitavoEmpates = new JLabel(String.valueOf(times.get(17).getEmpates()));
        decimoOitavoDerrotas = new JLabel(String.valueOf(times.get(17).getDerrotas()));
        decimoOitavoGolsPro = new JLabel(String.valueOf(times.get(17).getGolsPro()));
        decimoOitavoGolsContra = new JLabel(String.valueOf(times.get(17).getGolsContra()));
        decimoOitavoSaldoDeGols = new JLabel(String.valueOf(times.get(17).getSaldoGol()));
        decimoOitavoInfo = new JLabel("Info Time");
        
        //decimo  nono colocado
        texto19 = new JLabel(" 19º ");
        decimoNonoEscudo = new JLabel(times.get(18).getEscudo());
        decimoNonoNome = new JLabel(times.get(18).getNome());
        decimoNonoPontos = new JLabel(String.valueOf(times.get(18).getPontuacaoAtual()));
        decimoNonoVitorias = new JLabel(String.valueOf(times.get(18).getVitorias()));
        decimoNonoEmpates = new JLabel(String.valueOf(times.get(18).getEmpates()));
        decimoNonoDerrotas = new JLabel(String.valueOf(times.get(18).getDerrotas()));
        decimoNonoGolsPro = new JLabel(String.valueOf(times.get(18).getGolsPro()));
        decimoNonoGolsContra = new JLabel(String.valueOf(times.get(18).getGolsContra()));
        decimoNonoSaldoDeGols = new JLabel(String.valueOf(times.get(18).getSaldoGol()));
        decimoNonoInfo = new JLabel("Info Time");
        
        //vigésimo colocado
        texto20 = new JLabel(" 20º ");
        vigesimoEscudo = new JLabel(times.get(19).getEscudo());
        vigesimoNome = new JLabel(times.get(19).getNome());
        vigesimoPontos = new JLabel(String.valueOf(times.get(19).getPontuacaoAtual()));
        vigesimoVitorias = new JLabel(String.valueOf(times.get(19).getVitorias()));
        vigesimoEmpates = new JLabel(String.valueOf(times.get(19).getEmpates()));
        vigesimoDerrotas = new JLabel(String.valueOf(times.get(19).getDerrotas()));
        vigesimoGolsPro = new JLabel(String.valueOf(times.get(19).getGolsPro()));
        vigesimoGolsContra = new JLabel(String.valueOf(times.get(19).getGolsContra()));
        vigesimoSaldoDeGols = new JLabel(String.valueOf(times.get(19).getSaldoGol()));
        vigesimoInfo = new JLabel("Info Time");
        
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
        
        this.setVisible(true);
    }
}
