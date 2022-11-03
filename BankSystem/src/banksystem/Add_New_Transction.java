package banksystem;

import javax.swing.JOptionPane;

public class Add_New_Transction extends javax.swing.JFrame {

    public Add_New_Transction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Text_id = new javax.swing.JTextField();
        Text_amount = new javax.swing.JTextField();
        Text_currency = new javax.swing.JTextField();
        ComboBox_typeTrancation = new javax.swing.JComboBox<>();
        Button_add_transaction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setText("Bank | Add a New Transaction ");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("User Bank");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("ID Nationaly ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Type Transcation ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Amount");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Currency");

        Text_id.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        Text_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_idActionPerformed(evt);
            }
        });

        Text_amount.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N

        Text_currency.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N

        ComboBox_typeTrancation.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ComboBox_typeTrancation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposit", "Pull" }));

        Button_add_transaction.setBackground(new java.awt.Color(0, 0, 0));
        Button_add_transaction.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Button_add_transaction.setForeground(new java.awt.Color(255, 255, 255));
        Button_add_transaction.setText("Add");
        Button_add_transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_add_transactionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_add_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Text_id)
                    .addComponent(Text_amount)
                    .addComponent(Text_currency)
                    .addComponent(ComboBox_typeTrancation, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboBox_typeTrancation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Text_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Text_currency, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(Button_add_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_idActionPerformed

    private void Button_add_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_add_transactionActionPerformed
        
        int new_add = JOptionPane.showOptionDialog(null, "Are you sure!", "Add Transction", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
       
        if(new_add == 0){
            int id_user = Integer.parseInt(Text_id.getText());
            String type_transaction = (String) ComboBox_typeTrancation.getSelectedItem();
            double amount = Integer.parseInt(Text_amount.getText());
            Boolean is_exist = true;
            Person person;
            for(Person requied_user:Person.persons){

                if(requied_user.id == id_user){
                    is_exist = false;
                    if("Deposit".equals(type_transaction)){
                        if(amount > 0){
                            requied_user.amount += amount;
                        }
                        else{
                             JOptionPane.showMessageDialog(this, "Please insert amount greater than 0", "Error Amount", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        if(amount <= requied_user.amount){
                              requied_user.amount -= amount;
                        }
                        else{
                           JOptionPane.showMessageDialog(this, "Sorry , There is not enough balance", "Error Balance", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                }
            }
            if(is_exist){
                JOptionPane.showMessageDialog(this, "Please insert ID True to client is exists", "Client Not Found", JOptionPane.ERROR_MESSAGE);
            }
            
            BankSystem.transction.setVisible(false);
            BankSystem.dashboard_user.setVisible(true);
        }
        
    }//GEN-LAST:event_Button_add_transactionActionPerformed

    
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
            java.util.logging.Logger.getLogger(Add_New_Transction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_New_Transction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_New_Transction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_New_Transction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_New_Transction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add_transaction;
    private javax.swing.JComboBox<String> ComboBox_typeTrancation;
    private javax.swing.JTextField Text_amount;
    private javax.swing.JTextField Text_currency;
    private javax.swing.JTextField Text_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
