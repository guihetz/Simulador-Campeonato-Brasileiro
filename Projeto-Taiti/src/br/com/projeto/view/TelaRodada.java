/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.model.Jogo;
import br.com.projeto.model.Rodada;
import br.com.projeto.model.Time;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

/**
 *
 * @author Guilherme Lourenço
 */
public class TelaRodada extends javax.swing.JFrame {

    /**
     * Creates new form TelaRodada
     */
    List<Jogo> jogos;
    
    public TelaRodada() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
    }
    
    public TelaRodada(Rodada r){
        this();
        this.jogos = r.getJogosRodada();
        Font f = InicioProjeto.getFonte(36);
        lbTime1.setIcon(jogos.get(0).getTime1().getEscudo());
        //lbTime1.setText(jogos.get(0).getTime1().getNome());
        lbTime1.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime1.setVerticalAlignment(SwingConstants.CENTER);
        lbTime2.setIcon(jogos.get(0).getTime2().getEscudo());
        //lbTime2.setText(jogos.get(0).getTime2().getNome());
        lbTime2.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime2.setVerticalAlignment(SwingConstants.CENTER);

        lbTime3.setIcon(jogos.get(1).getTime1().getEscudo());
        //lbTime3.setText(jogos.get(1).getTime1().getNome());
        lbTime3.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime3.setVerticalAlignment(SwingConstants.CENTER);
        lbTime4.setIcon(jogos.get(1).getTime2().getEscudo());
        //lbTime4.setText(jogos.get(1).getTime2().getNome());
        lbTime4.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime4.setHorizontalAlignment(SwingConstants.CENTER);

        lbTime5.setIcon(jogos.get(2).getTime1().getEscudo());
        //lbTime5.setText(jogos.get(2).getTime1().getNome());
        lbTime5.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime5.setVerticalAlignment(SwingConstants.CENTER);
        lbTime6.setIcon(jogos.get(2).getTime2().getEscudo());
        //lbTime6.setText(jogos.get(2).getTime2().getNome());
        lbTime6.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime6.setVerticalAlignment(SwingConstants.CENTER);

        lbTime7.setIcon(jogos.get(3).getTime1().getEscudo());
        //lbTime7.setText(jogos.get(3).getTime1().getNome());
        lbTime7.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime7.setVerticalAlignment(SwingConstants.CENTER);
        lbTime8.setIcon(jogos.get(3).getTime2().getEscudo());
        //lbTime8.setText(jogos.get(3).getTime2().getNome());
        lbTime8.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime8.setVerticalAlignment(SwingConstants.CENTER);

        lbTime9.setIcon(jogos.get(4).getTime1().getEscudo());
        //lbTime9.setText(jogos.get(4).getTime1().getNome());
        lbTime9.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime9.setVerticalAlignment(SwingConstants.CENTER);
        lbTime10.setIcon(jogos.get(4).getTime2().getEscudo());
        //lbTime10.setText(jogos.get(4).getTime2().getNome());
        lbTime10.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime10.setVerticalAlignment(SwingConstants.CENTER);

        lbTime11.setIcon(jogos.get(5).getTime1().getEscudo());
        //lbTime11.setText(jogos.get(5).getTime1().getNome());
        lbTime11.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime11.setVerticalAlignment(SwingConstants.CENTER);
        lbTime12.setIcon(jogos.get(5).getTime2().getEscudo());
        //lbTime12.setText(jogos.get(5).getTime2().getNome());
        lbTime12.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime12.setVerticalAlignment(SwingConstants.CENTER);

        lbTime13.setIcon(jogos.get(6).getTime1().getEscudo());
        //lbTime13.setText(jogos.get(6).getTime1().getNome());
        lbTime13.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime13.setVerticalAlignment(SwingConstants.CENTER);
        lbTime14.setIcon(jogos.get(6).getTime2().getEscudo());
        //lbTime14.setText(jogos.get(6).getTime2().getNome());
        lbTime14.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime14.setVerticalAlignment(SwingConstants.CENTER);

        lbTime15.setIcon(jogos.get(7).getTime1().getEscudo());
        //lbTime15.setText(jogos.get(7).getTime1().getNome());
        lbTime15.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime15.setVerticalAlignment(SwingConstants.CENTER);
        lbTime16.setIcon(jogos.get(7).getTime2().getEscudo());
        //lbTime16.setText(jogos.get(7).getTime2().getNome());
        lbTime16.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime16.setVerticalAlignment(SwingConstants.CENTER);

        lbTime17.setIcon(jogos.get(8).getTime1().getEscudo());
        //lbTime17.setText(jogos.get(8).getTime1().getNome());
        lbTime17.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime17.setVerticalAlignment(SwingConstants.CENTER);
        lbTime18.setIcon(jogos.get(8).getTime2().getEscudo());
        //lbTime18.setText(jogos.get(8).getTime2().getNome());
        lbTime18.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime18.setVerticalAlignment(SwingConstants.CENTER);

        lbTime19.setIcon(jogos.get(9).getTime1().getEscudo());
        //lbTime19.setText(jogos.get(9).getTime1().getNome());
        lbTime19.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime19.setVerticalAlignment(SwingConstants.CENTER);
        lbTime20.setIcon(jogos.get(9).getTime2().getEscudo());
        //lbTime20.setText(jogos.get(9).getTime2().getNome());
        lbTime20.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime20.setHorizontalAlignment(SwingConstants.CENTER);
        lbTime20.setVerticalAlignment(SwingConstants.CENTER);
        
        lbResultadoTime1.setText(String.valueOf(jogos.get(0).getGolTime1()));
        lbResultadoTime1.setFont(f);
        lbResultadoTime2.setText(String.valueOf(jogos.get(0).getGolTime2()));
        lbResultadoTime2.setFont(f);
        lbResultadoTime3.setText(String.valueOf(jogos.get(1).getGolTime1()));
        lbResultadoTime3.setFont(f);
        lbResultadoTime4.setText(String.valueOf(jogos.get(1).getGolTime2()));
        lbResultadoTime4.setFont(f);
        lbResultadoTime5.setText(String.valueOf(jogos.get(2).getGolTime1()));
        lbResultadoTime5.setFont(f);
        lbResultadoTime6.setText(String.valueOf(jogos.get(2).getGolTime2()));
        lbResultadoTime6.setFont(f);
        lbResultadoTime7.setText(String.valueOf(jogos.get(3).getGolTime1()));
        lbResultadoTime7.setFont(f);
        lbResultadoTime8.setText(String.valueOf(jogos.get(3).getGolTime2()));
        lbResultadoTime8.setFont(f);
        lbResultadoTime9.setText(String.valueOf(jogos.get(4).getGolTime1()));
        lbResultadoTime9.setFont(f);
        lbResultadoTime10.setText(String.valueOf(jogos.get(4).getGolTime2()));
        lbResultadoTime10.setFont(f);
        lbResultadoTime11.setText(String.valueOf(jogos.get(5).getGolTime1()));
        lbResultadoTime11.setFont(f);
        lbResultadoTime12.setText(String.valueOf(jogos.get(5).getGolTime2()));
        lbResultadoTime12.setFont(f);
        lbResultadoTime13.setText(String.valueOf(jogos.get(6).getGolTime1()));
        lbResultadoTime13.setFont(f);
        lbResultadoTime14.setText(String.valueOf(jogos.get(6).getGolTime2()));
        lbResultadoTime14.setFont(f);
        lbResultadoTime15.setText(String.valueOf(jogos.get(7).getGolTime1()));
        lbResultadoTime15.setFont(f);
        lbResultadoTime16.setText(String.valueOf(jogos.get(7).getGolTime2()));
        lbResultadoTime16.setFont(f);
        lbResultadoTime17.setText(String.valueOf(jogos.get(8).getGolTime1()));
        lbResultadoTime17.setFont(f);
        lbResultadoTime18.setText(String.valueOf(jogos.get(8).getGolTime2()));
        lbResultadoTime18.setFont(f);
        lbResultadoTime19.setText(String.valueOf(jogos.get(9).getGolTime1()));
        lbResultadoTime19.setFont(f);
        lbResultadoTime20.setText(String.valueOf(jogos.get(9).getGolTime2()));
        lbResultadoTime20.setFont(f);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTime1 = new javax.swing.JLabel();
        lbTime2 = new javax.swing.JLabel();
        lbResultadoTime1 = new javax.swing.JLabel();
        lbTime11 = new javax.swing.JLabel();
        lbTime12 = new javax.swing.JLabel();
        lbTime14 = new javax.swing.JLabel();
        lbTime13 = new javax.swing.JLabel();
        lbTime4 = new javax.swing.JLabel();
        lbTime3 = new javax.swing.JLabel();
        lbTime5 = new javax.swing.JLabel();
        lbTime6 = new javax.swing.JLabel();
        lbTime15 = new javax.swing.JLabel();
        lbTime16 = new javax.swing.JLabel();
        lbTime18 = new javax.swing.JLabel();
        lbTime17 = new javax.swing.JLabel();
        lbTime8 = new javax.swing.JLabel();
        lbTime7 = new javax.swing.JLabel();
        lbTime9 = new javax.swing.JLabel();
        lbTime10 = new javax.swing.JLabel();
        lbTime19 = new javax.swing.JLabel();
        lbTime20 = new javax.swing.JLabel();
        lbInfo1 = new javax.swing.JLabel();
        lbResultadoTime2 = new javax.swing.JLabel();
        lbResultadoTime3 = new javax.swing.JLabel();
        lbInfo2 = new javax.swing.JLabel();
        lbResultadoTime4 = new javax.swing.JLabel();
        lbResultadoTime5 = new javax.swing.JLabel();
        lbInfo3 = new javax.swing.JLabel();
        lbResultadoTime6 = new javax.swing.JLabel();
        lbResultadoTime7 = new javax.swing.JLabel();
        lbInfo4 = new javax.swing.JLabel();
        lbResultadoTime8 = new javax.swing.JLabel();
        lbResultadoTime9 = new javax.swing.JLabel();
        lbInfo5 = new javax.swing.JLabel();
        lbResultadoTime10 = new javax.swing.JLabel();
        lbResultadoTime11 = new javax.swing.JLabel();
        lbInfo6 = new javax.swing.JLabel();
        lbResultadoTime12 = new javax.swing.JLabel();
        lbResultadoTime14 = new javax.swing.JLabel();
        lbResultadoTime13 = new javax.swing.JLabel();
        lbInfo7 = new javax.swing.JLabel();
        lbResultadoTime16 = new javax.swing.JLabel();
        lbResultadoTime15 = new javax.swing.JLabel();
        lbInfo8 = new javax.swing.JLabel();
        lbResultadoTime18 = new javax.swing.JLabel();
        lbResultadoTime17 = new javax.swing.JLabel();
        lbInfo9 = new javax.swing.JLabel();
        lbResultadoTime20 = new javax.swing.JLabel();
        lbResultadoTime19 = new javax.swing.JLabel();
        lbInfo10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Jogos da Rodada"));

        lbResultadoTime1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime1.setText("_");

        lbInfo1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbInfo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo1.setText("X");
        lbInfo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfo1MouseClicked(evt);
            }
        });

        lbResultadoTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime2.setText("_");

        lbResultadoTime3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime3.setText("_");

        lbInfo2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbInfo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo2.setText("X");
        lbInfo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfo2MouseClicked(evt);
            }
        });

        lbResultadoTime4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime4.setText("_");

        lbResultadoTime5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime5.setText("_");

        lbInfo3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbInfo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo3.setText("X");
        lbInfo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfo3MouseClicked(evt);
            }
        });

        lbResultadoTime6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime6.setText("_");

        lbResultadoTime7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime7.setText("_");

        lbInfo4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbInfo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo4.setText("X");
        lbInfo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfo4MouseClicked(evt);
            }
        });

        lbResultadoTime8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime8.setText("_");

        lbResultadoTime9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime9.setText("_");

        lbInfo5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbInfo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo5.setText("X");
        lbInfo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfo5MouseClicked(evt);
            }
        });

        lbResultadoTime10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime10.setText("_");

        lbResultadoTime11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime11.setText("_");

        lbInfo6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbInfo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo6.setText("X");
        lbInfo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfo6MouseClicked(evt);
            }
        });

        lbResultadoTime12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime12.setText("_");

        lbResultadoTime14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime14.setText("_");

        lbResultadoTime13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime13.setText("_");

        lbInfo7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbInfo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo7.setText("X");
        lbInfo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfo7MouseClicked(evt);
            }
        });

        lbResultadoTime16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime16.setText("_");

        lbResultadoTime15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime15.setText("_");

        lbInfo8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbInfo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo8.setText("X");
        lbInfo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfo8MouseClicked(evt);
            }
        });

        lbResultadoTime18.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime18.setText("_");

        lbResultadoTime17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime17.setText("_");

        lbInfo9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbInfo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo9.setText("X");
        lbInfo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfo9MouseClicked(evt);
            }
        });

        lbResultadoTime20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime20.setText("_");

        lbResultadoTime19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbResultadoTime19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultadoTime19.setText("_");

        lbInfo10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbInfo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfo10.setText("X");
        lbInfo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfo10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbResultadoTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbResultadoTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbResultadoTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbResultadoTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbResultadoTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbResultadoTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbResultadoTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbResultadoTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbResultadoTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbResultadoTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTime17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbResultadoTime11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbResultadoTime12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbResultadoTime13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbResultadoTime14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbResultadoTime15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbResultadoTime16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbResultadoTime17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbResultadoTime18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbResultadoTime19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbResultadoTime20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTime18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbResultadoTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbResultadoTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbResultadoTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbResultadoTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(51, 51, 51)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbResultadoTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbResultadoTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(54, 54, 54)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbResultadoTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbResultadoTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbResultadoTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbInfo5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbResultadoTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(19, 19, 19)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTime12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTime14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTime16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTime18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTime20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTime11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbResultadoTime12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbInfo6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbResultadoTime11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbTime13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbResultadoTime14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbInfo7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbResultadoTime13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbTime15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbResultadoTime16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbInfo8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbResultadoTime15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbTime17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbResultadoTime18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbInfo9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbResultadoTime17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTime19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbResultadoTime20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbInfo10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbResultadoTime19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbInfo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfo1MouseClicked
        TelaInfoJogo novaInfo = new TelaInfoJogo(jogos.get(0));
    }//GEN-LAST:event_lbInfo1MouseClicked

    private void lbInfo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfo2MouseClicked
        TelaInfoJogo novaInfo = new TelaInfoJogo(jogos.get(1));
    }//GEN-LAST:event_lbInfo2MouseClicked

    private void lbInfo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfo3MouseClicked
        TelaInfoJogo novaInfo = new TelaInfoJogo(jogos.get(2));
    }//GEN-LAST:event_lbInfo3MouseClicked

    private void lbInfo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfo4MouseClicked
        TelaInfoJogo novaInfo = new TelaInfoJogo(jogos.get(3));
    }//GEN-LAST:event_lbInfo4MouseClicked

    private void lbInfo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfo5MouseClicked
        TelaInfoJogo novaInfo = new TelaInfoJogo(jogos.get(4));
    }//GEN-LAST:event_lbInfo5MouseClicked

    private void lbInfo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfo6MouseClicked
        TelaInfoJogo novaInfo = new TelaInfoJogo(jogos.get(5));
    }//GEN-LAST:event_lbInfo6MouseClicked

    private void lbInfo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfo7MouseClicked
        TelaInfoJogo novaInfo = new TelaInfoJogo(jogos.get(6));
    }//GEN-LAST:event_lbInfo7MouseClicked

    private void lbInfo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfo8MouseClicked
        TelaInfoJogo novaInfo = new TelaInfoJogo(jogos.get(7));
    }//GEN-LAST:event_lbInfo8MouseClicked

    private void lbInfo9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfo9MouseClicked
        TelaInfoJogo novaInfo = new TelaInfoJogo(jogos.get(8));
    }//GEN-LAST:event_lbInfo9MouseClicked

    private void lbInfo10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfo10MouseClicked
        TelaInfoJogo novaInfo = new TelaInfoJogo(jogos.get(9));
    }//GEN-LAST:event_lbInfo10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRodada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRodada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRodada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRodada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRodada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbInfo1;
    private javax.swing.JLabel lbInfo10;
    private javax.swing.JLabel lbInfo2;
    private javax.swing.JLabel lbInfo3;
    private javax.swing.JLabel lbInfo4;
    private javax.swing.JLabel lbInfo5;
    private javax.swing.JLabel lbInfo6;
    private javax.swing.JLabel lbInfo7;
    private javax.swing.JLabel lbInfo8;
    private javax.swing.JLabel lbInfo9;
    private javax.swing.JLabel lbResultadoTime1;
    private javax.swing.JLabel lbResultadoTime10;
    private javax.swing.JLabel lbResultadoTime11;
    private javax.swing.JLabel lbResultadoTime12;
    private javax.swing.JLabel lbResultadoTime13;
    private javax.swing.JLabel lbResultadoTime14;
    private javax.swing.JLabel lbResultadoTime15;
    private javax.swing.JLabel lbResultadoTime16;
    private javax.swing.JLabel lbResultadoTime17;
    private javax.swing.JLabel lbResultadoTime18;
    private javax.swing.JLabel lbResultadoTime19;
    private javax.swing.JLabel lbResultadoTime2;
    private javax.swing.JLabel lbResultadoTime20;
    private javax.swing.JLabel lbResultadoTime3;
    private javax.swing.JLabel lbResultadoTime4;
    private javax.swing.JLabel lbResultadoTime5;
    private javax.swing.JLabel lbResultadoTime6;
    private javax.swing.JLabel lbResultadoTime7;
    private javax.swing.JLabel lbResultadoTime8;
    private javax.swing.JLabel lbResultadoTime9;
    private javax.swing.JLabel lbTime1;
    private javax.swing.JLabel lbTime10;
    private javax.swing.JLabel lbTime11;
    private javax.swing.JLabel lbTime12;
    private javax.swing.JLabel lbTime13;
    private javax.swing.JLabel lbTime14;
    private javax.swing.JLabel lbTime15;
    private javax.swing.JLabel lbTime16;
    private javax.swing.JLabel lbTime17;
    private javax.swing.JLabel lbTime18;
    private javax.swing.JLabel lbTime19;
    private javax.swing.JLabel lbTime2;
    private javax.swing.JLabel lbTime20;
    private javax.swing.JLabel lbTime3;
    private javax.swing.JLabel lbTime4;
    private javax.swing.JLabel lbTime5;
    private javax.swing.JLabel lbTime6;
    private javax.swing.JLabel lbTime7;
    private javax.swing.JLabel lbTime8;
    private javax.swing.JLabel lbTime9;
    // End of variables declaration//GEN-END:variables
}
