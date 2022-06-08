import data.Paciente;
import data.PacienteDao;
import javax.swing.JOptionPane;



public class TelaPaciente extends javax.swing.JFrame {


    public TelaPaciente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        lblCelular = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();
        txtCPF = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JTextField();
        txtPNE = new javax.swing.JTextField();
        txtSangue = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtDataSus = new javax.swing.JTextField();
        txtNumeroSus = new javax.swing.JTextField();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONSULTA DE PACIENTE");
        getContentPane().setLayout(null);

        jLabel1.setText("CPF");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(19, 20, 50, 15);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(17, 60, 60, 15);

        jLabel3.setText("RG");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 50, 15);

        jLabel4.setText("Data Nasc.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 140, 70, 15);

        jLabel5.setText("Sexo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 220, 70, 15);

        jLabel6.setText("PNE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(19, 180, 50, 15);

        jLabel7.setText("Endereço");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 260, 60, 15);

        jLabel9.setText("Sangue");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 300, 70, 15);
        getContentPane().add(txtRG);
        txtRG.setBounds(110, 90, 220, 30);

        btnConsultar.setBackground(new java.awt.Color(0, 0, 255));
        btnConsultar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(410, 400, 110, 40);

        lblCelular.setText("Celular");
        getContentPane().add(lblCelular);
        lblCelular.setBounds(23, 340, 50, 15);

        jLabel10.setText("Numero Sus");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 420, 74, 15);

        jLabel11.setText("Data Sus");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(19, 380, 60, 15);

        btnMenu.setBackground(new java.awt.Color(0, 7, 255));
        btnMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(410, 300, 110, 39);

        btnProntuario.setBackground(new java.awt.Color(0, 0, 255));
        btnProntuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProntuario.setForeground(new java.awt.Color(255, 255, 255));
        btnProntuario.setText("Prontuário");
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnProntuario);
        btnProntuario.setBounds(410, 350, 110, 41);
        getContentPane().add(txtCPF);
        txtCPF.setBounds(110, 10, 220, 30);
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(110, 250, 220, 30);
        getContentPane().add(txtSexo);
        txtSexo.setBounds(110, 210, 220, 30);
        getContentPane().add(txtNascimento);
        txtNascimento.setBounds(110, 130, 220, 30);
        getContentPane().add(txtPNE);
        txtPNE.setBounds(110, 170, 220, 30);
        getContentPane().add(txtSangue);
        txtSangue.setBounds(110, 290, 220, 30);

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        getContentPane().add(txtCelular);
        txtCelular.setBounds(110, 330, 220, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(110, 50, 220, 30);

        txtDataSus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataSusActionPerformed(evt);
            }
        });
        getContentPane().add(txtDataSus);
        txtDataSus.setBounds(110, 370, 220, 30);
        getContentPane().add(txtNumeroSus);
        txtNumeroSus.setBounds(110, 410, 220, 30);

        setSize(new java.awt.Dimension(584, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        String CPF_Form;
        CPF_Form = txtRG.getText();
        
        
        PacienteDao Dao = new PacienteDao();
        boolean status = Dao.Conectar();
        
        if(status==true){
            Paciente ResultadoPaciente = Dao.Consultar(CPF_Form);
            
            if (ResultadoPaciente==null){
                JOptionPane.showMessageDialog(null, "CPF não encontrado");
            }
            else{
                if (ResultadoPaciente.getCPF().equals(CPF_Form)){
                    
                    txtRG.setText(ResultadoPaciente.getCPF());
                    txtNome.setText(ResultadoPaciente.getNome());
                    txtRG.setText(ResultadoPaciente.getRG());
                    txtNascimento.setText(ResultadoPaciente.getDataNasc());
                    txtSexo.setText(ResultadoPaciente.getSexo());
                    txtPNE.setText(ResultadoPaciente.getPNE());
                    txtEndereco.setText(ResultadoPaciente.getEndereco());
                    txtSangue.setText(ResultadoPaciente.getSangue());
                    txtCelular.setText(ResultadoPaciente.getCelular());
                    txtNumeroSus.setText(ResultadoPaciente.getSusNumero());
                    txtDataSus.setText(ResultadoPaciente.getSusValidade());
                    
                    Dao.Desconectar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Usuario ou senha incorreta");
                }    
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco");
        }
        
        
        
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        this.dispose();
        new TelaMenu().setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        this.dispose();
        new TelaProntuario().setVisible(true);
        
        String CPF_Form;
        CPF_Form = txtRG.getText();
        
        
        PacienteDao Dao = new PacienteDao();
        boolean status = Dao.Conectar();
        
        if(status==true){
            Paciente ResultadoPaciente = Dao.Consultar(CPF_Form);
            
            if (ResultadoPaciente==null){
                JOptionPane.showMessageDialog(null, "CPF não encontrado");
            }
            else{
                if (ResultadoPaciente.getCPF().equals(CPF_Form)){
                    
                    txtRG.setText(ResultadoPaciente.getCPF());
                    txtNome.setText(ResultadoPaciente.getNome());
                    txtRG.setText(ResultadoPaciente.getRG());
                    txtNascimento.setText(ResultadoPaciente.getDataNasc());
                    txtSexo.setText(ResultadoPaciente.getSexo());
                    txtPNE.setText(ResultadoPaciente.getPNE());
                    txtEndereco.setText(ResultadoPaciente.getEndereco());
                    txtSangue.setText(ResultadoPaciente.getSangue());
                    txtCelular.setText(ResultadoPaciente.getCelular());
                    txtNumeroSus.setText(ResultadoPaciente.getSusNumero());
                    txtDataSus.setText(ResultadoPaciente.getSusValidade());
                    
                    Dao.Desconectar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Usuario ou senha incorreta");
                }    
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco");
        }
    }//GEN-LAST:event_btnProntuarioActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtDataSusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataSusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataSusActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDataSus;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroSus;
    private javax.swing.JTextField txtPNE;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtSangue;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
