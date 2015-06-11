/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Guilherme Lourenço
 */
public class InicioProjeto {
    
    public static Font getFonte( int tamanho ){  
        Font font = null;  
        try{  
            File file = new File("fifawelcome.ttf");  
            FileInputStream fis = new FileInputStream( file );  
            font = Font.createFont( Font.TRUETYPE_FONT , fis );  
        }catch( FontFormatException | IOException e ){  
            System.out.println( e.getMessage() );  
        }  
        font = font.deriveFont( Font.PLAIN , tamanho );  
        return font;
    }
    
    public static void main(String[] args) {
        TelaLoding novaTelaInicial = new TelaLoding();
        novaTelaInicial.setLocationRelativeTo(null);
        novaTelaInicial.setVisible(true);
    }
}
