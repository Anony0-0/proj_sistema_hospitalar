/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casa
 */
public class TelaProntuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaProntuario
     */
    public TelaProntuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdmissao = new javax.swing.JButton();
        btnEvolucao = new javax.swing.JButton();
        btnMedicacao = new javax.swing.JButton();
        btnExames = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("PRONTUÁRIO");
        getContentPane().setLayout(null);

        btnAdmissao.setBackground(new java.awt.Color(0, 0, 255));
        btnAdmissao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdmissao.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmissao.setText("Admissão");
        btnAdmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmissaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdmissao);
        btnAdmissao.setBounds(20, 30, 220, 110);

        btnEvolucao.setBackground(new java.awt.Color(0, 0, 255));
        btnEvolucao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEvolucao.setForeground(new java.awt.Color(255, 255, 255));
        btnEvolucao.setText("Evolução");
        btnEvolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvolucaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEvolucao);
        btnEvolucao.setBounds(340, 30, 220, 110);

        btnMedicacao.setBackground(new java.awt.Color(0, 0, 255));
        btnMedicacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMedicacao.setForeground(new java.awt.Color(255, 255, 255));
        btnMedicacao.setText("Medicação");
        btnMedicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMedicacao);
        btnMedicacao.setBounds(20, 160, 220, 100);

        btnExames.setBackground(new java.awt.Color(0, 0, 255));
        btnExames.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExames.setForeground(new java.awt.Color(255, 255, 255));
        btnExames.setText("Exames");
        btnExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamesActionPerformed(evt);
            }
        });
        getContentPane().add(btnExames);
        btnExames.setBounds(340, 160, 220, 100);

        btnAlta.setBackground(new java.awt.Color(0, 0, 255));
        btnAlta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlta.setForeground(new java.awt.Color(255, 255, 255));
        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlta);
        btnAlta.setBounds(180, 280, 220, 100);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 300, 90, 60);

        setSize(new java.awt.Dimension(599, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicacaoActionPerformed
        this.disable();
        TelaMed tela;
        tela = new TelaMed();
        tela.setVisible(true);
    }//GEN-LAST:event_btnMedicacaoActionPerformed

    private void btnExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamesActionPerformed
        this.disable();
        TelaExames tela;
        tela = new TelaExames();
        tela.setVisible(true);
    }//GEN-LAST:event_btnExamesActionPerformed

    private void btnAdmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmissaoActionPerformed
        this.disable();
        TelaAdm tela;
        tela = new TelaAdm();
        tela.setVisible(true);
    }//GEN-LAST:event_btnAdmissaoActionPerformed

    private void btnEvolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvolucaoActionPerformed
        this.disable();
        TelaEvolucao tela;
        tela = new TelaEvolucao();
        tela.setVisible(true);
    }//GEN-LAST:event_btnEvolucaoActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        this.disable();
        TelaA tela;
        tela = new TelaA();
        tela.setVisible(true);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new TelaMenu().setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaProntuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProntuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProntuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProntuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProntuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmissao;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEvolucao;
    private javax.swing.JButton btnExames;
    private javax.swing.JButton btnMedicacao;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
