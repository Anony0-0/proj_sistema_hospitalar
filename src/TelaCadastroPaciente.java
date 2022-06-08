import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import data.Paciente;
import data.PacienteDao;

public class TelaCadastroPaciente extends javax.swing.JFrame {

    public TelaCadastroPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNacimento = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JTextField();
        lblResponsavel = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JTextField();
        lblRg = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblNome3 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        cmbRelacao = new javax.swing.JComboBox<>();
        lblNome4 = new javax.swing.JLabel();
        cmbRaca = new javax.swing.JComboBox<>();
        lblNome5 = new javax.swing.JLabel();
        lblNome6 = new javax.swing.JLabel();
        txtNomeMae = new javax.swing.JTextField();
        cmbOutroDocumento2 = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        lblNome8 = new javax.swing.JLabel();
        lblNome9 = new javax.swing.JLabel();
        txtNomePai = new javax.swing.JTextField();
        lblNome10 = new javax.swing.JLabel();
        cmbEstadoCivil = new javax.swing.JComboBox<>();
        lblNome11 = new javax.swing.JLabel();
        lblNome12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        lblNome14 = new javax.swing.JLabel();
        cmbTipoSangue = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btnLimpar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        lblOutrosDocumentos = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnAcessoProntuario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnuLimparDados = new javax.swing.JMenuItem();
        mnuSalvarDados = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO PACIENTE");
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(java.awt.Color.blue);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(null);

