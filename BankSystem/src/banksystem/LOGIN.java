package banksystem;

import javax.swing.JOptionPane;

public class LOGIN extends javax.swing.JFrame {

    public LOGIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelWellcome = new javax.swing.JLabel();
        LabelUsername = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        TextFieldUsername = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        Button_Login = new javax.swing.JButton();
        UserFileld = new javax.swing.JLabel();
        PassFileld = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LabelWellcome.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        LabelWellcome.setText("Welcome To AFS Bank System");

        LabelUsername.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        LabelUsername.setText("User Name");

        LabelPassword.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        LabelPassword.setText("Password");

        TextFieldUsername.setFont(new java.awt.Font("Tahoma", 3, 28)); // NOI18N
        TextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsernameActionPerformed(evt);
            }
        });

        PasswordField.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        Button_Login.setBackground(new java.awt.Color(0, 0, 0));
        Button_Login.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Button_Login.setForeground(new java.awt.Color(255, 255, 255));
        Button_Login.setText("Login ");
        Button_Login.setToolTipText("");
        Button_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LoginActionPerformed(evt);
            }
        });

        UserFileld.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        PassFileld.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Button_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelUsername)
                            .addComponent(LabelPassword))
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PassFileld, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(TextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(PasswordField)
                            .addComponent(UserFileld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(LabelWellcome)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(LabelWellcome)
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsername)
                    .addComponent(TextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(LabelPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserFileld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassFileld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        setBounds(0, 0, 1280, 834);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsernameActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void Button_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LoginActionPerformed
        Boolean error_data = true;
        // cheack is empty username , password
        if (TextFieldUsername.getText().isEmpty()) {
            UserFileld.setText("This field is Required");
        }
        if (PasswordField.getText().isEmpty()) {
            PassFileld.setText("This field is Required");
        }
        
        if(!TextFieldUsername.getText().isEmpty() && !PasswordField.getText().isEmpty()){
                UserFileld.setText("");
                PassFileld.setText("");
                int index = -1;
                for(Person p:Person.persons){
                    index++; 
                    if(p.first_name.equals(TextFieldUsername.getText()) && p.password.equals(PasswordField.getText())){
                        BankSystem.userid = index;
                        error_data = false;
                        if(p.is_user){
                            BankSystem.login.setVisible(false);
                            BankSystem.dashboard_user.setVisible(true);
                        }
                        else{
                            BankSystem.login.setVisible(false);
                            BankSystem.profile_user.setVisible(true);
                        }  
                    } // end if to comppersion equale
                }  // end for loop 
                if(error_data){
                    JOptionPane.showMessageDialog(this, "Invalid User Name Or Password", "Wrong Login", JOptionPane.ERROR_MESSAGE);
                }
                
        }


    }//GEN-LAST:event_Button_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Login;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JLabel LabelWellcome;
    private javax.swing.JLabel PassFileld;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField TextFieldUsername;
    private javax.swing.JLabel UserFileld;
    // End of variables declaration//GEN-END:variables
}
