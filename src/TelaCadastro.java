
import data.Login;
import data.LoginDao;
import javax.swing.JOptionPane;


public class TelaCadastro extends javax.swing.JFrame {


    public TelaCadastro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO FUNCIONÁRIO");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 55, 48, 19);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Senha");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 96, 41, 19);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 137, 36, 19);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Cargo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 178, 39, 19);

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(126, 53, 196, 23);

        txtSenha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtSenha);
        txtSenha.setBounds(126, 94, 196, 23);

        txtNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(126, 135, 196, 23);

        txtCargo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtCargo);
        txtCargo.setBounds(126, 176, 196, 23);

        btnSalvar.setBackground(new java.awt.Color(0, 0, 255));
        btnSalvar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(160, 234, 78, 29);

        setSize(new java.awt.Dimension(467, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        LoginDao Dao = new LoginDao();
        Login login = new Login();
        boolean status;
        int resp;
        
        login.setUsuario(txtUsuario.getText());
        login.setSenha(txtSenha.getText());
        login.setNome(txtNome.getText());
        login.setCargo(txtCargo.getText());
        
        status = Dao.Conectar();
        if (status == false){
            JOptionPane.showMessageDialog(null,"Erro na conexão com o banco de dados");
        }
        else{
            resp = Dao.Salvar(login);
            if (resp==1){
                JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!");
                this.dispose();
                new TelaLogin().setVisible(true);
            }
            else if(resp==1062){
                JOptionPane.showMessageDialog(null,"Usuário já cadastrado!");
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao cadastrar!");
            }

            Dao.Desconectar();
        }
        

        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