        lblNome.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 0, 40, 30);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(30, 30, 510, 30);

        lblNacimento.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNacimento.setText("Nascimento *");
        getContentPane().add(lblNacimento);
        lblNacimento.setBounds(600, 0, 80, 30);

        txtNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNascimento);
        txtNascimento.setBounds(600, 30, 120, 30);

        lblResponsavel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblResponsavel.setText("Responsável");
        getContentPane().add(lblResponsavel);
        lblResponsavel.setBounds(790, 0, 80, 30);

        txtResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsavelActionPerformed(evt);
            }
        });
        getContentPane().add(txtResponsavel);
        txtResponsavel.setBounds(790, 30, 260, 30);

        lblRg.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblRg.setText("RG *");
        getContentPane().add(lblRg);
        lblRg.setBounds(30, 70, 30, 30);

        txtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgActionPerformed(evt);
            }
        });
        getContentPane().add(txtRg);
        txtRg.setBounds(30, 100, 280, 30);

        lblCpf.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblCpf.setText("CPF *");
        getContentPane().add(lblCpf);
        lblCpf.setBounds(330, 70, 30, 30);

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf);
        txtCpf.setBounds(330, 100, 240, 30);

        lblNome3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome3.setText("Documento");
        getContentPane().add(lblNome3);
        lblNome3.setBounds(770, 60, 70, 40);

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDocumento);
        txtDocumento.setBounds(770, 100, 280, 30);

        cmbRelacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Preenchido", "Responsável", "Tutor", "Amigo" }));
        cmbRelacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRelacaoItemStateChanged(evt);
            }
        });
        cmbRelacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRelacaoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbRelacao);
        cmbRelacao.setBounds(1080, 30, 140, 30);

        lblNome4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome4.setText("Raça");
        getContentPane().add(lblNome4);
        lblNome4.setBounds(180, 130, 30, 30);

        cmbRaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Informação", "Branco", "Negro", "Pardo", "Sem definição" }));
        cmbRaca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRacaItemStateChanged(evt);
            }
        });
        cmbRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRacaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbRaca);
        cmbRaca.setBounds(180, 160, 130, 30);

        lblNome5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome5.setText("Nome do Pai");
        getContentPane().add(lblNome5);
        lblNome5.setBounds(700, 130, 70, 30);

        lblNome6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome6.setText("Nome da Mãe");
        getContentPane().add(lblNome6);
        lblNome6.setBounds(330, 130, 80, 30);

        txtNomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeMaeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeMae);
        txtNomeMae.setBounds(330, 160, 330, 30);

        cmbOutroDocumento2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Preenchido", "CNH", "Passaporte" }));
        cmbOutroDocumento2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOutroDocumento2ItemStateChanged(evt);
            }
        });
        cmbOutroDocumento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOutroDocumento2ActionPerformed(evt);
            }
        });
        getContentPane().add(cmbOutroDocumento2);
        cmbOutroDocumento2.setBounds(600, 100, 140, 30);

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Preenchido", "Masculino", "Feminino" }));
        cmbSexo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSexoItemStateChanged(evt);
            }
        });
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSexo);
        cmbSexo.setBounds(30, 160, 140, 30);

        lblNome8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome8.setText("Relação");
        getContentPane().add(lblNome8);
        lblNome8.setBounds(1080, 0, 50, 30);

        lblNome9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome9.setText("Sexo");
        getContentPane().add(lblNome9);
        lblNome9.setBounds(30, 130, 30, 30);

        txtNomePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePaiActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomePai);
        txtNomePai.setBounds(700, 160, 350, 30);

        lblNome10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome10.setText("Estado Civil");
        getContentPane().add(lblNome10);
        lblNome10.setBounds(1080, 70, 70, 30);

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Informação", "Casado", "Solteiro", "União Estável" }));
        cmbEstadoCivil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadoCivilItemStateChanged(evt);
            }
        });
        cmbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoCivilActionPerformed(evt);
            }
        });
        getContentPane().add(cmbEstadoCivil);
        cmbEstadoCivil.setBounds(1080, 100, 140, 30);

        lblNome11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome11.setText("Celular");
        getContentPane().add(lblNome11);
        lblNome11.setBounds(330, 200, 60, 30);

        lblNome12.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome12.setText("E-mail");
        getContentPane().add(lblNome12);
        lblNome12.setBounds(30, 200, 40, 30);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(30, 230, 280, 30);

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(330, 230, 330, 30);

        lblNome14.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNome14.setText("Tipo Sanguineo");
        getContentPane().add(lblNome14);
        lblNome14.setBounds(1080, 130, 90, 30);

        cmbTipoSangue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Informação", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O" }));
        cmbTipoSangue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoSangueItemStateChanged(evt);
            }
        });
        cmbTipoSangue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoSangueActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoSangue);
        cmbTipoSangue.setBounds(1080, 160, 140, 30);

        jSeparator1.setAlignmentX(0.1F);
        jSeparator1.setAlignmentY(0.1F);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 340, 1250, 20);

        btnLimpar.setBackground(new java.awt.Color(0, 0, 255));
        btnLimpar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setActionCommand("Sucesso");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(490, 360, 110, 29);

        btnGravar.setBackground(new java.awt.Color(0, 0, 255));
        btnGravar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGravar.setForeground(new java.awt.Color(255, 255, 255));
        btnGravar.setText("Gravar");
        btnGravar.setActionCommand("Sucesso");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGravar);
        btnGravar.setBounds(10, 360, 110, 30);

        lblOutrosDocumentos.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblOutrosDocumentos.setText("Outros Documentos");
        getContentPane().add(lblOutrosDocumentos);
        lblOutrosDocumentos.setBounds(610, 70, 114, 20);

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
        btnConsultar.setBounds(130, 360, 110, 30);

        btnAlterar.setBackground(new java.awt.Color(0, 0, 255));
        btnAlterar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(250, 360, 110, 30);

        btnExcluir.setBackground(new java.awt.Color(0, 0, 255));
        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(370, 360, 110, 30);

        jSeparator2.setAlignmentX(0.1F);
        jSeparator2.setAlignmentY(0.1F);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 280, 1250, 20);

        jSeparator3.setAlignmentX(0.1F);
        jSeparator3.setAlignmentY(0.1F);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 410, 1250, 20);

        btnAcessoProntuario.setBackground(new java.awt.Color(0, 0, 255));
        btnAcessoProntuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAcessoProntuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAcessoProntuario.setText("Prontuário");
        btnAcessoProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessoProntuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessoProntuario);
        btnAcessoProntuario.setBounds(620, 360, 110, 30);

        jMenu2.setText("Opçoes");

        mnuLimparDados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuLimparDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpardados.jpg"))); // NOI18N
        mnuLimparDados.setText("Limpar Dados");
        mnuLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLimparDadosActionPerformed(evt);
            }
        });
        jMenu2.add(mnuLimparDados);

        mnuSalvarDados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuSalvarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvardados.jpg"))); // NOI18N
        mnuSalvarDados.setText("Salvar Dados");
        mnuSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalvarDadosActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSalvarDados);

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        mnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(1241, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed


    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascimentoActionPerformed

    }//GEN-LAST:event_txtNascimentoActionPerformed

    private void txtResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponsavelActionPerformed

    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void cmbRelacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRelacaoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRelacaoItemStateChanged

    private void cmbRelacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRelacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRelacaoActionPerformed

    private void cmbRacaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRacaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRacaItemStateChanged

    private void cmbRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRacaActionPerformed

    private void txtNomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeMaeActionPerformed

    private void cmbOutroDocumento2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOutroDocumento2ItemStateChanged
       
      
    }//GEN-LAST:event_cmbOutroDocumento2ItemStateChanged

    private void cmbOutroDocumento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOutroDocumento2ActionPerformed


    }//GEN-LAST:event_cmbOutroDocumento2ActionPerformed

    private void cmbSexoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSexoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoItemStateChanged

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed

    private void txtNomePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePaiActionPerformed

    private void cmbEstadoCivilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadoCivilItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoCivilItemStateChanged

    private void cmbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoCivilActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void cmbTipoSangueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoSangueItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoSangueItemStateChanged

    private void cmbTipoSangueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoSangueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoSangueActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        boolean r;
        PepDao pepDao;
        pep pep;

        pep = new pep();
        pep.setNome(txtNome.getText());
        pep.setNascimento(txtNascimento.getText());
        pep.setResponsavel(txtResponsavel.getText());
        pep.setRelacao(cmbRelacao.getSelectedItem().toString());
        pep.setRg(txtRg.getText());
        pep.setCpf(txtCpf.getText());
        pep.setOutrodocumento2(cmbOutroDocumento2.getSelectedItem().toString());
        pep.setDocumentocomplementar(txtDocumento.getText());
        pep.setSexo(cmbSexo.getSelectedItem().toString());
        pep.setRaca(cmbRaca.getSelectedItem().toString());
        pep.setNomedamae(txtNomeMae.getText());
        pep.setNomedopai(txtNomePai.getText());
        pep.setEmail(txtEmail.getText());
        pep.setTelefone(txtTelefone.getText());
        pep.setEstadocivil(cmbEstadoCivil.getSelectedItem().toString());
        pep.setTiposanguineo(cmbTipoSangue.getSelectedItem().toString());

        pepDao = new PepDao();
        r = pepDao.conectar();
        if (r == true) {
            r = pepDao.salvar(pep);
            if (r == true) {
                JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso");
                limpar();

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não conectou");
        }


    }//GEN-LAST:event_btnGravarActionPerformed

    private void mnuLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLimparDadosActionPerformed
        btnLimpar.doClick();
    }//GEN-LAST:event_mnuLimparDadosActionPerformed

    private void mnuSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalvarDadosActionPerformed
        btnGravar.doClick();
    }//GEN-LAST:event_mnuSalvarDadosActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed

    }//GEN-LAST:event_mnuSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        try {
            Connection con;
            PreparedStatement st;
            ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            st = con.prepareStatement("SELECT * FROM  prontuariocadastro WHERE cpf = ?");

            st.setString(1, txtCpf.getText());
            rs = st.executeQuery();

            if (rs.next()) {
                txtNome.setText(rs.getString("Nome"));
                txtNascimento.setText(rs.getString("Nascimento"));
                txtResponsavel.setText(rs.getString("Responsavel"));
                cmbRelacao.setSelectedItem(rs.getString("Relacao"));
                txtRg.setText(rs.getString("Rg"));
                cmbOutroDocumento2.setSelectedItem(rs.getString("Outrodocumento2"));
                txtDocumento.setText(rs.getString("Documentocomplementar"));
                cmbSexo.setSelectedItem(rs.getString("Sexo"));
                cmbRaca.setSelectedItem(rs.getString("Raca"));
                txtNomeMae.setText(rs.getString("Nomedamae"));
                txtNomePai.setText(rs.getString("Nomedopai"));
                txtEmail.setText(rs.getString("Email"));
                txtTelefone.setText(rs.getString("Telefone"));
                cmbEstadoCivil.setSelectedItem(rs.getString("Estadocivil"));
                cmbTipoSangue.setSelectedItem(rs.getString("Tiposanguineo"));

            } else {
                JOptionPane.showMessageDialog(null, "Paciente Não encontrado");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no no acesso ao Banco de Dados entre em contato com o adm" + ex.getMessage());

        }

    }

    private void limpar() {

        txtNome.setText("");
        txtNascimento.setText("");
        txtResponsavel.setText("");
        cmbRelacao.setSelectedItem("Não Preenchido");
        txtRg.setText("");
        cmbOutroDocumento2.setSelectedItem("Não Preenchido");
        txtDocumento.setText("");
        cmbSexo.setSelectedItem("Não Preenchido");
        cmbRaca.setSelectedItem("Sem Informação");
        txtNomeMae.setText("");
        txtNomePai.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        cmbEstadoCivil.setSelectedItem("Sem Informação");
        cmbTipoSangue.setSelectedItem("Sem Informação");
        txtCpf.setText("");
        txtCpf.requestFocus();

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            Connection con;
            PreparedStatement st;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            st = con.prepareStatement("UPDATE prontuariocadastro SET Nome = ?, Nascimento = ?, Responsavel = ?, Relacao = ?, Rg = ?, Tiposanguineo = ?, Outrodocumento2 = ?, Documentocomplementar = ?,Sexo = ?, Raca = ?,Nomedamae = ?, Nomedopai = ?,Email = ?, Telefone = ?,Estadocivil = ? WHERE cpf = ?");

            st.setString(1, txtNome.getText());
            st.setString(2, txtNascimento.getText());
            st.setString(3, txtResponsavel.getText());
            st.setString(4, cmbRelacao.getSelectedItem().toString());
            st.setString(5, txtRg.getText());
            st.setString(6, cmbTipoSangue.getSelectedItem().toString());
            st.setString(7, cmbOutroDocumento2.getSelectedItem().toString());
            st.setString(8, txtDocumento.getText());
            st.setString(9, cmbSexo.getSelectedItem().toString());
            st.setString(10, cmbRaca.getSelectedItem().toString());
            st.setString(11, txtNomeMae.getText());
            st.setString(12, txtNomePai.getText());
            st.setString(13, txtEmail.getText());
            st.setString(14, txtTelefone.getText());
            st.setString(15, cmbEstadoCivil.getSelectedItem().toString());
            st.setString(16, txtCpf.getText());
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso");

            limpar();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            //conectar no banco
            Connection con;
            PreparedStatement st;

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            //exluir
            st = con.prepareStatement("DELETE FROM prontuariocadastro WHERE cpf = ?");
            st.setString(1, txtCpf.getText());
            st.executeUpdate();

            //metodo para limpar campos 
            limpar();

            //feedback
            JOptionPane.showMessageDialog(null, "Paciente Excluído com Sucesso");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no no acesso ao Banco de Dados entre em contato com o adm" + ex.getMessage());

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void btnAcessoProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessoProntuarioActionPerformed
        this.dispose();
        TelaProntuario tela;
        tela = new TelaProntuario();
        tela.setVisible(true);
    }//GEN-LAST:event_btnAcessoProntuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessoProntuario;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbEstadoCivil;
    private javax.swing.JComboBox<String> cmbOutroDocumento2;
    private javax.swing.JComboBox<String> cmbRaca;
    private javax.swing.JComboBox<String> cmbRelacao;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbTipoSangue;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNacimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome10;
    private javax.swing.JLabel lblNome11;
    private javax.swing.JLabel lblNome12;
    private javax.swing.JLabel lblNome14;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNome5;
    private javax.swing.JLabel lblNome6;
    private javax.swing.JLabel lblNome8;
    private javax.swing.JLabel lblNome9;
    private javax.swing.JLabel lblOutrosDocumentos;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JLabel lblRg;
    private javax.swing.JMenuItem mnuLimparDados;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenuItem mnuSalvarDados;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JTextField txtNomePai;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
