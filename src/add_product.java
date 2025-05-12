import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class add_product extends javax.swing.JFrame {
public add_product() {
        initComponents();
         this.setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabeladdproduct = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jButtonAddProduct = new javax.swing.JButton();
        jLabelProductId = new javax.swing.JLabel();
        jLabelProductName = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelExpirationDate = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtExpDate = new javax.swing.JTextField();
        jLabeltitle1 = new javax.swing.JLabel();
        jLabeltitle2 = new javax.swing.JLabel();
        jButtonDashboard = new javax.swing.JButton();
        jButtonProduct = new javax.swing.JButton();
        jButtonReports = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD PPRODUCT");

        jPanel1.setBackground(new java.awt.Color(213, 199, 163));

        jPanel2.setBackground(new java.awt.Color(242, 226, 177));

        jLabeladdproduct.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabeladdproduct.setText("ADD PRODUCT");

        txtId.setBackground(new java.awt.Color(246, 240, 240));
        txtId.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jButtonAddProduct.setBackground(new java.awt.Color(246, 240, 240));
        jButtonAddProduct.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jButtonAddProduct.setText("ADD PRODUCT");
        jButtonAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProductActionPerformed(evt);
            }
        });

        jLabelProductId.setBackground(new java.awt.Color(246, 240, 240));
        jLabelProductId.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabelProductId.setText("Product ID:");

        jLabelProductName.setBackground(new java.awt.Color(246, 240, 240));
        jLabelProductName.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabelProductName.setText("Product Name:");

        jLabelPrice.setBackground(new java.awt.Color(246, 240, 240));
        jLabelPrice.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabelPrice.setText("Price:");

        jLabelExpirationDate.setBackground(new java.awt.Color(246, 240, 240));
        jLabelExpirationDate.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabelExpirationDate.setText("Expiration Date:");

        txtPrice.setBackground(new java.awt.Color(246, 240, 240));
        txtPrice.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(246, 240, 240));
        txtName.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtExpDate.setBackground(new java.awt.Color(246, 240, 240));
        txtExpDate.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        txtExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabeladdproduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(163, 163, 163))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelExpirationDate)
                            .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabeladdproduct)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelExpirationDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButtonAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabeltitle1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabeltitle1.setText("CONVENIENCE STORE");

        jLabeltitle2.setBackground(new java.awt.Color(246, 240, 240));
        jLabeltitle2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabeltitle2.setText("INVENTORY SYSTEM");

        jButtonDashboard.setBackground(new java.awt.Color(246, 240, 240));
        jButtonDashboard.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonDashboard.setText("DASHBOARD");
        jButtonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDashboardActionPerformed(evt);
            }
        });

        jButtonProduct.setBackground(new java.awt.Color(246, 240, 240));
        jButtonProduct.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonProduct.setText("PRODUCT");
        jButtonProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductActionPerformed(evt);
            }
        });

        jButtonReports.setBackground(new java.awt.Color(246, 240, 240));
        jButtonReports.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonReports.setText("REPORTS");
        jButtonReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabeltitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabeltitle2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabeltitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabeltitle2)
                .addGap(58, 58, 58)
                .addComponent(jButtonDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonReports, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDashboardActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new dashboard().setVisible(true);
    }//GEN-LAST:event_jButtonDashboardActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpDateActionPerformed

    private void jButtonAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProductActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
        String name = txtName.getText();
        String price = txtPrice.getText();
        String expDate = txtExpDate.getText(); // Format: YYYY-MM-DD
 
        try {
        // Connect to database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/convenience", "root", "");

        // SQL Insert
        String sql = "INSERT INTO product (product_id, product_name, price, expiration_date) VALUES (?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, txtId.getText());
        pst.setString(2, txtName.getText());
        pst.setDouble(3, Double.parseDouble(txtPrice.getText()));
        pst.setDate(4, java.sql.Date.valueOf(txtExpDate.getText())); // Make sure format is YYYY-MM-DD

        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Product Added!");
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
    
    }//GEN-LAST:event_jButtonAddProductActionPerformed

    private void jButtonProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new product().setVisible(true);
    }//GEN-LAST:event_jButtonProductActionPerformed

    private void jButtonReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new reports().setVisible(true);
    }//GEN-LAST:event_jButtonReportsActionPerformed

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
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddProduct;
    private javax.swing.JButton jButtonDashboard;
    private javax.swing.JButton jButtonProduct;
    private javax.swing.JButton jButtonReports;
    private javax.swing.JLabel jLabelExpirationDate;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelProductId;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JLabel jLabeladdproduct;
    private javax.swing.JLabel jLabeltitle1;
    private javax.swing.JLabel jLabeltitle2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtExpDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
