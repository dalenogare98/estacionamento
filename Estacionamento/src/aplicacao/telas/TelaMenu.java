package aplicacao.telas;

import aplicacao.Interface.InterfaceControladorCarro;
import aplicacao.controlador.ControladorCarro;
import calculador.Calculador;


public class TelaMenu extends javax.swing.JFrame {

    
    private InterfaceControladorCarro interfaceControladorCarro;
    private CadastraVeiculo telaCadastro;
    private TelaPrecos telaPrecos;
    private SaidaCarro saidaCarro;
    private ListaCarros listaCarros;
    
    public TelaMenu(ControladorCarro controlador,Calculador calculador) {
        this.interfaceControladorCarro = controlador;
        this.telaPrecos = new TelaPrecos(this,calculador);
        this.saidaCarro = new SaidaCarro(this, controlador,calculador);
        this.listaCarros = new ListaCarros(this, controlador);
        this.telaCadastro = new CadastraVeiculo(this, controlador);
        calculador.setTela(saidaCarro);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botaoRegistrarVeiculo = new javax.swing.JButton();
        botaoCalcularPreco = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoConfigurarValores = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 330));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estacionamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 300));

        botaoRegistrarVeiculo.setText("Registrar Veículo");
        botaoRegistrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarVeiculoActionPerformed(evt);
            }
        });

        botaoCalcularPreco.setText("Registrar Saída");
        botaoCalcularPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularPrecoActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoConfigurarValores.setText("Configurar Valores");
        botaoConfigurarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfigurarValoresActionPerformed(evt);
            }
        });

        jButton1.setText("Lista de Carros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRegistrarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCalcularPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoConfigurarValores, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(botaoRegistrarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(botaoCalcularPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(botaoConfigurarValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRegistrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarVeiculoActionPerformed
        this.setVisible(false);
        this.telaCadastro.setVisible(true);
    }//GEN-LAST:event_botaoRegistrarVeiculoActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoConfigurarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfigurarValoresActionPerformed
        this.setVisible(false);
        this.telaPrecos.setTexts();
        telaPrecos.setaSalvarFalse();
        this.telaPrecos.setVisible(true);
    }//GEN-LAST:event_botaoConfigurarValoresActionPerformed

    private void botaoCalcularPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularPrecoActionPerformed
        this.setVisible(false);
        this.saidaCarro.setVisible(true);
    }//GEN-LAST:event_botaoCalcularPrecoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        this.listaCarros.setVisible(true);
        this.listaCarros.listarCarros();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcularPreco;
    private javax.swing.JButton botaoConfigurarValores;
    private javax.swing.JButton botaoRegistrarVeiculo;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
