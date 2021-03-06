/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import persistencia.TelaMedicamentoDao;
import persistencia.TelaMedicamento;

/**
 *
 * @author casa
 */
public class TelaMed extends javax.swing.JFrame {

    /**
     * Creates new form TelaMedicamento
     */
    public TelaMed() {
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

        jLabel1 = new javax.swing.JLabel();
        txtMedicamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUnidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFrequencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAcesso = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        btnAvancar = new javax.swing.JButton();

        setTitle("MEDICAÇÕES");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Medicações");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 12, 110, 16);
        getContentPane().add(txtMedicamento);
        txtMedicamento.setBounds(10, 30, 390, 70);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Quantidade ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 120, 80, 16);
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(10, 140, 120, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Unidade");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 190, 70, 20);
        getContentPane().add(txtUnidade);
        txtUnidade.setBounds(10, 210, 120, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Frequência");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 260, 100, 16);
        getContentPane().add(txtFrequencia);
        txtFrequencia.setBounds(10, 280, 120, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Via de Acesso");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 340, 100, 16);
        getContentPane().add(txtAcesso);
        txtAcesso.setBounds(10, 360, 120, 30);

        btnGravar.setBackground(new java.awt.Color(0, 0, 255));
        btnGravar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGravar.setForeground(new java.awt.Color(255, 255, 255));
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGravar);
        btnGravar.setBounds(10, 430, 120, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Nome do Paciente");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 10, 140, 16);
        getContentPane().add(txtNomePaciente);
        txtNomePaciente.setBounds(450, 30, 340, 30);

        btnAvancar.setBackground(new java.awt.Color(0, 0, 255));
        btnAvancar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAvancar.setForeground(new java.awt.Color(255, 255, 255));
        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvancar);
        btnAvancar.setBounds(170, 430, 120, 30);

        setSize(new java.awt.Dimension(830, 552));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
      boolean r;
        TelaMedicamento t;
        TelaMedicamentoDao tela;

        t = new TelaMedicamento();
        t.setMedicamento(txtMedicamento.getText());
        t.setQuantidade(txtQuantidade.getText());
        t.setUnidade(txtUnidade.getText());
        t.setFrequencia(txtFrequencia.getText());
        t.setAcesso(txtAcesso.getText());
        t.setNomePaciente(txtNomePaciente.getText());
       
        tela = new TelaMedicamentoDao();
        r = tela.conectar();
        if (r == true) {
            r = tela.salvar(t);
            if (r == true) {
                JOptionPane.showMessageDialog(null, "Informações Salvas com sucesso");
                
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não conectou");
        }
    }                                         

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        this.disable();
        TelaA tela;
        tela = new TelaA();
        tela.setVisible(true);
    }//GEN-LAST:event_btnAvancarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAcesso;
    private javax.swing.JTextField txtFrequencia;
    private javax.swing.JTextField txtMedicamento;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtUnidade;
    // End of variables declaration//GEN-END:variables

    
}
