package Clases;

import javax.swing.JOptionPane;

public class FrmHerencia extends javax.swing.JFrame {

    
    public FrmHerencia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnPPlus = new javax.swing.JButton();
        BtnLimpiarB = new javax.swing.JButton();
        BtnPBasic = new javax.swing.JButton();
        BtnLimpiarP = new javax.swing.JButton();
        TxtCostoB = new javax.swing.JTextField();
        TxtNinios = new javax.swing.JTextField();
        TxtPayasos = new javax.swing.JTextField();
        TxtRegalos = new javax.swing.JTextField();
        TxtBotargas = new javax.swing.JTextField();
        TxtCostoP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gerardo Garcia Murrieta");

        jLabel2.setText("Niños");

        jLabel3.setText("Importe");

        jLabel4.setText("Payasos");

        jLabel5.setText("Botargas");

        jLabel6.setText("Regalos");

        BtnPPlus.setBackground(new java.awt.Color(0, 153, 204));
        BtnPPlus.setText("Calcular");
        BtnPPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPPlusActionPerformed(evt);
            }
        });

        BtnLimpiarB.setBackground(new java.awt.Color(204, 0, 0));
        BtnLimpiarB.setText("Limpiar");
        BtnLimpiarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarBActionPerformed(evt);
            }
        });

        BtnPBasic.setBackground(new java.awt.Color(0, 153, 255));
        BtnPBasic.setText("Calcular");
        BtnPBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPBasicActionPerformed(evt);
            }
        });

        BtnLimpiarP.setBackground(new java.awt.Color(204, 0, 0));
        BtnLimpiarP.setText("Limpiar");
        BtnLimpiarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarPActionPerformed(evt);
            }
        });

        TxtNinios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNiniosKeyTyped(evt);
            }
        });

        TxtPayasos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPayasosKeyTyped(evt);
            }
        });

        TxtRegalos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRegalosKeyTyped(evt);
            }
        });

        TxtBotargas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBotargasKeyTyped(evt);
            }
        });

        jLabel7.setText("Importe");

        jLabel8.setText("Paquete Básico");

        jLabel9.setText("Paquete Plus");

        jLabel10.setText("Sistema deAnimación de Fiestas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(TxtCostoB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(293, 293, 293)
                        .addComponent(BtnPPlus)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnPBasic)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnLimpiarB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxtRegalos, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                        .addComponent(TxtPayasos)
                                        .addComponent(TxtBotargas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtCostoP, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BtnLimpiarP)
                                        .addGap(12, 12, 12)))))
                        .addGap(45, 45, 45)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtNinios, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnPBasic)
                                    .addComponent(TxtBotargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(TxtNinios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPayasos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(TxtRegalos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(TxtCostoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnPPlus)
                                .addGap(48, 48, 48)))
                        .addComponent(BtnLimpiarB)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TxtCostoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addComponent(BtnLimpiarP)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNiniosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNiniosKeyTyped
         char Vali = evt.getKeyChar();
        if (!Character.isDigit(Vali)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtNiniosKeyTyped

    private void BtnPBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPBasicActionPerformed
        ValidaCajasB();
        int n = Integer.parseInt(TxtNinios.getText());
        
        Cls_Basico bp = new Cls_Basico(n);
        TxtCostoB.setText(String.valueOf(bp.Basico()));
        ValidaCajasP();
        
        
    }//GEN-LAST:event_BtnPBasicActionPerformed

    private void BtnPPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPPlusActionPerformed
       int n = Integer.parseInt(TxtNinios.getText());///SE RECUPERAN LAS VARIABLES Y SE CONVIERTEN EN ENTEROS
        int p = Integer.parseInt(TxtPayasos.getText());
        int g = Integer.parseInt(TxtRegalos.getText());
        int b = Integer.parseInt(TxtBotargas.getText());
        
        Cls_Plus pp = new Cls_Plus(n, p, g, b);//CREACION DE INSTANCIA DE LA CLASE CLSPLUSPACK, SE PASAN PARAMETROS CON LAS VARIABLES QUE RECUPERAN LOS VALORES
        TxtCostoP.setText(String.valueOf(pp.Plus()));//MANDA A LLAMAR METODO PARA PAGO PLUS
    }//GEN-LAST:event_BtnPPlusActionPerformed

    private void TxtPayasosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPayasosKeyTyped
        char Vali = evt.getKeyChar();
        if (!Character.isDigit(Vali)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtPayasosKeyTyped

    private void TxtRegalosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRegalosKeyTyped
       char Vali = evt.getKeyChar();
        if (!Character.isDigit(Vali)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtRegalosKeyTyped

    private void TxtBotargasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBotargasKeyTyped
        char Vali = evt.getKeyChar();
        if (!Character.isDigit(Vali)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtBotargasKeyTyped

    private void BtnLimpiarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarBActionPerformed
         LimpiarCajasB();//METODO DE LIMPIADO DE CAJAS DE TEXTO
    }//GEN-LAST:event_BtnLimpiarBActionPerformed

    private void BtnLimpiarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarPActionPerformed
        LimpiarCajasP();///METODO DE LIMPIADO DE CAJAS
    }//GEN-LAST:event_BtnLimpiarPActionPerformed
//VALIDACION DE CAJAS EN BLANCO Y LIMPIA DE ESTAS
    public void ValidaCajasB() 
    {
        if (TxtNinios.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Agregue texto", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void ValidaCajasP() 
    {
        if (TxtNinios.getText().isEmpty() || TxtPayasos.getText().isEmpty() || TxtRegalos.getText().isEmpty() || TxtBotargas.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Agregue Texto", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void LimpiarCajasB()
     {
         TxtNinios.setText("");
         TxtCostoB.setText("");
         
     }
      public void LimpiarCajasP()
     {
         TxtNinios.setText("");
         TxtPayasos.setText("");
         TxtRegalos.setText("");
         TxtBotargas.setText("");
         TxtCostoP.setText("");
         
     }
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
            java.util.logging.Logger.getLogger(FrmHerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHerencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiarB;
    private javax.swing.JButton BtnLimpiarP;
    private javax.swing.JButton BtnPBasic;
    private javax.swing.JButton BtnPPlus;
    public javax.swing.JTextField TxtBotargas;
    private javax.swing.JTextField TxtCostoB;
    private javax.swing.JTextField TxtCostoP;
    public javax.swing.JTextField TxtNinios;
    public javax.swing.JTextField TxtPayasos;
    public javax.swing.JTextField TxtRegalos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
