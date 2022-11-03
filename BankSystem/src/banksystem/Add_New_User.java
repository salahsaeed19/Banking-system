package banksystem;

import javax.swing.JOptionPane;

public class Add_New_User extends javax.swing.JFrame {

    public Add_New_User() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LabelBank_add = new javax.swing.JLabel();
        LabelFirstname = new javax.swing.JLabel();
        Text_firstname = new javax.swing.JTextField();
        LabelLastname = new javax.swing.JLabel();
        Text_Lastname = new javax.swing.JTextField();
        LabelBrithdate = new javax.swing.JLabel();
        LabelGender = new javax.swing.JLabel();
        RadioMale = new javax.swing.JRadioButton();
        RadioFemale = new javax.swing.JRadioButton();
        LabelAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_address = new javax.swing.JTextArea();
        LabelAccounttype = new javax.swing.JLabel();
        NationalField = new javax.swing.JTextField();
        LabelNationalid = new javax.swing.JLabel();
        ComboBox_account_type = new javax.swing.JComboBox<>();
        Button_add_new_user = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        LabelNationalid1 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelBank_add.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        LabelBank_add.setText("Bank | Add New System ");

        LabelFirstname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelFirstname.setText("First Name ");

        Text_firstname.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Text_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_firstnameActionPerformed(evt);
            }
        });

        LabelLastname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelLastname.setText("Last Name ");

        Text_Lastname.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N

        LabelBrithdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelBrithdate.setText("Brith Date");

        LabelGender.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelGender.setText("Gender");

        buttonGroup1.add(RadioMale);
        RadioMale.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RadioMale.setText("Male");
        RadioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioFemale);
        RadioFemale.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RadioFemale.setText("Female");

        LabelAddress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelAddress.setText("Address");

        TextArea_address.setColumns(20);
        TextArea_address.setFont(new java.awt.Font("Courier New", 3, 22)); // NOI18N
        TextArea_address.setRows(5);
        jScrollPane1.setViewportView(TextArea_address);

        LabelAccounttype.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelAccounttype.setText("Account Type");

        NationalField.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        NationalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalFieldActionPerformed(evt);
            }
        });

        LabelNationalid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelNationalid.setText("National ID");

        ComboBox_account_type.setBackground(new java.awt.Color(204, 255, 255));
        ComboBox_account_type.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComboBox_account_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving account", "Cash Card", "Easy Life", "Signature" }));
        ComboBox_account_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_account_typeActionPerformed(evt);
            }
        });

        Button_add_new_user.setBackground(new java.awt.Color(0, 0, 0));
        Button_add_new_user.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button_add_new_user.setForeground(new java.awt.Color(255, 255, 255));
        Button_add_new_user.setText("Add New User");
        Button_add_new_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_add_new_userActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("User Bank");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));

        LabelNationalid1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelNationalid1.setText("Password");

        PasswordField.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelFirstname)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelBrithdate)
                                .addComponent(LabelLastname)
                                .addComponent(LabelGender)
                                .addComponent(LabelAddress)))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(Text_Lastname)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RadioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(RadioFemale))
                                .addComponent(Text_firstname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelAccounttype)
                            .addComponent(LabelNationalid)
                            .addComponent(LabelNationalid1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_add_new_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ComboBox_account_type, 0, 262, Short.MAX_VALUE)
                                        .addComponent(NationalField)))
                                .addGap(38, 38, 38)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelBank_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBank_add, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFirstname)
                    .addComponent(Text_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelAccounttype)
                    .addComponent(ComboBox_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelLastname)
                    .addComponent(NationalField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNationalid))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelBrithdate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox3)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelNationalid1)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RadioMale, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(LabelGender))
                    .addComponent(RadioFemale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(LabelAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_add_new_user, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioMaleActionPerformed
        
    }//GEN-LAST:event_RadioMaleActionPerformed

    private void Text_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_firstnameActionPerformed

    private void Button_add_new_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_add_new_userActionPerformed
        
        int new_add = JOptionPane.showOptionDialog(null, "Are you sure!", "Add User", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
        
        String first_name = Text_firstname.getText();
        String last_name = Text_Lastname.getText();
        String address = TextArea_address.getText();
        String national_id = NationalField.getText();
        String password = PasswordField.getText();
        String account_type = (String) ComboBox_account_type.getSelectedItem();
        
        String gender ;
        
        if (RadioMale.isSelected()) {
            gender = "male";
        } else {
            gender = "female";
        }
        
        Person new_person = new Person(first_name , last_name , false , gender ,address , password , account_type);
        Boolean result = Person.persons.add(new_person);
        
        if(new_add == 0){
            BankSystem.newuser.setVisible(false);
            BankSystem.dashboard_user.setVisible(true);
        }
        
    }//GEN-LAST:event_Button_add_new_userActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void NationalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalFieldActionPerformed

    private void ComboBox_account_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_account_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_account_typeActionPerformed

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
            java.util.logging.Logger.getLogger(Add_New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_New_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add_new_user;
    private javax.swing.JComboBox<String> ComboBox_account_type;
    private javax.swing.JLabel LabelAccounttype;
    private javax.swing.JLabel LabelAddress;
    private javax.swing.JLabel LabelBank_add;
    private javax.swing.JLabel LabelBrithdate;
    private javax.swing.JLabel LabelFirstname;
    private javax.swing.JLabel LabelGender;
    private javax.swing.JLabel LabelLastname;
    private javax.swing.JLabel LabelNationalid;
    private javax.swing.JLabel LabelNationalid1;
    private javax.swing.JTextField NationalField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JRadioButton RadioFemale;
    private javax.swing.JRadioButton RadioMale;
    private javax.swing.JTextArea TextArea_address;
    private javax.swing.JTextField Text_Lastname;
    private javax.swing.JTextField Text_firstname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
