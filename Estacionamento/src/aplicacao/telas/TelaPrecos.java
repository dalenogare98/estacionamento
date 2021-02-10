package aplicacao.telas;

import calculador.Calculador;
import javax.swing.JOptionPane;

public class TelaPrecos extends javax.swing.JFrame {
    
    
    
    private Calculador calculador;
    private TelaMenu owner;
    
    public TelaPrecos(TelaMenu owner,Calculador calculador) {
        this.calculador = calculador;
        this.owner = owner;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setTexts(){
        tolerancia.setText(Integer.toString(calculador.getTolerancia()));
        valorInicial.setText(Float.toString(calculador.getValorInicial()));
        valorAdicional.setText(Float.toString(calculador.getValorAdicional()));
        periodoAdicional.setText(Integer.toString(calculador.getPeriodoAdicional()));
        periodoInicial.setText(Integer.toString(calculador.getPeriodoInicial()));
    }

    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tolerancia = new javax.swing.JTextField();
        valorInicial = new javax.swing.JTextField();
        valorAdicional = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        periodoInicial = new javax.swing.JTextField();
        periodoAdicional = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(357, 316));

        jPanel1.setSize(350, 300);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preços e horários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(367, 285));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Valor inicial:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Valor adicional:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tolerância:");

        tolerancia.setEnabled(false);
        tolerancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toleranciaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toleranciaKeyTyped(evt);
            }
        });

        valorInicial.setEnabled(false);
        valorInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorInicialKeyTyped(evt);
            }
        });

        valorAdicional.setEnabled(false);
        valorAdicional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorAdicionalKeyTyped(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel4.setText("hora(s)");

        periodoInicial.setEnabled(false);

        periodoAdicional.setEnabled(false);

        jLabel8.setText("minutos");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Período inicial:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Período adicional:");

        jLabel5.setText("reais");

        jLabel6.setText("hora(s)");

        jLabel10.setText("reais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorAdicional, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(periodoAdicional, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(valorInicial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(periodoInicial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tolerancia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addGap(123, 123, 123))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(137, 137, 137))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tolerancia)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(periodoInicial)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorInicial)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(periodoAdicional)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(valorAdicional)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        tolerancia.setEnabled(true);
        valorInicial.setEnabled(true);
        valorAdicional.setEnabled(true);
        periodoAdicional.setEnabled(true);
        periodoInicial.setEnabled(true);
        voltar.setEnabled(false);
        salvar.setEnabled(true);
        editar.setEnabled(false);
    }//GEN-LAST:event_editarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if(tolerancia.getText().length() == 0 || valorInicial.getText().length() == 0 || valorAdicional.getText().length() ==0 || periodoInicial.getText().length() == 0 || periodoAdicional.getText().length() == 0){
           JOptionPane.showMessageDialog(null, " Preencha todos os campos ");
        }
        else{
        tolerancia.setEnabled(false);
        valorInicial.setEnabled(false);
        valorAdicional.setEnabled(false);
        periodoAdicional.setEnabled(false);
        periodoInicial.setEnabled(false);
        calculador.setTolerancia(Integer.parseInt(tolerancia.getText()));
        calculador.setValorInicial(Float.parseFloat(valorInicial.getText()));
        calculador.setValorAdicional(Float.parseFloat(valorAdicional.getText()));
        calculador.setPeriodoInicial(Integer.parseInt(periodoInicial.getText()));
        calculador.setPeriodoAdicional(Integer.parseInt(periodoAdicional.getText()));
        editar.setEnabled(true);
        voltar.setEnabled(true);
        salvar.setEnabled(false);
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.setVisible(false);
        this.owner.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void toleranciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toleranciaKeyPressed
        
    }//GEN-LAST:event_toleranciaKeyPressed

    private void toleranciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toleranciaKeyTyped
        String caracteres = "0987654321";
    if(!caracteres.contains(evt.getKeyChar()+"") || tolerancia.getText().length() == 2){
    evt.consume();
    }
    }//GEN-LAST:event_toleranciaKeyTyped

    private void valorInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorInicialKeyTyped
        String caracteres = "0987654321";
    if(!caracteres.contains(evt.getKeyChar()+"") || valorInicial.getText().length() == 2){
    evt.consume();
    }
    }//GEN-LAST:event_valorInicialKeyTyped

    private void valorAdicionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorAdicionalKeyTyped
        String caracteres = "0987654321";
    if(!caracteres.contains(evt.getKeyChar()+"") || valorAdicional.getText().length() == 2){
    evt.consume();
    }
    }//GEN-LAST:event_valorAdicionalKeyTyped

  
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
            java.util.logging.Logger.getLogger(TelaPrecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton editar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField periodoAdicional;
    private javax.swing.JTextField periodoInicial;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField tolerancia;
    private javax.swing.JTextField valorAdicional;
    private javax.swing.JTextField valorInicial;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

    public void setaSalvarFalse() {
        salvar.setEnabled(false);
    }

   
}
