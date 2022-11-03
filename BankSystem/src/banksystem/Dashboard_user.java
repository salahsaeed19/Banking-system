package banksystem;

import javax.swing.JOptionPane;

public class Dashboard_user extends javax.swing.JFrame {

    public Dashboard_user() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelWellcome = new javax.swing.JLabel();
        ButtonAddNewUser = new javax.swing.JButton();
        ButtonAddTransaction = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelWellcome.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        LabelWellcome.setText("Welcome  ");

        ButtonAddNewUser.setBackground(new java.awt.Color(0, 0, 0));
        ButtonAddNewUser.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        ButtonAddNewUser.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAddNewUser.setText("Add New User");
        ButtonAddNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddNewUserActionPerformed(evt);
            }
        });

        ButtonAddTransaction.setBackground(new java.awt.Color(0, 0, 0));
        ButtonAddTransaction.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        ButtonAddTransaction.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAddTransaction.setText("Add New Transaction");
        ButtonAddTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddTransactionActionPerformed(evt);
            }
        });

        ButtonBack.setBackground(new java.awt.Color(0, 0, 0));
        ButtonBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("User Bank");

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        UsernameLabel.setText("  ");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("show Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonAddNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonAddTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(LabelWellcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 507, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelWellcome)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLabel))
                .addGap(28, 28, 28)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(ButtonAddNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(ButtonAddTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        
        BankSystem.dashboard_user.setVisible(false);
        BankSystem.login.setVisible(true);
  
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonAddNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddNewUserActionPerformed
        
        BankSystem.dashboard_user.setVisible(false);
        BankSystem.newuser.setVisible(true);
        
    }//GEN-LAST:event_ButtonAddNewUserActionPerformed

    private void ButtonAddTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddTransactionActionPerformed
        String accessible = JOptionPane.showInputDialog("Enter the secret number");
        int password = Integer.parseInt(accessible);
        
        if(password == 1111){
            BankSystem.dashboard_user.setVisible(false);
            BankSystem.transction.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Invalid Password", "Wrong Login", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ButtonAddTransactionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Person current_user = Person.persons.get(BankSystem.userid);
        UsernameLabel.setText(current_user.first_name);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Dashboard_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        UsernameLabel.setText(current_user.first_name);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddNewUser;
    private javax.swing.JButton ButtonAddTransaction;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JLabel LabelWellcome;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
