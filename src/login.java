import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }
    
    String url = "jdbc:mysql://localhost:3306/convenience";
    String user = "root";
    String password = "";

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EmployeeID = new javax.swing.JTextField();
        FullName = new javax.swing.JTextField();
        ContactNumber = new javax.swing.JTextField();
        LogIn = new javax.swing.JButton();
        jLabelCreateAccount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");

        jPanel1.setBackground(new java.awt.Color(213, 199, 163));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel1.setText("CONVENIENCE STORE");

        jLabel2.setBackground(new java.awt.Color(246, 240, 240));
        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel2.setText("INVENTORY SYSTEM");

        EmployeeID.setBackground(new java.awt.Color(246, 240, 240));
        EmployeeID.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        EmployeeID.setText("Your Employee's ID");
        EmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeIDActionPerformed(evt);
            }
        });

        FullName.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        FullName.setText("Your Full Name");

        ContactNumber.setBackground(new java.awt.Color(246, 240, 240));
        ContactNumber.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        ContactNumber.setText("Your Contact Number");
        ContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNumberActionPerformed(evt);
            }
        });

        LogIn.setBackground(new java.awt.Color(246, 240, 240));
        LogIn.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        LogIn.setText("Log In");
        LogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        jLabelCreateAccount.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelCreateAccount.setText("create new employee account");
        jLabelCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 201, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCreateAccount)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(EmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCreateAccount)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNumberActionPerformed

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed

        String employeeID = EmployeeID.getText().trim();
        String fullName = FullName.getText().trim();
        String contactNumber = ContactNumber.getText().trim();

        if (employeeID.isEmpty() || fullName.isEmpty() || contactNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        try {
            // Establish connection to the database
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL query to check if the employee exists
            String query = "SELECT * FROM registration WHERE registrationID = ? AND name = ? AND contact = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, employeeID);
            stmt.setString(2, fullName);
            stmt.setString(3, contactNumber);

            // Execute the query and get the result
            ResultSet rs = stmt.executeQuery();

            // Check if the employee exists
            if (rs.next()) {
                // Login successful
                JOptionPane.showMessageDialog(this, "Login successful!");
                // You can now proceed to the main application screen
                // For example, you can hide the login screen and show the next screen
                this.setVisible(false);
                this.dispose();
                
                 new dashboard().setVisible(true);
                // new MainAppScreen().setVisible(true); // You can replace this with your actual main screen class
            } else {
                // Invalid credentials
                JOptionPane.showMessageDialog(this, "Invalid Employee ID, Full Name, or Contact Number.");
            }

            // Close the connection
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error, please try again.");
        }
    }//GEN-LAST:event_LogInActionPerformed

    private void EmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeIDActionPerformed

    private void jLabelCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccountMouseClicked
        // TODO add your handling code here:
        signup acc = new signup();
        acc.setVisible(true);
        acc.pack();
        acc.setLocationRelativeTo(null);
        acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelCreateAccountMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContactNumber;
    private javax.swing.JTextField EmployeeID;
    private javax.swing.JTextField FullName;
    private javax.swing.JButton LogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCreateAccount;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
