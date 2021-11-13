/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.hanu.chatclient;

import java.net.Socket;
import javax.swing.JOptionPane;
import vn.edu.hanu.chatmessagecontroller.ChatMessageSocket;

/**
 *
 * @author Minh & Ngoc Anh
 */
public class ChatClientForm extends javax.swing.JFrame {
    ChatMessageSocket messageSocket;

    /**
     * Creates new form ChatClientForm
     */
    public ChatClientForm() {
        initComponents();
        this.setTitle("Client");
        status.setText("Click button to connect a server chat");
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtServerHost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        btnConnect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txpMessageBoard = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("ÁnhMinh 1.1", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Client");

        jSeparator1.setForeground(new java.awt.Color(0, 51, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("ServerHost:");

        txtServerHost.setBackground(new java.awt.Color(204, 204, 255));
        txtServerHost.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtServerHost.setText("127.0.0.1");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Port:");

        txtPort.setBackground(new java.awt.Color(204, 204, 255));
        txtPort.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPort.setText("9877");
        txtPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortActionPerformed(evt);
            }
        });

        btnConnect.setBackground(new java.awt.Color(204, 204, 255));
        btnConnect.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        txpMessageBoard.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txpMessageBoard.setForeground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setViewportView(txpMessageBoard);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Message:");

        txtMessage.setBackground(new java.awt.Color(204, 204, 255));
        txtMessage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(204, 204, 255));
        btnSend.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        status.setForeground(new java.awt.Color(255, 0, 0));
        status.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtServerHost, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConnect))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtServerHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConnect))
                .addGap(2, 2, 2)
                .addComponent(status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnSend))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        try {
            int port = Integer.parseInt(txtPort.getText());
            Socket socket = new Socket(txtServerHost.getText(), port);
            
            messageSocket = new ChatMessageSocket(socket, txpMessageBoard);
            status.setText("Connected successfully !!!");          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Server Might Be Down!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        if (txtMessage.getText().equals("")) {
            return;
        }
        messageSocket.send(txtMessage.getText());
        //clear the send text field after clikc button Send
        txtMessage.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        if (txtMessage.getText().equals("")) {
            return;
        }
        messageSocket.send(txtMessage.getText());
        //clear the send text field after clikc button Send
        txtMessage.setText("");
    }//GEN-LAST:event_txtMessageActionPerformed

    private void txtPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortActionPerformed

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
            java.util.logging.Logger.getLogger(ChatClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatClientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel status;
    private javax.swing.JTextPane txpMessageBoard;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtServerHost;
    // End of variables declaration//GEN-END:variables
}
