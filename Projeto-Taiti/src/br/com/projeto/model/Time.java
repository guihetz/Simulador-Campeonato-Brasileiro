/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Daylton
 */
public class Time {
    private String nome; 
    private int golsPro;
    private int golsContra;    
    private List<Jogo> listaJogos;
    private ImageIcon escudo;

    public Time(String nome, int golsPro, int golsContra, List<Jogo> listaJogos, ImageIcon escudo) {
        this.nome = nome;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
        this.listaJogos = listaJogos;
        this.escudo = escudo;
    }

    public String getNome() {
        return nome;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public List<Jogo> getListaJogos() {
        return listaJogos;
    }

    public ImageIcon getEscudo() {
        return escudo;
    }
    
    public int getSaldoGol(){
        return this.golsPro - this.golsContra;
    }    
    
    @Override
    public String toString(){
        return this.nome;
    }
        
}
