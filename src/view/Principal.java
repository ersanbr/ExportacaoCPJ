/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ersan
 */
public class Principal extends javax.swing.JFrame {

    Integer conexao = 0;
    Integer numeroFichas = 0;

    ArrayList<ArquivoFichaIncidente> fichas = new ArrayList();

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanelConectaBanco = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtDatabase = new javax.swing.JTextField();
        btnConecta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanelExporta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnExportaFicha = new javax.swing.JButton();
        jPanelLog = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jPanelPegaFicha = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtTabelaFicha = new javax.swing.JTextField();
        jLabelFichas = new javax.swing.JLabel();
        btnPegaFicha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Principal"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("Host:");

        jLabel2.setText("Usuário:");

        jLabel3.setText("Senha:");

        jLabel4.setText("Database:");

        txtHost.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtHost.setText("localhost");
        txtHost.setName("txtHost"); // NOI18N
        txtHost.setPreferredSize(new java.awt.Dimension(100, 20));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtUsuario.setText("root");
        txtUsuario.setToolTipText("");
        txtUsuario.setMinimumSize(new java.awt.Dimension(159, 20));
        txtUsuario.setName("txtUser"); // NOI18N
        txtUsuario.setPreferredSize(new java.awt.Dimension(100, 20));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtPassword.setText("root");
        txtPassword.setName("txtPassword"); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(100, 20));

        txtDatabase.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtDatabase.setText("cpjwcs");
        txtDatabase.setName("txtDatabase"); // NOI18N
        txtDatabase.setPreferredSize(new java.awt.Dimension(100, 20));

        btnConecta.setLabel("Conecta !");
        btnConecta.setName("btnConecta"); // NOI18N
        btnConecta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConectaMouseClicked(evt);
            }
        });
        btnConecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectaActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Conexão com o Banco de Dados");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelConectaBancoLayout = new javax.swing.GroupLayout(jPanelConectaBanco);
        jPanelConectaBanco.setLayout(jPanelConectaBancoLayout);
        jPanelConectaBancoLayout.setHorizontalGroup(
            jPanelConectaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConectaBancoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelConectaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(btnConecta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelConectaBancoLayout.createSequentialGroup()
                        .addGroup(jPanelConectaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelConectaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHost, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        jPanelConectaBancoLayout.setVerticalGroup(
            jPanelConectaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConectaBancoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanelConectaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConectaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConectaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConectaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConecta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Exporta as Informações das Fichas");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setMaximumSize(new java.awt.Dimension(156, 16));

        btnExportaFicha.setText("Exporta as Informações das Fichas");
        btnExportaFicha.setEnabled(false);
        btnExportaFicha.setName("btnExporta"); // NOI18N
        btnExportaFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportaFichaMouseClicked(evt);
            }
        });
        btnExportaFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportaFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelExportaLayout = new javax.swing.GroupLayout(jPanelExporta);
        jPanelExporta.setLayout(jPanelExportaLayout);
        jPanelExportaLayout.setHorizontalGroup(
            jPanelExportaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExportaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelExportaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExportaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelExportaLayout.setVerticalGroup(
            jPanelExportaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExportaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExportaFicha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Área de Log");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane1.setViewportView(txtLog);

        javax.swing.GroupLayout jPanelLogLayout = new javax.swing.GroupLayout(jPanelLog);
        jPanelLog.setLayout(jPanelLogLayout);
        jPanelLogLayout.setHorizontalGroup(
            jPanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelLogLayout.setVerticalGroup(
            jPanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Obtém informações das Fichas");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setMaximumSize(new java.awt.Dimension(156, 16));

        txtTabelaFicha.setEditable(false);
        txtTabelaFicha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtTabelaFicha.setText("ficha");
        txtTabelaFicha.setName("txtTabelaFicha"); // NOI18N
        txtTabelaFicha.setPreferredSize(new java.awt.Dimension(100, 20));

        jLabelFichas.setText("Tabela:");

        btnPegaFicha.setText("Obtém informações das Fichas");
        btnPegaFicha.setEnabled(false);
        btnPegaFicha.setName("btnObtem"); // NOI18N
        btnPegaFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPegaFichaMouseClicked(evt);
            }
        });
        btnPegaFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegaFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPegaFichaLayout = new javax.swing.GroupLayout(jPanelPegaFicha);
        jPanelPegaFicha.setLayout(jPanelPegaFichaLayout);
        jPanelPegaFichaLayout.setHorizontalGroup(
            jPanelPegaFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPegaFichaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelPegaFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPegaFichaLayout.createSequentialGroup()
                        .addComponent(jLabelFichas)
                        .addGap(18, 18, 18)
                        .addComponent(txtTabelaFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPegaFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelPegaFichaLayout.setVerticalGroup(
            jPanelPegaFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPegaFichaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPegaFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFichas)
                    .addComponent(txtTabelaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPegaFicha)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelConectaBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelExporta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelPegaFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelConectaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanelPegaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelExporta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnConectaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectaMouseClicked
        ValidaConexao();

        if (conexao == 1) {
            txtHost.setEditable(false);
            txtUsuario.setEditable(false);
            txtPassword.setEditable(false);
            txtDatabase.setEditable(false);
            btnConecta.setEnabled(false);

            txtTabelaFicha.setEditable(true);
            btnPegaFicha.setEnabled(true);
        }

    }//GEN-LAST:event_btnConectaMouseClicked

    private void btnConectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConectaActionPerformed

    private void btnExportaFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportaFichaMouseClicked
        txtLog.append("\nInicio da exportação !");
        try {
            exportaFicha();
        } catch (SQLException | IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtLog.append("\nTermino da exportação !");
        JOptionPane.showMessageDialog(null, "Termino da exportação !");
    }//GEN-LAST:event_btnExportaFichaMouseClicked

    private void btnExportaFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportaFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportaFichaActionPerformed

    private void btnPegaFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPegaFichaMouseClicked
        try {
            PegaFicha();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (conexao == 2) {
            txtTabelaFicha.setEditable(false);
            btnPegaFicha.setEnabled(false);
            btnExportaFicha.setEnabled(true);

        }

    }//GEN-LAST:event_btnPegaFichaMouseClicked

    private void btnPegaFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegaFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPegaFichaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConecta;
    private javax.swing.JButton btnExportaFicha;
    private javax.swing.JButton btnPegaFicha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFichas;
    private javax.swing.JPanel jPanelConectaBanco;
    private javax.swing.JPanel jPanelExporta;
    private javax.swing.JPanel jPanelLog;
    private javax.swing.JPanel jPanelPegaFicha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTabelaFicha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("CallToPrintStackTrace")
    private void ValidaConexao() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        String hostname = txtHost.getText();
        String usuario = txtUsuario.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String database = txtDatabase.getText();

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            txtLog.append("Não foi possível criar uma instância para o Driver");
            System.out.println("Não foi possivel criar uma instância para o Driver");
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + hostname + "/"
                    + database + "?" + "user=" + usuario + "&password=" + password);

            stmt = conn.prepareStatement("SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = '" + database + "'");
            stmt.executeQuery();
            rs = stmt.getResultSet();

            if (rs.next()) {
                txtLog.append("Conectado ao banco de dados " + database + "!");
                JOptionPane.showMessageDialog(null, "Conectado ao banco de dados " + database + "!");
                System.out.println("Conectado ao banco de dados " + database + "!");
                conexao = 1;
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            txtLog.append("\nErro: " + e.getMessage());
            System.err.println("Erro: " + e.getMessage());
            conexao = 0;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException sEx) {
                sEx.printStackTrace();
            }
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    private void PegaFicha() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        String hostname = txtHost.getText();
        String usuario = txtUsuario.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String database = txtDatabase.getText();
        String tabela = txtTabelaFicha.getText();

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            txtLog.append("\nNão foi possível criar uma instância para o Driver");
            System.out.println("Não foi possivel criar uma instância para o Driver");
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + hostname + "/"
                    + database + "?" + "user=" + usuario + "&password=" + password);

            stmt = conn.prepareStatement("SELECT COUNT(*) FROM " + tabela);

            stmt.executeQuery();
            rs = stmt.getResultSet();

            if (rs.next()) {
                txtLog.append("\nTabela localizada, contando número de fichas");
                System.out.println(rs.getInt(1));
                numeroFichas = rs.getInt(1);

            }
            if (numeroFichas != 0) {
                stmt = conn.prepareStatement("SELECT * FROM " + tabela);
                stmt.executeQuery();
                rs = stmt.getResultSet();

                while (rs.next()) {
                    ArquivoFichaIncidente ficha = new ArquivoFichaIncidente();
                    ficha.arquivo = rs.getString(1);
                    ficha.ficha = rs.getString(2);
                    ficha.incidente = rs.getString(3);
                    fichas.add(ficha);
                    //txtLog.append("\nAdicionando Ficha: " + ficha.arquivo + " " + ficha.ficha + " " + ficha.incidente + ";");
                }
                fichas.forEach((f) -> {
                    txtLog.append("\nImprimindo Ficha: " + f.arquivo + " " + f.ficha + " " + f.incidente + ";");
                });
                conexao = 2;
                txtLog.append("\nTotal de " + numeroFichas + " fichas");
                txtLog.append("\nCarregamento de fichas terminado !");
            } else {
                txtLog.append("\nNão há fichas a serem exportadas !");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            txtLog.append("\nErro: " + e.getMessage());
            System.err.println("Erro: " + e.getMessage());
            conexao = 1;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException sEx) {
                sEx.printStackTrace();
            }
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    private void exportaFicha() throws SQLException, IOException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PreparedStatement stmtAndamento = null;
        ResultSet rsAndamento = null;
        Connection conn = null;

        String hostname = txtHost.getText();
        String usuario = txtUsuario.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String database = txtDatabase.getText();
        String tabela = txtTabelaFicha.getText();

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            txtLog.append("\nNão foi possível criar uma instância para o Driver");
            System.out.println("Não foi possivel criar uma instância para o Driver");
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + hostname + "/"
                    + database + "?" + "user=" + usuario + "&password=" + password);
            for (ArquivoFichaIncidente f : fichas) {
                stmt = conn.prepareStatement("SELECT pro.arquivo,pro.ficha,pro.incidente, ifnull(acao.descricao,''),"
                        + "ifnull(pro.numero_processo,''), "
                        + "ifnull(autor.nome,''), "
                        + "ifnull(reu.nome,'')"
                        + "FROM cad_processo pro\n"
                        + "LEFT JOIN tab_acao acao\n"
                        + "ON pro.acao=acao.sigla\n"
                        + "LEFT JOIN cad_pessoa autor\n"
                        + "ON pro.primeiro_autor=autor.codigo\n"
                        + "LEFT JOIN cad_pessoa reu\n"
                        + "ON pro.primeiro_reu=reu.codigo\n"
                        + "WHERE pro.arquivo='" + f.arquivo
                        + "' AND pro.ficha='" + f.ficha
                        + "' AND pro.incidente='0" + f.incidente
                        + "'; ");

                stmt.executeQuery();
                rs = stmt.getResultSet();

                while (rs.next()) {
                    String caminhoPasta = "C://HSBC//pastas/" + f.arquivo + f.ficha + "_0" + f.incidente;
                    String caminhoPastaHtml = "file://c:/HSBC/pastas/" + f.arquivo + f.ficha + "_0" + f.incidente;
                    String andamento = "";
                    new File(caminhoPasta).mkdir();
                    System.out.println("Criando Pasta: " + rs.getString(1) + rs.getString(2) + "_0" + rs.getString(3));
                    txtLog.append("\nCriando Pasta: " + rs.getString(1) + rs.getString(2) + "_0" + rs.getString(3));
                    txtLog.update(txtLog.getGraphics());
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());

                    stmtAndamento = conn.prepareStatement("SELECT tra.data_hora_lan,"
                            + "ifnull(eve.descricao,''), "
                            + "ifnull(tra.texto,''), "
                            + "ifnull(tra.texto_associado,'') "
                            + "FROM cad_tramitacao tra\n"
                            + "LEFT JOIN tab_evento eve\n"
                            + "ON tra.evento=eve.sigla\n"
                            + "WHERE tra.arquivo='" + f.arquivo
                            + "' AND tra.ficha='" + f.ficha
                            + "' AND tra.incidente='0" + f.incidente
                            + "'; ");

                    stmtAndamento.executeQuery();
                    rsAndamento = stmtAndamento.getResultSet();

                    while (rsAndamento.next()) {

                        if (rsAndamento.getString(4).isEmpty() || !rsAndamento.getString(4).substring(0,1).equalsIgnoreCase("#")) {
                            andamento += "\n"
                                    + "         <tr>\n"
                                    + "         	<td style='vertical-align:top;width:15%'>" + rsAndamento.getString(1) + " </td>\n"
                                    + "		        <td style='vertical-align:top;width:85%'> " + rsAndamento.getString(2) + " <br/> " + rsAndamento.getString(3) + " </td>\n"
                                    + "         </tr>\n";
                        } else {
                            andamento += ""
                                    + "         <tr>\n"
                                    + "         	<td style='vertical-align:top;width:15%'>" + rsAndamento.getString(1) + " :</td>\n"
                                    + "		        <td style='vertical-align:top;width:85%'> " + rsAndamento.getString(2) + " <br/> " + rsAndamento.getString(3) + " <br/> "
                                    + "\n                   Documento: <a target='_blank' href='" + caminhoPastaHtml + "/" + rsAndamento.getString(4).substring(17) + "'>" + rsAndamento.getString(4).substring(17) + "</a></td>\n"
                                    + "         </tr>\n";
                            String arquivoOrigem = "W://arq3c_docs"
                                    + "//" + rsAndamento.getString(4).substring(7, 9)
                                    + "//" + rsAndamento.getString(4).substring(9, 11)
                                    + "//" + rsAndamento.getString(4).substring(11, 13)
                                    + "//" + rsAndamento.getString(4).substring(7, 15) + ".DAT";
                            String arquivoDestino = caminhoPasta + "//" + rsAndamento.getString(4).substring(17);
                            File origem = new File(arquivoOrigem);
                            File destino = new File(arquivoDestino);
                            txtLog.append("\nCopiando arquivo : " + rsAndamento.getString(4).substring(17));
                            try {
                                Files.copy(origem.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);

                            } catch (IOException e) {
                            }
                        }
                        System.out.println(andamento);

                    }
                    String FILENAME = caminhoPasta + "/index.html";

                    BufferedWriter bw = null;
                    FileWriter fw = null;

                    try {
                        String data = "<html>\n"
                                + "<head>\n"
                                + "     <meta http-equiv='Content-Type' content='text/html; charset=utf-8'></meta>\n"
                                + "</head>\n"
                                + "<body>\n"
                                + "     <table >\n"
                                + "         <tr>\n"
                                + "         	<td style='vertical-align:top;width:15%'>FICHA :</td>\n"
                                + "		<td style='vertical-align:top;width:85%'><b>" + rs.getString(1) + rs.getString(2) + "_0" + rs.getString(3) + "</b></td>\n"
                                + "         </tr>\n"
                                + "         <tr>\n"
                                + "         	<td style='vertical-align:top;width:15%'>AÇÃO :</td>\n"
                                + "		<td style='vertical-align:top;width:85%'> " + rs.getString(4) + " " + rs.getString(5) + "</td>\n"
                                + "         </tr>\n"
                                + "         <tr>\n"
                                + "		<td style='vertical-align:top;width:15%'>AUTOR :</td>\n"
                                + "		<td style='vertical-align:top;width:85%'>" + rs.getString(6) + "</td>\n"
                                + "         </tr>\n"
                                + "         <tr>\n"
                                + "		<td style='vertical-align:top;width:15%'>REU :</td>\n"
                                + "		<td style='vertical-align:top;width:85%'>" + rs.getString(7) + "</td>\n"
                                + "         </tr>\n"
                                + "         <tr>\n"
                                + "		<td style='vertical-align:top;width:15%'>ANDAMENTOS</td>\n"
                                + "		<td style='vertical-align:top;width:85%'>---------------------------------------------------------------------------------------------------------------------------------------------------------------</td>\n"
                                + "         </tr>\n"
                                + andamento
                                + "\n     </table>\n"
                                + "</body>\n"
                                + "</html>";
                        File file = new File(FILENAME);
                        // if file doesnt exists, then create it
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        // true = append file
                        fw = new FileWriter(file.getAbsoluteFile(), true);
                        bw = new BufferedWriter(fw);

                        bw.write(data);
                        txtLog.append("\nArquivo index.html criado");
                        txtLog.update(txtLog.getGraphics());
                        txtLog.setCaretPosition(txtLog.getDocument().getLength());
                        System.out.println("Arquivo Criado");

                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (bw != null) {
                            bw.close();
                        }
                        if (fw != null) {
                            fw.close();
                        }
                    }

                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            txtLog.append("\nErro: " + e.getMessage());
            System.err.println("Erro: " + e.getMessage());
            conexao = 1;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException sEx) {
                sEx.printStackTrace();
            }
        }
    }
}
