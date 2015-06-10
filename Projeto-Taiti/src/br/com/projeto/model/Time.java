/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Daylton
 */
public class Time implements Comparable<Time>{
    private String nome; 
    private int golsPro;
    private int golsContra;    
    private List<Jogo> listaJogos;
    private List<Time> timesComQuemJogou;
    private ImageIcon escudo;
    private int vitorias, empates, derrotas;

    public Time(String nome, ImageIcon escudo, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.golsPro = 0;
        this.golsContra = 0;
        this.listaJogos = new ArrayList<>();
        this.timesComQuemJogou = new ArrayList<>();
        this.escudo = escudo;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public String getNome() {
        //Obtém o nome do time.
        return nome;
    }

    public int getGolsPro() {
        //Obtém os gols que esse time marcou no campeonato.
        return golsPro;
    }

    public int getGolsContra() {
        //Obtém os gols que esse time já levou no campeonato.
        return golsContra;
    }

    public List<Jogo> getListaJogos() {
        //Obtém a lista de jogos que esse time jogou.
        return listaJogos;
    }
    
    public void addJogo(Jogo j){ 
        //Adiciona um jogo que foi jogado por esse time no campeonato.
        this.listaJogos.add(j);
    }

    public ImageIcon getEscudo() {
        //Obtém a imagem do escudo do time.
        return escudo;
    }
    
    public int getSaldoGol(){
        //Obtém o saldo de gols desse time no campeonato.
        return this.golsPro - this.golsContra;
    }    
    
    @Override
    public String toString(){
        return this.nome;
    }

    public List<Time> getTimesComQuemJogou(){
        //Obtém a lista de times com quem esse time jogou.
        return this.timesComQuemJogou;
    }
    
    public void addTimeJogado(Time t){
        //Adiciona um time a lista de times com quem esse time jogou.
        this.timesComQuemJogou.add(t);
    }
    
    @Override
    public int compareTo(Time o) {
        if(getNome().equals(o.getNome())){
            return 0;
        }
        return 1;
    }
    
    public int getCoeficienteTime(){ 
        int pesoVitorias = 3 * this.vitorias;
        int pesoEmpates = 1 * this.empates;
        int pesoDerrotas = 0 * this.derrotas;
        
        int coeficiente  = (int) (pesoVitorias + pesoEmpates + pesoDerrotas)/ 3;
        
        if(coeficiente > 70){
            return 3;
        }else if(coeficiente > 40){
            return 2;
        }else if(coeficiente > 20){
            return 1;
        }
        return 1;
    }
    
    public void addVitoria(){
        this.vitorias++;
    }
    
    public void addEmpate(){
        this.empates++;
    }
    
    public void addDerrota(){
        this.derrotas++;
    }
        
    public void addGolPro(int gols){
        this.golsPro +=gols;
    }
    
    public void addGolContra(int gols){
        this.golsContra +=gols;
    }
    
    
}
