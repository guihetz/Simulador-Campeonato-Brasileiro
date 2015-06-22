/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import java.util.Comparator;

/**
 *
 * @author Guilherme Lourenço
 */
public class ComparadorDePontos implements Comparator<Time>{

    @Override
    public int compare(Time t1, Time t2) {
        if(t1.getPontuacaoAtual() > t2.getPontuacaoAtual()){
            return -1;
        }else if(t1.getPontuacaoAtual() < t2.getPontuacaoAtual()){
            return 1;
        }else{
            if(t1.getVitorias() > t2.getVitorias()){
                return -1;
            }else if(t1.getVitorias() < t2.getVitorias()){
                return 1;
            }else{
                if(t1.getSaldoGol() > t2.getSaldoGol()){
                    return -1;
                }else if(t1.getSaldoGol() < t2.getSaldoGol()){
                    return 1;
                }else{
                    return 0;
                }
            }
        }
    }
    
}
