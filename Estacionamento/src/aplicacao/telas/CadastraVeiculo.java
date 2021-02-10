package aplicacao.telas;


import aplicacao.controlador.ControladorCarro;
import javax.swing.JOptionPane;
import aplicacao.Interface.InterfaceControladorCarro;


public class CadastraVeiculo extends javax.swing.JFrame {

    private InterfaceControladorCarro interfaceControladorCarro;
    private TelaMenu owner;
    
    public CadastraVeiculo(TelaMenu owner,ControladorCarro controlador) {
        this.interfaceControladorCarro = controlador;
        this.owner = owner;
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        placa = new javax.swing.JFormattedTextField();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        horas = new javax.swing.JSpinner();
        minutos = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(348, 301));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Placa");

        try {
            placa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        placa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        placa.setNavigationFilter(null);
        placa.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                placaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        placa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placaMouseClicked(evt);
            }
        });
        placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaActionPerformed(evt);
            }
        });
        placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                placaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placaKeyTyped(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Horário de Entrada");

        horas.setModel(new javax.swing.SpinnerNumberModel(6, 6, 23, 1));

        minutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placa)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(horas, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minutos, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(placa)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(horas)
                    .addComponent(minutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
        this.owner.setVisible(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        Integer horario = (Integer) horas.getValue()*60 + (Integer) minutos.getValue();
        if(placa.getText().contains("  ")){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos");
            placa.setText("");
            placa.setValue(null);
        }
        else if(this.interfaceControladorCarro.jaPossuiCarro(placa.getText())){
            JOptionPane.showMessageDialog(null, " JÁ POSSUI UM VEÍCULO REGISTRADO COM ESTA PLACA ");
            placa.setText("");
            placa.setValue(null);
            horas.setValue(6);
            minutos.setValue(0);
        }
        else{
            interfaceControladorCarro.cadastrarCarro(placa.getText(),horario);
            placa.setText("");
            placa.setValue(null);
            horas.setValue(6);
            minutos.setValue(0);
            this.setVisible(false);
            this.owner.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_salvarActionPerformed

    private void placaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placaMouseClicked

    }//GEN-LAST:event_placaMouseClicked

    private void placaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaKeyPressed

    private void placaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_placaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_placaAncestorAdded

    private void placaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_placaKeyTyped

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
            java.util.logging.Logger.getLogger(CadastraVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JSpinner horas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner minutos;
    private javax.swing.JFormattedTextField placa;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
